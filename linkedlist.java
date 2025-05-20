import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        mylinkedlist ml = new mylinkedlist();
        ml.add(12);
        ml.add(13);
        ml.add(14);
        ml.add(15);
        
        System.out.println("Original list:");
        ml.printit();
        
        ml.removelastelement();

        System.out.println("After removing last element:");
        ml.printit();
    }
}

class mylinkedlist {
    node head;

    void add(int xyz) {
        if (head == null) {
            head = new node(xyz);
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node(xyz);
    }

    void printit() {
        if (head == null) {
            System.err.println("No element found");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void removelastelement() {
        if (head == null) {
            System.err.println("No element found");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;  
    }
}

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
