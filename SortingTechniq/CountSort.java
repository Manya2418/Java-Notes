public class CountSort {
    
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }

    static int MaxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    static void CountSort(int arr[]){
        int max=MaxElement(arr);
        int ans[]=new int[max+1];
        int n=arr.length;
        int output[]=new int[n];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
            
        }
       
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+ans[i];
        }
        
        //find index of each element in the original array and put it into ouptpur array

        for(int i=arr.length-1;i>=0;i--){
            int index=ans[arr[i]]-1;
            output[index]=arr[i];
            ans[arr[i]]--;//after placing element
        }
        PrintArray(output);
    }
    public static void main(String[] args) {
        int arr[]={12,20,4,5,3,12};
        CountSort(arr);
        
    }
}


// static void BasicCountSort(int arr[]){
//         int max=MaxElement(arr);
//         int ans[]=new int[max+1];
//         for(int i=0;i<arr.length;i++){
//             ans[arr[i]]++;
            
//         }
//         int k=0;
//         for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[i];j++){
//                 arr[k++]=i;
//             }
//         }
//     }