package com.linkedlist.singlylinkedlist.socialmedia;

public class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
