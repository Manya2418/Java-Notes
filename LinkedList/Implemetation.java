package LinkedList;

public class Implemetation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Linkdlist{
        Node head=null;//address node as a userdefine data type
        Node tail=null;//address
        int size=0;
        void InsertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
       

        void InsertAtBeg(int val){
            Node temp=new Node(val);
            if(head==null){
                // head=temp;
                // tail=temp;
                InsertAtEnd(val);

            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }     

        int getElement(int index){
            Node temp=head;
            if(index<0||index>size){
                System.out.println("wrong Input");
                return -1;
            }
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            return temp.data;

        }

        void InsertAtIndex(int val,int index){
            Node t=new Node(val);
            Node temp=head;
            if(index==0){
                InsertAtBeg(val);
                return;
            
            }else if(index==size){
                InsertAtEnd(val);
                return;
            }
            else if(index<0||index>size){
                System.out.println("wrong Input");
                return;
            }

            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        void DeleteAtIndex(int index){
            if(index==0){
                head=head.next;
                size--;
                return;

            }
            Node temp=head;
            
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
    }

    public static void main(String[] args) {
        Linkdlist ll=new Linkdlist();
        ll.InsertAtEnd(12);
        ll.InsertAtEnd(22);
        ll.InsertAtEnd(20);
        System.out.println();

        ll.InsertAtEnd(200);
        ll.InsertAtBeg(100);
        ll.InsertAtIndex(50,1);

        // System.out.println(ll.getElement(6));
        System.out.println(ll.size);
        ll.Display();
        ll.DeleteAtIndex(2);
        ll.Display();
        
        
    }
}


// ll.InsertAtEnd(12);
// ll.InsertAtEnd(22);
// ll.InsertAtEnd(20);
// ll.Display();
// System.out.println();
// System.out.println(ll.Size());
// ll.InsertAtEnd(200);
// ll.Display();

// we can also get size by using size variable and increse it when any node is made;
