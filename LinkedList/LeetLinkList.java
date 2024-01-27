public class LeetLinkList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        void InsertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

        }

        void Display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtEnd(10);
        ll.InsertAtEnd(12);
        ll.InsertAtEnd(30);
        ll.InsertAtEnd(43);
        ll.InsertAtEnd(50);
        ll.InsertAtEnd(65);
        ll.InsertAtEnd(80);

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ll.Display(ll.head);

    }

}

// static void DeleteNode(Node a){
// a.data=a.next.data;
// a.next=a.next.next;
// }

// static Node FindNthNode(Node head,int index){
// Node start=head;
// int count=0;
// while (start!=null) {
// count++;
// start=start.next;
// }
// int pos=count-index+1;
// start=head;
// for(int i=0;i<pos-1;i++){
// start=start.next;
// }
// return start;
// }
// Node ans=FindNthNode(a,3);

// static Node FindNodeOneTravel(Node head,int idx){
// Node fast=head;
// Node slow=head;
// for(int i=1;i<=idx;i++){
// fast=fast.next;
// }
// while (fast!=null) {
// slow=slow.next;
// fast=fast.next;
// }
// return slow; }

// Delete Node at Nth from
// last----------------------------------------------------------------------
// static Node DeleteNode(Node head,int idx){
// Node fast=head;
// Node slow=head;
// for(int i=1;i<=idx;i++){
// fast=fast.next;
// }
// if(fast==null){
// head=head.next;
// return head;
// }
// while (fast.next!=null) {
// slow=slow.next;
// fast=fast.next;
// }
// slow.next=slow.next.next;
// return head;
// }

// Find Intersection Node of any two linked
// list-------------------------------------------------------------------------------------------
// static Node FindIntersection(Node headA,Node headB){
// Node n1=headA;
// Node n2=headB;
// int count1=0;
// int count2=0;
// while (n1!=null) {
// count1++;
// n1=n1.next;
// }
// while (n2!=null) {
// count2++;
// n2=n2.next;
// }
// n1=headA;
// n2=headB;
// if(count1>count2){
// int idx=count1-count2;
// for(int i=1;i<=idx;i++){
// n1=n1.next;
// }
// }else{
// int idx=count2-count1;
// for(int i=1;i<=idx;i++){
// n2=n2.next;
// }
// while (n1!=n2) {
// n1=n1.next;
// n2=n2.next; }
// }
// return n1;
// }
// static Node FindMiddleElem(Node head){
// Node temp=head;
// Node fast=head;
// Node slow=head;
// int count=0;
// while (temp!=null) {
// count++;
// temp=temp.next;
// }
// temp=head;
// if(count%2==0){
// //event
// while (fast.next.next!=null) {
// fast=fast.next.next;
// slow=slow.next
// }
// return slow;
// }else{
// while (fast.next!=null) {
// fast=fast.next.next;
// slow=slow.next;
// }
// return slow;
// }
// }

// static Node FindMiddleElem(Node head){
// Node fast=head;
// Node slow=head;
// while (fast!=null && fast.next!=null) {
// fast=fast.next.next;
// slow=slow.next;
// }
// return slow;
// }

// static Node DeleteMiddleElem(Node head){
// Node fast=head;
// Node slow=head;
// if(head.next==null){
// return null;
// }
// while(fast.next.next!=null && fast.next.next.next!=null){
// slow=slow.next;
// fast=fast.next.next;
// }
// slow.next=slow.next.next;
// return head;
// }

// Check cycle is present or
// not----------------------------------------------------------------------
// public boolean hasCycle(ListNode head) {
// ListNode fast=head;
// ListNode slow=head;
// if(head==null ||head.next==null) return false;
// while(fast!=null){
// if(slow.next==null) return false;
// slow=slow.next;
// if(fast.next==null) return false;
// fast=fast.next.next;
// if(slow==fast){
// return true;
// }
// }
// return false;
// }

