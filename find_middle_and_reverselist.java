import java.util.*;

public class find_middle_and_reverselist {
    public static void main(String[] args) {
        mylinkedlist ml = new mylinkedlist();
        ml.add(12);
        ml.add(13);
        ml.add(14);
        ml.add(15);
        ml.add(20);
        ml.add(39);

        System.out.print("Original list: ");
        ml.print();

        ml.findmiddle();

        ml.doreverse();
        System.out.print("Reversed list: ");
        ml.print();
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

     
    int getlength() {
        node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

     
    void findmiddle() {
        if (head == null) {
            System.out.println("No middle element");
            return;
        }

        int middle = getlength() / 2;
        node temp = head;
        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }
        System.out.println("Middle element = " + temp.data);
    }

     
    void doreverse() {
        if (head == null || head.next == null) {
            System.out.println("No reverse needed");
            return;
        }

        node prev = null;
        node curr = head;
        node next;

        while (curr != null) {
            next = curr.next;    
            curr.next = prev;    
            prev = curr;         
            curr = next;         
        }
        head = prev;             
    }

     
    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}
