

public class Bubble {
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
    
    
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        // bubble sort (n-1)
        for(int i=0;i<arr.length-1;i++){
            // time complexity =O(n^2)
            // arr.length-1-i because phle 0 element sort hai fir 1 ho jayeg or fir i=2
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    // swap

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
