public class Practice {
    
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
//     static void Sort(long arr[]){
        

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     long temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static boolean check(long A[],long B[],int N)
//     {
//         Sort(A);
//         Sort(B);
//         if(A==B){
//             return true;
//         }else
        
//             return false;
// }
    static void ReverseArray(int arr[],int i,int j){
        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
//    static void RotateArray(int arr[]){
//         ReverseArray(arr, 0, arr.length-1);
//         ReverseArray(arr, 1, arr.length-1);
//    }

    // static void RotateArray(int arr[],int k){
//         ReverseArray(arr, 0, arr.length-1);
//         ReverseArray(arr, 0, k);
//         ReverseArray(arr, k+1, arr.length-1);
//    }

    // static int FindSum(int arr1[],int arr2[],int x){
    //     int count=0;
    //     //ans=4
    //     int i=0;

    //     int j=0;
    //     while(i<arr1.length && j<arr2.length){
    //         while (j<arr2.length) {
    //             if(arr1[i]+arr2[j]==x){
    //             count++;
                
    //         }
    //         } i++;
    //         j++;
          
    //     }
    //     return count;
    // }
    // static int LastIndex(String s){
    //     // int num=Integer.parseInt(str);

    //     for(int i=s.length()-1;i>=0;i--){
    //         if(s.charAt(i)=='1'){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
        static int Max(int arr[]){
            
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;

        }
        static void FrequencyArray(int arr[]){
            int max=Max(arr);
            int ans[]=new int[max];
            for(int i=0;i<arr.length;i++){
                ans[arr[i]]++;
            }
            PrintArray(ans);
        }

        // static int MissingNumber(int arr[],int n){
            
        //     for(int i=0;i<arr.length;i++);

        // }


    public static void main(String[] args) {
        int arr[]={1,2,4};
        // int ans=MissingNumber(arr,4);
        // int ans[]=FrequencyArray(arr);
        // PrintArray(ans);
    
        FrequencyArray(arr);
    }

}
