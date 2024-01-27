public class BinaryLeetCode {
    
    static int searchInsert(int x){
        int start=1;
        int end=x;
        int ans=0;
        while (start<=end) {
            long mid=start+(end-start)/2;
            
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                start=(int)mid+1;
                ans=(int)mid;
                
            }else{
                end=(int)mid-1;
            }
            
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(2147395599));

    }
}


// static int searchInsert(int[] arr, int target) {
        
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }

//             else if(arr[mid]<target){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         return start;
//     }