public class Main {

    static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp=arr[i];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    
    public static void main(String[] args) {
        
        //bubble sort
        int arr[]={1,2,4,1,21,24,1,21};
        SelectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}