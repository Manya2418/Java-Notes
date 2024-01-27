import java.util.Scanner;

public class Array3 {

    public static void PrintArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }
    }

    public static void swap(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;  
    }

    static int[] ReverseArray(int arr[]){
    //swapping
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i, j);
            i++;
            j--;
        }
        return arr;
    }
    
    static int[] PrifixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;}


    
    
    
    public static void main(String[] args) {
        
        // In given q queries find out the sum of element from given  rage index should be start from 1
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter number of queries for check");
        int q=sc.nextInt();
        PrintArray(arr);
        int pref[]=PrifixSum(arr);
        while(q-->0){
            System.out.println("Enter Range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            
            int answer=pref[r]-pref[l-1];
            System.out.println(answer);

        }
        
        
        
    }
}



// Reverse Array-----------------------------------------------
//  static int[] Reverse(int arr[]){

//         int ans[]=new int[arr.length];
//         int j=0;
//         for(int i=arr.length-1;i>=0;i--){
//             ans[j++]=arr[i];
//         }
//         return ans;
//     }
// int ans[]=Reverse(a);
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+"  ");
//         }




// Reverse Array by Swapping-----------------------------------------
// static void PrintArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"  ");
//         }
//     }
//     static void Swap(int arr[],int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     static int[] ReverseArray(int arr[]){
//     //swapping
//         int i=0,j=arr.length-1;
//         while(i<j){
//             Swap(arr,i, j);
//             i++;
//             j--;
//         }
//         return arr;
//     }
// int a[]={12,4,5,3,53,5};

//         PrintArray(ReverseArray(a));



//rotate array by extra space------------------------------------------------------
//  static int[] RotateArray(int arr[],int k){
//         int n=arr.length;
//         int ans[]=new int[n];
//         int j=0;
//         k=k%n;
//         for(int i=n-k;i<n;i++){
//             ans[j++]=arr[i];
//         }

//         for(int i=0;i<n-k;i++){
//             ans[j++]=arr[i];
//         }
//         return ans;
//     }







// rotate array in place-----------------------------------------------------------
// static int[] reverse(int arr[],int i,int j){
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         return arr;
//     }
//     static int[] RotateInPlace(int arr[],int k){
//         int n=arr.length;
//         k=k%n;
//         reverse(arr,0,n-k-1);

//         reverse(arr,n-k,n-1);
//         reverse(arr, 0, n-1);
       
//         return arr;

//     }


// Create frequency array and check given number is present or not-------------------------------------------------------------
// static int[] MakeFrequencyArray(int arr[]){
//         int freqArray[]=new int[1000000];
//         for(int i=0;i<arr.length;i++){
//             freqArray[arr[i]]++;
//         }
//         return freqArray;
//     }

// while(q>0){

//             System.out.println("Enter number to be searched");
//             int x=sc.nextInt();

//             int ans[]=MakeFrequencyArray(arr);
//             if(ans[x]>0){
//                 System.out.println("YES");
//             }else{
//                 System.out.println("NO");
//             }
//             q--;
//         }


// sort array of 0 and 1 simple method----------------------------------------
// static void swapZeroOnes(int arr[]){

//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 count++;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             if(i<count){
//                 arr[i]=0;

//         }else{
//             arr[i]=1;
//         }
//         }
        
//     }


// sort array of 0 and 1 in a optimize way--------------------------------
// static int[] SortArray(int arr[]){
//         int left=0,right=arr.length-1;

//         while(left<right){
//             if(arr[left]==1 && arr[right]==0){
//             swap(arr, left, right);
//             left++;
//             right--;
//             }
//             if(arr[left]==0){
//                 left++;

//             }
//             if(arr[right]==1){
//                 right--;

//             }
//         }
        
//         return arr;
//     }

// print even at the beginning of the array and print odd at the end -----------------------------------------
//   public static int[] SortEvenOdd(int arr[]){

//         int left=0,right=arr.length-1;
//         while(left<right){
//             if(arr[left]%2!=0 && arr[right]%2==0){
//                 swap(arr, left, right);
//                 left++;
//                 right--;
//             }
//             if(arr[left]%2==0){
//                 left++;
//             }
//             if(arr[right]%2!=0){
//                 right--;
//             }
            
//         }
//         return arr;
//     }

// in given sorted array print square of eache element in sorted manner element can be negative----------------------------------------------------------
// static int[] SortedSquare(int arr[]){

//         int n=arr.length;
//         int ans[]=new int[n];
//         int k=0;
//         int left=0,right=n-1;
//         while(left<=right){
//             if(Math.abs(arr[left])>Math.abs(arr[right])){
//                 ans[k++]=arr[left]*arr[left];
                
//                 left++;
//             }else{
//                 ans[k++]=arr[right]*arr[right];
//                 right--;
//             }
//         }

//         return ans;
//     }

                                                                                                                                                                                        
// Prefix sum by using new array----------------------------------------------------
//  static int[] PrifixSum(int arr[]){
//         int pref[]=new int[arr.length];
//         pref[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             pref[i]=pref[i-1]+arr[i];

//         }
//         return pref;
//     }
   
// static int[] PrifixSum(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             arr[i]=arr[i-1]+arr[i];

//         }
//         return arr;}
   
  