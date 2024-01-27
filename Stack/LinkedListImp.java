public class LinkedListImp {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static class LLStack{
        Node head=null;
        int size=0;

        void push(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        void pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return;
            }
            head=head.next;
            size--;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }
        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.val+"  ");
                temp=temp.next;
                
            }
        }
        void DisplayRev(Node head){
            Node temp=head;
            if(temp==null){
                return;
            }
            DisplayRev(temp.next);
            System.out.print(temp.val+" ");
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.DisplayRev(st.head);
        // System.out.println(st.size);
        System.out.println();
        System.out.println(st.peek());
        st.pop();
        st.Display();
    }
}
