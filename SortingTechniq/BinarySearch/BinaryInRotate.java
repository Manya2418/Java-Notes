public class BinaryInRotate {
    
    static int FindPeekValue(int arr[]){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while (start<=end) {
             
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        //find index of given number
        int arr[]={0,1,0};
        int ans=FindPeekValue(arr);
        System.out.println(ans);
    }
}

// Find minimum element in the rotated array--------------------------------------------------------------------------
// static int FindMin(int arr[]){
//         int start=0;
//         int ans=-1;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;

//             if(arr[mid]>arr[arr.length-1]){
//                 start=mid+1;
//             }else if(arr[mid]<arr[arr.length-1]){
//                 ans=mid;
//                 end=mid-1;
//             }
//         }
//         return ans;
//     }



//  Find Target Element-------------------------------------------------------------------------------
// static int SearchElem(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
//         while (start<=end) {
//             int mid=start+(end-start)/2;

//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[mid]<arr[end]){
//                 if(target>arr[mid] && target<=arr[end]){
//                     start=mid+1;
//                 }else{
//                     end=mid-1;
//                 }
//             }else{
//                 if(target>=arr[start] && target<arr[mid]){
//                     end=mid-1;
//                 }else{
//                     start=mid+1;
//                 }
//             }
//         }
//         return -1;
//     }


// static int SearchInDup(int arr[],int target){
//         int start=0;
//         int end=arr.length-1;
//         while (start<=end) {
//             int mid=start+(end-start)/2;

//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[start]==arr[mid] && arr[end]==mid){
//                 start++;end--;
//             }
//             else if(arr[mid]<=arr[end]){
//                 if(target>arr[mid] && target<=arr[end]){
//                     start=mid+1;
//                 }else{
//                     end=mid-1;
//                 }
//             }else{
//                 if(target>=arr[start] && target<arr[mid]){
//                     end=mid-1;
//                 }else{
//                     start=mid+1;
//                 }
//             }
//         }
//         return -1;
//     }



// static Boolean SearchInMatrix(int arr[][],int target){
//         int start=0;
//         int n=arr.length;
//         int m=arr[0].length;
//         int end=n*m-1;

//         while (start<=end) {
//             int mid=start+(end-start)/2;

//             int curreint=arr[mid/m][mid%m];
//             if(curreint==target){
//                 return true;

//             }
//             else if(curreint<target){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
            
//         }
//         return false;
//     }

// static Boolean SearchElem(int arr[][],int target){
//         int n=arr.length;
//         int m=arr[0].length;
//         int i=0;
//         int j=m-1;
//         while(i<n && j>=0){
//             if(arr[i][j]==target) return true;
//             if(target<arr[i][j]){
//                 j--;
//             }else{
//                 i++;
//             }
//         }
//         return false;
//     }


//  Find Peek value in which starting and last index can be - infinity--------------------------------------------
// static int FindPeekValue(int arr[]){
//         int start=0;
//         int end=arr.length-1;
//         int ans=-1;

//         while (start<=end) {
//             int mid=start+(end-start)/2;

//             if(arr[mid]==0||arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
//                 return mid;
//             }
//             if(arr[mid]<arr[mid+1]){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }

//         return ans;
//     }



// public int findPeakElement(int[] arr) {
        
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if((mid==0||arr[mid]>arr[mid-1]) && (mid==arr.length-1||arr[mid]>arr[mid+1])){
//                 return mid;
//             }
//             if(arr[mid]<arr[mid+1]){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }