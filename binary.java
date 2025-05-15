public class binary {
    
public static void main (String[] args) {
  int[] arr= {1,3,4,6,7,8,9,11,13,19,20};
  int a=19;
  
  int start= 0;
  int end = arr.length-1;
  int flag =0;
  while(start<=end){
    int mid =(start+end)/2;
    if(arr[mid]==a){
      flag =1;
      break;
    }
    if(a>arr[mid]){
      start =mid+1;
    }
    if(a<arr[mid]){
      end =mid-1;
    }
    
    
  }
  if(flag==1){
    System.out.println("found");
  }else{
    System.out.println("not found");
  }
  
}



}
