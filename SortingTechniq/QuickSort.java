public class QuickSort {
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    
    //duplicate pivot can put in left side
    static int Partition(int arr[],int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++; 
            }
        }
        int pivotIndex=count+st;
        swap(arr,st, pivotIndex);
        int i=st,j=end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){i++;}
            while(arr[j]>pivot){j--;}

            if(i<pivotIndex && j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
}
    static void QuickSort(int arr[],int st,int end){
        if(st>=end){return;}

        int pi=Partition(arr,st,end);
        QuickSort(arr, st, pi-1);
        QuickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int arr[]={12,2,1,32,2,32};
        //Quick sort
        QuickSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }
}


// public class Practice {

//     static void PrintArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"   ");
//         }
//     }

//     static void Swap(int arr[],int x,int y){
//         int temp=arr[x];
//         arr[x]=arr[y];
//         arr[y]=temp;
//     }
//     static int Partition(int arr[],int start,int end){
//         int pivot=arr[start];
//         int count=0;
//         //choose right position for pivot
//         for(int i=start+1;i<=end;i++){
//             if(arr[i]<pivot){
//                 count++;
//             }   
//         }
//         int pivotIdx=start+count;
//         Swap(arr, start, pivotIdx);
//         int i=start,j=end;

//         while (i<pivotIdx && j>pivotIdx) {

//             while(arr[i]<=arr[pivotIdx]){i++;}
//             while(arr[j]>arr[pivotIdx]){j--;}

//             if(arr[i]>arr[pivotIdx] && arr[j]<arr[pivotIdx]){
//                 Swap(arr, i, j);
//                 i++;
//                 j--;
//             }
            
//         }

//         return pivotIdx;
//     }
//     static void QuickSort(int arr[],int start,int end){
//         if(start>=end){
//             return;
//         }
//         int pi=Partition(arr,start,end);
//         QuickSort(arr, start, pi-1);
//         QuickSort(arr, pi+1, end);
//     }

//     public static void main(String[] args) {
        
//         int arr[]={12,2,4,13,1,3};
//         //Quick Sort
//         QuickSort(arr,0,arr.length-1);
//         PrintArray(arr);
//     }
// }