public class NewClass1 {

 public static void main (String[] args) {
   int[] arr = {2,7,4,8,3,5,45,34,21,67,94};
   int a=0;
   int count=0;
   for(int i=0;i<arr.length;i++){
     a=a+arr[i];
     count++;
   }
  
   int average= a/count;
   System.out.println(average);
   System.out.println(a/arr.length);
 }
}