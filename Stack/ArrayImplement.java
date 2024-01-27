public class ArrayImplement {

    static class  Stack {
        int arr[]=new int[5];
        int idx=0;
        void push(int val){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]=val;
            idx++;
        }
        void Display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int Size(){
            return idx;
        }
        int peek(){
            if(idx==0){
                System.out.println("Empty");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }
        
        // void pop(){
        //     arr[idx-1]=0;
        //     idx--;
        // }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
   
        boolean isEmpty(){
            if(Size()>0){
                return true;
            }else
            return false;
        }
        boolean isFull(){
            if(Size()==arr.length){
                return true;
            }else
            return false;
        }

        int CapacityStack(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(30);
        st.push(40);
        // System.out.println(st.Size());
        // st.Display();
        // st.pop();
        // System.out.println(st.peek());
        st.Display();
    }
}