public class BinarySearch {
    
    static int FindRoot(int x){
        int start=0;
        int end=x;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=mid*mid;
        
            if(val==x){
                return mid;
            }
            else if(val<x){
                ans=mid;
                start=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,2,12,12,40,40,40,40,41,50};
        //return first index
        int target=40;
        int ans=FindRoot(144);
        System.out.println(ans);
       
    }
   
}

// static boolean BinarySearch(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
        
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(arr[mid]==target){
//                 return true;
//             }
//             else if(arr[mid]>target){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }

//         }
//         return false;
//     }


//  while (target!=50) {
//             System.out.printf("%d is exit in array %b",target,BinarySearch(arr, target));
//             System.out.println();
//             target++;
//         }



// Recursive calls-------------------------------------------------
// static boolean BinarySearch(int arr[],int target,int start,int end){
        
//         if (start>end){
//             return false;
//         } 
        
//         int mid=(start+end)/2;
//         if(target==arr[mid]){
//             return true;
//         }

//         if(target<arr[mid]){
//             return BinarySearch(arr, target, start, mid-1);
//         }
//         else{
//             return BinarySearch(arr, target, mid+1, end);
//         }
//     }



// Find first occurance of any number----------------------------------------------------------------------
// static int FindFirstIndex(int arr[],int target){
//     int start=0,end=arr.length-1;
//     int firstO=-1;
//     while(start<=end){
//         int mid=start+(end-start)/2;
//         if(arr[mid]==target){
//             firstO=mid;
//             end=mid-1;
//         }
//         else  if(target<arr[mid]){
//             end=mid-1;
//         }else{
//             start=mid+1;
//         }
//     }
//     return firstO;
// }

//  First Occurance by Recursion-----------------------------------------------------------------------------
// static int BinarySearch(int arr[],int target,int start,int end){
//         //return index
//         int firstOccur=-1;
//         if(start>=end){
//             return firstOccur;
//         }
//         int mid=(start+end)/2;
//         if(arr[mid]==target){
//             firstOccur=mid;
//             end=mid-1;
//         }
//         else if(arr[mid]>target){
//             return BinarySearch(arr, target, start, mid-1);
//         }else{
//             return BinarySearch(arr, target, mid+1, end);
//         }
//         return firstOccur;

//     }
    

//  Last Occurance of any element----------------------------------------------------------------------------------------------------------------------------------
// static int LastOccurance(int arr[],int target,int start,int end){
//         int lastO=-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(arr[mid]==target){
//                 lastO=mid;
//                 start=mid+1;
            

//             }
//             else if(arr[mid]>target){
//                 end=mid-1;
//             }else{
//                start=mid+1;
//             }
//             }
        
//         return lastO;
        
//     }