package com.linkedlist.singlylinkedlist.socialmedia;

public class SocialMediaLinkedList {
    private UserNode head;

    public SocialMediaLinkedList() {
        head = null;
    }

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    public void addFriend(int userId, int friendId) {
        UserNode user = getUserById(userId);
        
        if(user == null) return;
        
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friends;
        user.friends = newFriend;
    }

    public void removeFriend(int userId, int friendId) {
        UserNode user = getUserById(userId);
        if(user == null || user.friends == null) return;
        
        if(user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }
        
        FriendNode temp = user.friends;
        while(temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }
        
        if(temp.next != null) temp.next = temp.next.next;
    }

    public void displayFriends(int userId) {
        UserNode user = getUserById(userId);
        
        if(user == null) return;
        
        FriendNode temp = user.friends;
        System.out.print("Friends of " + user.name + ": ");
        
        while(temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = getUserById(userId1);
        UserNode u2 = getUserById(userId2);
        
        if(u1 == null || u2 == null) return;
        
        FriendNode f1 = u1.friends;
        System.out.print("Mutual Friends: ");
        
        while(f1 != null) {
            FriendNode f2 = u2.friends;
            while(f2 != null) {
                if(f1.friendId == f2.friendId) System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    public void searchByUserId(int userId) {
        UserNode temp = head;
        
        while(temp != null) {
            if(temp.userId == userId) {
                System.out.println(temp.userId + " " + temp.name + " " + temp.age);
                return;
            }
            temp = temp.next;
        }
        
        System.out.println("User not found");
    }

    public void searchByName(String name) {
        UserNode temp = head;
        
        while(temp != null) {
            if(temp.name.equals(name)) {
                System.out.println(temp.userId + " " + temp.name + " " + temp.age);
                return;
            }
            temp = temp.next;
        }
        
        System.out.println("User not found");
    }

    public void countFriends() {
        UserNode temp = head;
        
        while(temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while(f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    private UserNode getUserById(int userId) {
        UserNode temp = head;
        while(temp != null) {
            if(temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        sm.addUser(1, "Aman", 21);
        sm.addUser(2, "Tarun", 22);
        sm.addUser(3, "Ravi", 23);
        sm.addUser(4, "Ram", 21);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.findMutualFriends(1, 2);

        sm.searchByUserId(3);
        sm.searchByName("Tarun");

        sm.countFriends();

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}

