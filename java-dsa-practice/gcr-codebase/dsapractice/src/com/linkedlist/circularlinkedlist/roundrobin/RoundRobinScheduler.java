package com.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobinScheduler {
    private ProcessNode head;

    public RoundRobinScheduler() {
        head = null;
    }

    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        
        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        
        ProcessNode temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        newNode.next = head;
    }
    // remove process by id
    public void removeProcess(int processId) {
        if(head == null) return;
        
        if(head.processId == processId && head.next == head) {
            head = null;
            return;
        }
        
        if(head.processId == processId) {
            ProcessNode temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }
        
        ProcessNode curr = head;
        while(curr.next != head && curr.next.processId != processId) {
            curr = curr.next;
        }
        
        if(curr.next != head) curr.next = curr.next.next;
    }

    public void displayQueue() {
        if(head == null) return;
        ProcessNode temp = head;
        System.out.println(head.processId + temp.remainingTime);
        
        while(temp != head) {
            System.out.println(temp.processId + temp.remainingTime);
            temp = temp.next;
        }
    }

    public void schedule(int timeQuantum) {
        if(head == null) return;
        
        int time = 0;
        int totalWaiting = 0;
        int totalTurnAround = 0;
        int completed = 0;

        ProcessNode current = head;

        while(head != null) {
            if(current.remainingTime > 0) {
                int execTime;
                
                if(current.remainingTime > timeQuantum) execTime = timeQuantum;
                else execTime = current.remainingTime;
                
                current.remainingTime -= execTime;
                time += execTime;
                
                if(current.remainingTime == 0) {
                    current.completionTime = time;
                    int turnAround = current.completionTime;
                    int waiting = turnAround - current.burstTime;
                    totalTurnAround += turnAround;
                    totalWaiting += waiting;
                    completed++;
                    int pid = current.processId;
                    current = current.next;
                    removeProcess(pid);
                    displayQueue();
                    continue;
                }
            }
            
            current = current.next;
            displayQueue();
        }

        System.out.println("Average Waiting Time : " + (double) totalWaiting / completed);
        System.out.println("Average Turn Around Time : " + (double) totalTurnAround / completed);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.displayQueue();

        scheduler.schedule(3);
    }
}
