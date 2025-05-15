import java.util.Arrays;
public class linear {
     
    public static void main(String[] args) {
    int[] arr = {23, 45, 12, 5, 89, 4};
    int a = 4;
    int flag = 34;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a) {
        flag = 1;
        break;
      }
    }

    if (flag == 1) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }



}
