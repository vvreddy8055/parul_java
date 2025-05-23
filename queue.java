import java.util.*;

public class queue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(10);

        mq.enqueue(12);
        mq.enqueue(13);
        mq.enqueue(14);
        mq.enqueue(15);

        mq.printQueue(); // Optional method to see the queue
    }
}

class MyQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
