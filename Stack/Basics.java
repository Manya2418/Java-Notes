import java.util.*;
public class Basics{
    
    
 
    
    public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);
    
        Stack<Integer> st=new Stack<>() ;
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st );
        System.out.println(st);
        
    }
}

// works on the bases of first in last out or last in first out
// 1. It has a unlimited size
// Stack<Integer> st=new Stack<>();
//  System.out.println(st.size());
//  System.out.println(st.isEmpty());
//  st.push(10);
//  st.push(20);
//  st.push(30);
//  System.out.println(st.size());
//  st.push(40);
//  st.push(50);
//  System.out.println(st.isEmpty());
 // st.pop();
 // st.pop();
 //peek - return top most element
 // System.out.println(st.peek());
 // System.out.println(st);
 // System.out.println(st.size());
//  System.out.println(st);
 
// only  two element bachenge
//  while (st.size()>2) {
//      st.pop();
//  }
//  System.out.println(st);

//copy contents of one stack to another in same order
//  Stack<Integer> st=new Stack<>();
//  Stack<Integer> st2=new Stack<>();
//  System.out.println("Enter the element you want to insert");
//  int n=sc.nextInt();
//  System.out.println("Enter the elements");
//  for(int i=1;i<=n;i++){
//      int x=sc.nextInt();
//      st.push(x);
//  }
//  System.out.println(st);
//  while (st.size()>0) {
//      // int x=st.peek();
//      // st2.push(x);
//      // st.pop();
//      st2.push(st.pop());
//  }
//  Stack<Integer> st3=new Stack<>();
//  while (st2.size()>0) {
//      st3.push(st2.pop());
//  }
//  System.out.println(st3);


// Insert At bottom and given index--------------------------------------
// Stack<Integer> st2=new Stack<>();
// while (st.size()>0) {
//     st2.push(st.pop());
// }
// st.push(50);
// while (st2.size()>0) {
//     st.push(st2.pop());
// }
// System.out.println(st);
// int idx=0;
// while(st.size()>idx){
//     st2.push(st.pop());
// } 
// st.push(500);
// while (st2.size()>0) {
//     st.push(st2.pop());
// }
// System.out.println(st);

//Display stack by Array-----------------------------------
// int arr[]=new int[st.size()];
// for(int i=st.size()-1;i>=0;i--){
//     int x=st.pop();
//     arr[i]=x;
// }
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }
// static void DisplayRecur(Stack<Integer> s){
//     if(s.size()==0){
//         return;
//     }
//     int x=s.pop();
//     DisplayRecur(s);
//     System.out.print(x+" ");
//     s.push(x);
// }

// static void InsertAtBottom(Stack<Integer> st){  
//     if(st.size()==0){
//         st.push(100);
//         return;
//     }else{
//         int x=st.pop();
//         InsertAtBottom(st);
//         st.push(x);
//     }
// }

//  Remove Element from last
// while (st.size()>1){
//     st2.push(st.pop());
// }
// st.pop();
// while (st2.size()>0) {
//     st.push(st2.pop());
// }

//  Reverse Stack----------------------------------------
// while (st.size()>0) {
//     st2.push(st.pop());
// }
// while (st2.size()>0) {
//     st3.push(st2.pop());
// }
// while (st3.size()>0) {
//     st.push(st3.pop());
// }

// static void PushAtBottom(Stack<Integer> st,int x){
//     if(st.size()==0){
//         st.push(x);
//         return;
//     }
//     int top=st.pop();
//     PushAtBottom(st, x);
//     st.push(top);
// }

// static void ReverseStatck(Stack<Integer> st){
//     if(st.size()==1){
//         return;
//     }
//     int x=st.pop();
//     ReverseStatck(st);
//     PushAtBottom(st, x);
// }


















