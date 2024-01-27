// import java.util.Arrays;

public class Array2 {
    
    // static void swap(int a,int b){
    
    //     System.out.println("Values before swap");
    //     System.out.println(a);
    //     System.out.println(b);
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("after swapping");
    //     System.out.println(a);
    //     System.out.println(b);
    // }
    
    static void swap2(int a,int b){
        a=a+b;
        // a=53-32=21
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        
        int a=21;
        int b=32;

        swap2(a, b); 
        
    }
}




// find occurence of any number in array-------------------------------------
// static int Ocurrences(int arr[],int x){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 count++;
//             }
//         }
//         return count;
//     }

// find last occurence---------------------
//  static int lastOccurence(int arr[],int x){
//         int index=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 index=i;
//             }
//         }
//         return index;
//     }



// issorted array-------------------------------------------------
// static boolean isSorted(int arr[]){
//         boolean ans=true;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<arr[i-1]){
//                 ans=false;
//                 break;
                
//             }
//         }
//         return ans;
//     }


// find smallest and larges element in the array---------------------------------
// static int[] smallAndLargest(int arr[]){
//         Arrays.sort(arr);
//         int ans[]={arr[0],arr[arr.length-1]};
//         return ans;
//     }
//    int[] answer=smallAndLargest(arr);
//         System.out.println(answer[0]);
//         System.err.println(answer[1]);


// count number of pair whose sum is equal to given by number-------------------------------------
// static int CheckPair(int arr[],int sum,int count){
   
//         for(int i=0;i<arr.length;i++){
            
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j]==sum){
//                     count++;
//                 }
//             }
            

//         }
//         return count;
//     }




// find count of triplated whose sum is equal to given sum-------------------------------------------------------------

// static int CheckTriplate(int arr[],int sum,int count){
   
//         for(int i=0;i<arr.length;i++){
            
//             for(int j=i+1;j<arr.length;j++){
                
//                 for(int k=j+1;k<arr.length;k++){
//                     if(arr[i]+arr[j]+arr[k]==sum){
//                     count++;
//                 }
//                 }
//             }
            

//         }
//         return count;
//     }


// Find unique element in array-------------------------------------
// static int FindUnique(int arr[]){
//         int ans=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     arr[i]=1;
//                     arr[j]=1;
//                 }

//             }

//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=1){
//                 ans=arr[i];
//             }
//         }
//         return ans;
//     }


// find max and second max--------------------------------------------------
// static int FindMax(int arr[]){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         } 
//         return max;
//     }

//     static int secondMax(int arr[]){
//             int max=FindMax(arr);
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]==max){
//                     arr[i]=Integer.MIN_VALUE;
//                 }

//             }
//             int secondMax=FindMax(arr);
//             return secondMax;
//         }
    


// Find minimum or 2nd Minimum value of array-------------------------------------------------------
// static int FindMin(int arr[]){
//         int min=Integer.MAX_VALUE;//value in - 
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         return min;
//     }
//     static int secondMin(int arr[]){
//         int min=FindMin(arr);
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==min){
//                 arr[i]=Integer.MAX_VALUE;
//             }
//         }

//         int secondMin=FindMin(arr);
//         return secondMin;
//     }
    

// Find repeating number in any array------------------------------------------
// static int FindRepeat(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }


// Find last repeat number in a given array--------------------------------------------------------
// static int LastRepeat(int arr[]){
//             for(int i=arr.length-1;i>=0;i--){
//                 for(int j=i-1;j>=0;j--){
//                     if(arr[i]==arr[j]){
//                         return arr[i];
//                     }
//                 }
//             }
//             return -1;
//         }