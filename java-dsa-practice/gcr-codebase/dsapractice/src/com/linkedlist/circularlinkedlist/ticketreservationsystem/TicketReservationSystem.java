package com.linkedlist.circularlinkedlist.ticketreservationsystem;

public class TicketReservationSystem {
    private TicketNode head;

    public TicketReservationSystem() {
        head = null;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeTicket(int ticketId) {
        if(head == null) return;
        
        if(head.ticketId == ticketId && head.next == head) {
            head = null;
            return;
        }
        
        if(head.ticketId == ticketId) {
            TicketNode temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }
        
        TicketNode curr = head;
        while(curr.next != head && curr.next.ticketId != ticketId) {
            curr = curr.next;
        }
        
        if(curr.next != head) curr.next = curr.next.next;
    }

    public void displayTickets() {
        if(head == null) {
            System.out.println("No tickets booked");
            return;
        }
        
        TicketNode temp = head;
        System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
        temp = temp.next;

        while(temp != head) {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        }
    }

    public void searchByCustomerName(String customerName) {
        if(head == null) return;
        
        TicketNode temp = head;
        if(temp.customerName.equals(customerName)) System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
        temp = temp.next;

        while(temp != head) {
            if(temp.customerName.equals(customerName)) System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        }
    }

    public void searchByMovieName(String movieName) {
        if(head == null) return;
        
        TicketNode temp = head;
        System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
        temp = temp.next;
        
        while(temp != head) {
            if(temp.movieName.equals(movieName)) System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        }
    }

    // count total tickets
    public void countTickets() {
        if(head == null) {
            System.out.println("Total Tickets : 0");
            return;
        }
        
        int count = 1;
        TicketNode temp = head.next;
        
        while(temp != head) {
            count++;
            temp = temp.next;
        } 
        
        System.out.println("Total Tickets : " + count);
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Aman", "Movie 1", "1", "1");
        system.addTicket(2, "Tarun", "Movie 1", "2", "2");
        system.addTicket(3, "Ravi", "Movie 2", "1", "3");

        system.displayTickets();

        system.searchByCustomerName("Aman");

        system.searchByMovieName("Movie 2");

        system.countTickets();

        system.removeTicket(2);

        system.displayTickets();

        system.countTickets();
    }
}
