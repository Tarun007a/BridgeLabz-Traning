package com.linkedlist.circularlinkedlist.taskschedular;

public class TaskScheduler {
    private TaskNode head;

    public TaskScheduler() {
        head = null;
    }

    // add at beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        
        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        
        TaskNode temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // add at end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        
        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        
        TaskNode temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        newNode.next = head;
    }

    // add at 
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if(position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;
        int count = 1;

        while(temp.next != head && count < position - 1) {
            temp = temp.next;
            count++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove by id
    public void removeByTaskId(int taskId) {
        if(head == null) return;
        
        if(head.taskId == taskId && head.next == head) {
            head = null;
            return;
        }
        
        if(head.taskId == taskId) {
            TaskNode temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }
        
        TaskNode curr = head;
        while(curr.next != head && curr.next.taskId != taskId) {
            curr = curr.next;
        }
        
        if(curr.next != head) curr.next = curr.next.next;
    }

    // view and move to next
    public void viewCurrentAndMoveNext() {
        if(head == null) return;

        System.out.println(head.taskId + " " + head.taskName + " " + head.priority + " " + head.dueDate);
        head = head.next;
    }

    // display all 
    public void displayTasks() {
        if(head == null) return;
        
        System.out.println(head.taskId + " " + head.taskName + " " + head.priority + " " + head.dueDate);
        
        TaskNode temp = head.next;
        while(temp != head) {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        }
    }

    // search by priority
    public void searchByPriority(int priority) {
        if(head == null) return;
        
        System.out.println(head.taskId + " " + head.taskName + " " + head.priority + " " + head.dueDate);
        TaskNode temp = head.next;
        
        while(temp != head) {
            if(temp.priority == priority) {
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtBeginning(1, "Task 1", 1, "1-1-2026");
        scheduler.addAtEnd(2, "Task 2", 2, "2-1-2026");
        scheduler.addAtEnd(3, "Task 3", 3, "3-1-2026");
        
        scheduler.addAtPosition(2, 4, "Task 4", 4, "4-1-2026");

        scheduler.displayTasks();

        scheduler.viewCurrentAndMoveNext();

        scheduler.displayTasks();

        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        scheduler.displayTasks();
    }
}
