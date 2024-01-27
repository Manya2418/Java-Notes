public class BasicLL{

    
    static class Node{
        int data;
        Node nextAdd;

        Node(int data){
            this.data=data;
        }
    }
    
   

    //recursively
    static int  FindLengthR(Node head){
        int count=0;
        if(head==null){
            return count;
        }
        FindLengthR(head.nextAdd);
        count++;
        return count;
    }
    static void InsertEndbyHead(Node head,int val){
        Node t=head;
        Node temp=new Node(val);

        while (t.nextAdd!=null) {
            t=t.nextAdd;

        }
        t.nextAdd=temp;
    } 
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(12);
        a.nextAdd=b;
        b.nextAdd=c;
        c.nextAdd=d;
        d.nextAdd=e;
        System.out.println(c.nextAdd.nextAdd.nextAdd);
    }
}


// static class Node{
//         int data; 
//         Node nextAdd; it contains the address of data
//         Node(int data){
//             this.data=data;
//         }
//     }
//  Node a=new Node(2);
//  Node b=new Node(4);
//  Node c=new Node(6);
//  Node d=new Node(8);
//  Node e=new Node(12);
//  a.nextAdd=b;
// a.nextAdd=b;
//b.nextAdd=c;
//c.nextAdd=d;
//d.nextAdd=e;
//  System.out.println(a.nextAdd);
//  System.out.println(b);
//  System.out.println(b.nextAdd);
//  b.nextAdd=c;
//  System.out.println(b.nextAdd);
//  System.out.println(c);
// a.nextAdd=a;
// System.out.println(a);
// System.out.println(a.nextAdd);
// System.out.println(a.nextAdd.data);
// System.out.println(a.nextAdd.nextAdd.nextAdd.data);
// System.out.println(e.nextAdd);

//System.out.println(a.data);
//System.out.println(a.nextAdd.data);
//System.out.println(a.nextAdd.nextAdd.data);
//System.out.println(a.nextAdd.nextAdd.nextAdd.data);
//System.out.println(a.nextAdd.nextAdd.nextAdd.nextAdd.data);
//System.out.println(a.nextAdd.nextAdd.nextAdd.nextAdd.nextAdd.data);

        
// Node temp=a;
//System.out.println(temp.data);
//for(int i=0;i<5;i++){
//    System.out.print(temp.data+" ");
//    temp=temp.nextAdd;
//}

// Node temp=a;
//while (temp!=null) {
//    System.out.print(temp.data+" ");
//    temp=temp.nextAdd;        
//    }  
// static void Display(Node head){
// while(head!=null){
//    System.out.print(head.data+" ");
//    head=head.nextAdd;
//     }
// }

//recursive display
    // static void Display2(Node head){
    //     if(head==null){
    //         return;
    //     }
    //     System.out.println(head.data);
    //     Display(head.nextAdd);
    // }



// static int  FindLength(Node head){
//         int count=0;    
//         while ((head!=null)) {
//             count++;
//             head=head.nextAdd;
//         }
//         return count;
//     }



    // static class Node{
    //     int data;
    //     Node nextAdd;
    //     Node(int data){
    //         this.data=data;
    //     }
    // }
    // static Node head=null;
    // static Node tail=null;
    // static void InsertAtLast(int val){
    //     Node temp=new Node(val);
    //     if(head==null){
    //         head=temp;
    //         tail=temp;
    //     }else{
    //         tail.nextAdd=temp;
    //         tail=temp;
    //     }
    // }
    // static void InsertAtBeg(int val){
    //     Node temp=new Node(val);
    //     if(head==null){
    //         head=temp;
    //         tail=temp;
    //     }else{
    //         temp.nextAdd=head;
    //         head=temp;
    //     }
    // }

    // static void Display(){
    //     Node temp=head;
    //     while (temp!=null) {
    //         System.out.print(temp.data+"  ");
    //         temp=temp.nextAdd;
    //     }
    //     System.out.println();
    // }

    // static int Size(){
    //     Node temp=head;
    //     int count=0;
    //     while (temp!=null) {
    //         count++;
    //         temp=temp.nextAdd;
    //     }
    //     return count;
    // }
    // static void InsertAtIndex(int val,int index){
    //     Node temp=new Node(val);
 
    //     Node t=head;

    //     if(index==0){
    //         InsertAtBeg(val);
    //         return;
    //     }
    //     for(int i=0;i<index-1;i++){
    //         t=t.nextAdd;
    //     }
    //     temp.nextAdd=t.nextAdd;
    //     t.nextAdd=temp;

    // }

    // public static void main(String[] args) {
    //     InsertAtLast(12);
    //     InsertAtLast(20);
    //     InsertAtLast(30);
    //     InsertAtLast(40);
    //     InsertAtBeg(50);
    //     InsertAtBeg(100);
    //     Display();
    //     InsertAtIndex(200, 0);

    //     Display();
    // }



