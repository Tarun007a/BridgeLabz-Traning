package com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    public MovieDoublyLinkedList() {
        head = null;
        tail = null;
    }

    // add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if(tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add at specific position (1-based)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
    	if(position < 1) return;
    	
        if(position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        
        MovieNode temp = head;
        int count = 1;

        while(temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // remove by movie title
    public void removeByTitle(String title) {
        if(head == null) {
            return;
        }
        
        if(head.title.equals(title)) {
            head = head.next;
            if(head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }
        
        MovieNode temp = head;
        while(temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        
        if(temp == null) {
            return;
        }
        
        if(temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // search by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        
        while(temp != null) {
            if(temp.director.equals(director)) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    // search by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        
        while(temp != null) {
            if(temp.rating == rating) {
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            }
            temp = temp.next;
        }
    }

    // update rating by title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        
        while(temp != null) {
            if(temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // display forward
    public void displayForward() {
        MovieNode temp = head;
        
        while(temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    // display reverse
    public void displayReverse() {
        MovieNode temp = tail;
        
        while(temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Movie 1", "Director 1", 2010, 9.0);
        list.addAtEnd("Movie 2", "Director 2", 2015, 8.0);
        list.addAtPosition(2, "Movie 3", "Director 3", 2020, 7);

        list.displayForward();

        list.displayReverse();

        list.searchByDirector("Director 3");

        list.updateRating("Moive 3", 9.5);

        list.removeByTitle("Movie 3");

        list.displayForward();
    }
}
