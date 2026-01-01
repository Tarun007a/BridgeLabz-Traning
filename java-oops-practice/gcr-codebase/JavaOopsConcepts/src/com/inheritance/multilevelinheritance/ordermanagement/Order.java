package com.inheritance.multilevelinheritance.ordermanagement;

public class Order {
    public int orderId;
    public String orderDate;

    // constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // get status
    public String getOrderStatus() {
        return "Order Placed";
    }
}
