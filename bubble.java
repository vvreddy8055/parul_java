import java.util.Arrays;

public class bubble {



    
    public static void main(String[] args) {
        int[] arr = {12, 8, 13, 90, 56, 78, 35, 20, 30};
        
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
              if (arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
              }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


}
