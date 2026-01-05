package com.hashmapandhashset;

public class HashMapImpl {
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 100;
    private Node[] arr;

    public HashMapImpl() {
        arr = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = arr[index];

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node node = new Node(key, value);
        node.next = head;
        arr[index] = node;
    }

    public int get(int key) {
        int index = hash(key);
        Node curr = arr[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = arr[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) arr[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
    	HashMapImpl mp = new HashMapImpl();
    	mp.put(0, 0);
    	mp.put(1, 1);
    	System.out.println(mp.get(1));
    	mp.remove(1);
    	System.out.println(mp.get(1));
    }
}

