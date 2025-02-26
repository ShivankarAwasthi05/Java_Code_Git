package StacksOperations;

import java.util.Stack;

//import java.util.ArrayList;

public class basicsOfStacks {
   public static void main(String args[]){
  // ArrayList<Integer>arr=new ArrayList<>();
   Stack<Integer>st=new Stack<>();
   System.out.println(st.isEmpty());
   st.push(1);
   st.push(2);
   st.push(3);
   st.push(4);
   st.push(5);
   System.out.println(st);
   System.out.println(st.peek());
   System.out.println(st.pop());
   System.out.println(st);
   System.out.println(st.size());
   while(st.size()>1){
    st.pop();
   }
   System.out.println(st.peek());
   System.out.println(st.isEmpty());
   System.out.println("RadhaVallabhShriHariVansh");
   } 
   
}