// static Node mergeTwoLists(Node list1, Node list2) {
// Node temp1=list1;
// Node temp2=list2;
// Node a=new Node(23);
// Node head=a;
// while (temp1!=null && temp2!=null) {
// if(temp1.data<temp2.data){
// Node n=new Node(temp1.data);
// head.next=n;
// head=n;
// temp1=temp1.next;
// }else{
// Node n=new Node(temp2.data);
// head.next=n;
// head=n;
// temp2=temp2.next;
// }
// }
// if(temp1==null){
// head.next=temp2;
// }
// if(temp2==null){
// head.next=temp1;
// }
// return a.next;
// }

// static Node MergeSortwithoutExtraS(Node head1,Node head2){
// Node temp1=head1;
// Node temp2=head2;
// Node t=new Node(100);
// Node head=t;
// while (temp1!=null && temp2!=null) {
// if(temp1.data<temp2.data){
// head.next=temp1;
// head=temp1;
// temp1=temp1.next;
// }else{
// head.next=temp2;
// head=temp2;
// temp2=temp2.next;
// }
// }
// if(temp1==null){
// head.next=temp2;
// }
// if(temp2==null){
// head.next=temp1;
// }
// return t.next;
// }

// void RemoveDuplicate(Node head){
// Node temp=head;
// while (temp!=null && temp.next!=null) {
// if(temp.data==temp.next.data){
// temp.next=temp.next.next;
// }
// if(temp.next==null){
// return;
// }
// if(temp.next.data!=temp.data){
// temp=temp.next;
// }
// }
// }

// void DisplayR(Node head){
// if(head==null){
// return;
// }
// DisplayR(head.next);
// System.out.print(head.data+" ");
// }

// Node ReverseList(Node head){
// if(head.next==null){
// return head;
// }
// Node newNode=ReverseList(head.next);
// head.next.next=head;
// head.next=null;
// return newNode;
// }

// Node ReversebyPointer(Node head){
// Node curr=head;
// Node prev=null;
// Node NextN=null;
// while (curr!=null) {
// NextN=curr.next;
// curr.next=prev;
// prev=curr;
// curr=NextN;
// }
// return prev;
// }

// Boolean checkPallindrome(Node head) {
// Node fast = head;
// Node slow = head;
// while (fast.next != null && fast.next.next != null) {
// fast = fast.next.next;
// slow = slow.next;
// }
// Node temp = Reverse(slow.next);
// slow.next = temp;
// Node p1 = head;
// Node p2 = slow.next;
// while (p2 != null) {
// if (p1.data != p2.data) {
// return false;
// }
// p1 = p1.next;
// p2 = p2.next;
// }
// return true;
// }

// Boolean checkPallin(Node head){
// Node temp=head;
// Node middle=FindMiddle(temp);// 40
// Node reverse=Reverse(middle.next);
// Node p1=head;
// Node p2=reverse;
// while (p2!=null) {
// if(p1.data!=p2.data){
// return false;
// }
// p1=p1.next;
// p2=p2.next;
// } return true;
// }

// int FindMaxPair(Node head){
// Node temp=head;
// Node middle=FindMiddle(temp);
// Node reverse=Reverse(middle.next);
// Node p1=head;
// Node p2=reverse;
// int Max=Integer.MIN_VALUE;
// while (p2!=null) {
// if(p1.data+p2.data>Max){
// Max=p1.data+p2.data;
// }
// p1=p1.next;
// p2=p2.next;
// }
// return Max; }

// Node FindEvenOdd(Node head){
// Node temp=head;
// Node even=new Node(12);
// Node odd=new Node(32);
// Node tempo=odd;
// Node tempe=even;
// while (temp!=null) {
// tempo.next=temp;
// temp=temp.next;
// tempo=tempo.next;
// tempe.next=temp;
// if(temp==null) break;
// temp=temp.next;
// tempe=tempe.next;}
// odd=odd.next;
// even=even.next;
// tempo.next=even;
// return odd;
// }

// 1q-trivia-j24::XLdXFj9iiAE3jCRRF7gAhQ
