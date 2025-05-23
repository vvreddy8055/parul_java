import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 
        
        queue.add(1);
        queue.add(2);
        queue.add(1);
        queue.add(1);

        int flag = 0;

        Stack<Integer> st = new Stack<>();

         
        for (int a : queue) {
            st.push(a);
        }
        System.out.println(queue);

         
        for (int a : queue) {
            if (a != st.pop()) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Not a palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
