import java.util.*;

public class sequency {
    public static void main(String[] args) {
        System.out.println(checkSubSequence("abdac", "abc"));  
    }

    static boolean checkSubSequence(String parent, String f) {
        int i = 0;
        int j = 0;

        while (i < parent.length() && j < f.length()) {
            if (parent.charAt(i) == f.charAt(j)) {
                j++;
            }
            i++;
             
        }

        return j == f.length();   
    }
}
