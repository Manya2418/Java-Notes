// //recursion 2 se practice kerna hai
// public class Practice {

//     static class Node{
//         int val;
//         Node next;
//         Node(int val){
//             this.val=val;
//         }
//     }
//     static class LinkedList {
    
//         Node head=null;
//         Node tail=null;

//         void InsertAtBeg(int a){
//             Node temp=new Node(a);
//             if(head==null){
//                 head=temp;
//             }else{
//                 temp.next=head;
//                 head=temp;
//             }
//         }
//         void Display(Node head){
//             Node temp=head;
//             while (temp!=null) {
//                 System.out.print(temp.val+"  ");
//                 temp=temp.next;
                
//             }
//             System.out.println();
//         }
//         int Size(Node head){
//             int count=0;
//             while (head!=null) {
//                 count++;
//                 head=head.next;
//             }
//             return count;
//         }
//         void InsertAtIdx(int val,int idx){
//             Node Ntemp=new Node(val);
//             Node temp=head;
//             if(idx==0){
//                 InsertAtBeg(val);
//                 return;
//             }
//             for(int i= 1;i<idx;i++){
//                 temp=temp.next;
//             }
//             Ntemp.next=temp.next;
//             temp.next=Ntemp;
//         }  
//         void InsertAtLast(int val){
//             Node temp=head;
//             Node t=new Node(val);
//             while (temp.next!=null) {
//                 temp=temp.next;
//             }
//             temp.next=t;
//             tail=t;
//         }
//         int getElement(int idx){
//             Node temp=head;
//             for(int i=1;i<=idx;i++){
//                 temp=temp.next;
//             }
//             return temp.val;
//         }
//         void DeleteIdx(int idx){
//             Node temp=head;
//             if(idx==0){
//                 head=temp.next;
//             }
//             for(int i=1;i<idx;i++){
//                 temp=temp.next;
//             }
//             temp.next=temp.next.next;
//         }
        
//         Node FindNthNode(Node head,int pos){
//             Node temp=head;
//             int size=Size(temp);
//             int Position=size-pos;
//             for(int i=1;i<=Position;i++){
//                 temp=temp.next;
//             }
//             return temp;
//         }

//         //Last se Nth node
//         Node FindNode(int idx){
//             Node fast=head;
//             Node slow=head;
//             for(int i=1;i<=idx;i++){
//                 fast=fast.next;
//             }
//             while (fast.next!=null) {
//                 fast=fast.next;
//                 slow=slow.next;
//             }
//             return slow;
//         }
//     }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.InsertAtBeg(50);
//         ll.InsertAtBeg(40);
//         ll.InsertAtBeg(30);
//         ll.InsertAtBeg(20);
//         ll.Display(ll.head);
//         Node ans=ll.FindNode(2);
//         System.out.println(ans.val);
//     }
// }

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int a=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" you are "+a+" years old.");
    }
}