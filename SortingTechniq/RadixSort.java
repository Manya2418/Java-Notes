public class RadixSort {
    
    static void Display(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"   ");
        }
    }
    static int FindMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static void RedixSort(int arr[],int place){
        int count[]=new int[10];
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        //prefix array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int output[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int index=count[(arr[i]/place)%10]-1;
            output[index]=arr[i];
            count[(arr[i]/place)%10]--;

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
        
    }
    static void sort(int arr[]){
        int max=FindMax(arr);
        for(int i=1;max/i>0;i=i*10){
            RedixSort(arr, i);
        }
    }
    public static void main(String[] args) {
        //RadixSort
        int arr[]={12,20,3,2,12,1,4};
        
        sort(arr);
        for(int val:arr){
            System.out.print(val+" " );
        }

    }
}
