import java.util.*;
public class insertionsort {
     
 

 public static void main (String[] args) {
    int[] arr = {9,4,3,1,8,5,0,7,6};
    
    for(int i=1;i<arr.length;i++){
      int ele = arr[i];
      int j= i-1;
      while(j>=0 && arr[j]>ele){
        arr[j+1]=arr[j];
        j--;
        
        
      } 
      arr[j+1]=ele;
      
    }
    System.out.println(Arrays.toString(arr));
 }


}
