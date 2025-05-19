import java.util.*;
public class prntallsubstring {
     

 
    public static void main(String[] args) {
        printSubSequence("abcac", 0, "");
    }

    static void printSubSequence(String str, int index, String result) {
        if (index == str.length()) {
            System.out.println(result);
            return;
        }

         
        printSubSequence(str, index + 1, result + str.charAt(index));
        
         
        printSubSequence(str, index + 1, result);
    }


}
