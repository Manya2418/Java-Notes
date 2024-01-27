public class DoublyLinkedl {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
   

    static class LinkedList{
        Node head=null;
        Node tail=null;

        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.val+"    ");
                temp=temp.next;
            }
            System.out.println();
        }
        void InsertAtHead(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
        }
        void InsertAtTail(int val){
            Node temp=head;
            Node t=new Node(val);
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=t;
            t.prev=temp;
        }
        
        
    }

    

       

    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.InsertAtHead(100);
        ll.InsertAtTail(10);
        ll.InsertAtTail(20);
        ll.InsertAtTail(30);
        ll.InsertAtTail(40);
        ll.Display();
    }
}


//  static void Display(Node head){
//         Node temp=head;
//         while (temp!=null) {
//             System.out.print(temp.val+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     static void DisplayRev(Node tail){
//         Node temp=tail;
//         while (temp!=null) {
//             System.out.print(temp.val+" ");
//             temp=temp.prev;
//         }
//         System.out.println();
//     }
//     static void DisplybyRandom(Node t){
//         Node temp=t;
//         while (temp.prev!=null) {
//             temp=temp.prev;
//         }
//         while (temp!=null) {
//             System.out.print(temp.val+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }

// a.prev=null;
// a.next=b;
// b.prev=a;
// b.next=c;
// c.prev=b;
// c.next=d;
// d.prev=c;
// d.next=e;
// e.prev=d;
// e.next=null;

//at least ek node bna hona chaiye otherwise it will not 
//  static Node InsertAtHead(Node head,int val){
//             Node temp=new Node(val);
//             temp.next=head;
//             head.prev=temp;
//             head=temp;
//             return head;
//         }

// void InsertAtHead(int val){
//             Node temp=new Node(val);
//             temp.next=head;
//             head=temp;
//         }