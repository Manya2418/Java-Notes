import java.util.Arrays;

class ArrayList{
    int arr[]=new int[5];
    int index=0;
    int size=0;
    void add(int a){
        if(size==arr.length){
            int brr[]=Arrays.copyOf(arr, arr.length*2);
            // arr=new int[brr.length];
            // arr=Arrays.copyOf(brr, brr.length);
            arr=brr;
        }
        arr[index]=a;
        index++;
        size++;
    }
    void set(int index,int val){
        arr[index]=val;
    }
    void Display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"   ");
        }
    }

    }
    


public class CreateArrayList {
    
    
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(2);
        arr.add(12);
        arr.add(32);
        arr.add(2);
        arr.add(12);
        arr.add(32);
        System.out.println(arr.size);

        arr.set(0,10);
        arr.Display();


    }
}
