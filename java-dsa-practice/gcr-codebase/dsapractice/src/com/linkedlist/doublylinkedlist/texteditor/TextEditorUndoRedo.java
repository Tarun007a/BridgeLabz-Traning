package com.linkedlist.doublylinkedlist.texteditor;

public class TextEditorUndoRedo {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private int limit = 10;

    public TextEditorUndoRedo() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public void addState(String content) {
        TextStateNode newNode = new TextStateNode(content);

        if(head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            size = 1;
            return;
        }

        if(current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countNodes();
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        if(size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if(current != null && current.prev != null) current = current.prev;
    }

    public void redo() {
        if(current != null && current.next != null) current = current.next;
    }

    public void displayCurrentState() {
        if(current == null) {
            System.out.println("No content");
            return;
        }
        System.out.println("Current Text: " + current.content);
    }

    private int countNodes() {
        int count = 0;
        TextStateNode temp = head;
        
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        return count;
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("Hello");
        editor.displayCurrentState();

        editor.addState("Hello World");
        editor.displayCurrentState();

        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();
    }
}
