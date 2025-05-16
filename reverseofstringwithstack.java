import java.util.*;
public class reverseofstringwithstack {
     public static void main(String[] args) {
         
        String myString = " hello";
        Stack<Character> st = new Stack<>();  
        String reverse = "" ;

         
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            st.push(ch);
        }
        
        for (int i =0 ; i<myString.length();i++){
          reverse = reverse + st.pop();
        }
        System.out.println(reverse);

        
        
    }


}
