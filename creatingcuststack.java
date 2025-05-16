import java.util.*;

public class creatingcuststack {
    


  public static void main (String[] args) {
    
    mystack st = new mystack(5);
    st.push(10);
    st.push(20);
    st.print();
    
   
  }
  
  
}

class mystack{
  int maxsize;
  int[] arr;
  int top;
  mystack(int maxsize){
    this.maxsize = maxsize;
    this.arr = new int[maxsize];
    this.top = -1;
  }
  
  void push ( int ele){
    arr[++top] = ele;
  }
  int pop(){
    return arr[--top];
  }
  void print(){
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    
  }
  }
  
  
  
  
}
