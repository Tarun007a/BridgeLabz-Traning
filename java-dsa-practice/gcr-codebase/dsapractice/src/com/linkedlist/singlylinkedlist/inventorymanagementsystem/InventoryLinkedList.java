package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import java.util.PriorityQueue;
import java.util.Comparator;

public class InventoryLinkedList {
    private ItemNode head;

    public InventoryLinkedList() {
        head = null;
    }

    public void addAtBeginning(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        
        if(head == null) {
            head = newNode;
            return;
        }
        
        ItemNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
    }

    public void addAtPosition(int position, int itemId, String itemName, int quantity, double price) {
        if(position == 1) {
            addAtBeginning(itemId, itemName, quantity, price);
            return;
        }
        
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        ItemNode temp = head;
        int count = 1;

        while(temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        
        if(temp == null) {
            addAtEnd(itemId, itemName, quantity, price);
            return;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByItemId(int itemId) {
        if(head == null) return;
        
        if(head.itemId == itemId) {
            head = head.next;
            return;
        }
        
        ItemNode temp = head;
        while(temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        
        if(temp.next != null) temp.next = temp.next.next;
    }

    // update quantity
    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        
        while(temp != null) {
            if(temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByItemId(int itemId) {
        ItemNode temp = head;
        
        while(temp != null) {
            if(temp.itemId == itemId) {
                System.out.println(temp.itemId + " " + temp.itemName + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchByItemName(String itemName) {
        ItemNode temp = head;
        
        while(temp != null) {
            if(temp.itemName.equals(itemName)) {
                System.out.println(temp.itemId + " " + temp.itemName + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
        
        System.out.println("Item not found");
    }

    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        
        while(temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        
        System.out.println("Total : " + total);
    }

    public void sortByItemName() {
        PriorityQueue<ItemNode> pq = new PriorityQueue<>((a, b) -> a.itemName.compareTo(b.itemName));
        addAllToQueue(pq);
        rebuildListFromQueue(pq);
    }

    // sort by price using priority queue (ascending)
    public void sortByPrice() {
        PriorityQueue<ItemNode> pq = new PriorityQueue<>((a, b) -> a.itemName.compareTo(b.itemName));
        addAllToQueue(pq);
        rebuildListFromQueue(pq);
    }

    private void addAllToQueue(PriorityQueue<ItemNode> pq) {
        ItemNode temp = head;
        
        while(temp != null) {
            pq.add(temp);
            temp = temp.next;
        }
    }

    private void rebuildListFromQueue(PriorityQueue<ItemNode> pq) {
        head = null;
        ItemNode tail = null;

        while(!pq.isEmpty()) {
            ItemNode node = pq.poll();
            node.next = null;

            if(head == null) {
                head = node;
                tail = node;
            } 
            else {
                tail.next = node;
                tail = node;
            }
        }
    }

    public void displayItems() {
        ItemNode temp = head;
        
        while(temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning(1, "Item 1", 50, 100);
        inventory.addAtEnd(2, "Item 2", 2, 500);
        inventory.addAtEnd(3, "Item 3", 10, 50);
        inventory.addAtPosition(2, 4, "Item 4", 300, 5);

        inventory.displayItems();

        inventory.updateQuantity(3, 150);

        inventory.searchByItemId(2);
        inventory.searchByItemName("Pen");

        inventory.calculateTotalValue();

        inventory.sortByItemName();
        inventory.displayItems();

        inventory.sortByPrice();
        inventory.displayItems();

        inventory.removeByItemId(1);
        inventory.displayItems();
    }
}
