package com.linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {
    private StudentNode head;

    public StudentLinkedList() {
        head = null;
    }

    // add at beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // add at end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // add at index
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
    	if(position < 1) return;
    	
        if(position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;
        int count = 1;

        while(temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null) {
            addAtEnd(rollNumber, name, age, grade);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete by roll number
    public void deleteByRollNumber(int rollNumber) {
        if(head == null) return;
        
        if(head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        
        StudentNode temp = head;
        while(temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // search by roll number
    public void searchStudent(int rollNumber) {
        StudentNode temp = head;
        
        while(temp != null) {
            if(temp.rollNumber == rollNumber) {
                System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        
        System.out.println("Student not found");
    }

    // update grade
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode temp = head;
        
        while(temp != null) {
            if(temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // display all records
    public void displayStudents() {
        StudentNode temp = head;
        
        while(temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Tarun", 21, 'B');
        list.addAtPosition(2, 3, "Ravi", 22, 'C');

        list.displayStudents();

        list.searchStudent(2);

        list.updateGrade(3, 'A');

        list.deleteByRollNumber(1);

        list.displayStudents();
    }
}
