public class AdvanceBinary {

    static boolean isPossible(int arr[],int dist,int k){
        int placekids=1;
        int lastkid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastkid>=dist){
                placekids++;
                lastkid=arr[i];
            }
        }
        return placekids>=k;
    }
    static int RaceTrack(int arr[],int k){
        int start=0;
        int end=(int)1e9;
        
        int ans=-1;
        while (start<=end) {
            int mid=start+(end-start)/2;

            if(k>arr.length){
                return -1;
            }

            if(isPossible(arr,mid,k)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
        
    }


    

    public static void main(String[] args) {
        
        int arr[]={1,2,4,8,9};
        int m=3;
        System.out.println(RaceTrack(arr,m));
    }
}



// static boolean IsDistributed(int arr[],int maxChoco,int m){

//         int ans=0;
//         int student=1;
        
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>maxChoco){
//                 return false;
//             }
//             else if(ans+arr[i]<=maxChoco){
//                 ans+=arr[i];
//             }else{
//                 student++;
//                 ans=arr[i];
//             }
//         }
        
//         return student<=m;
//     }

//     static int DistributeChoco(int arr[],int m){
//         int start=0;
//         int ans=0;
//         int end=(int)1e9;
//         if(arr.length<m){
//             return -1;
//         }
//         while (start<=end) {
//             int mid=start+(end-start)/2;
//             if(IsDistributed(arr,mid,m)){
//                 ans=mid;
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
//         }
//         return ans;
//     }





// static boolean isPossible(int arr[],int dist,int k){
//         int kidsPlaces=1;
//         int lastkid=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]-lastkid>=dist){
//                 kidsPlaces++;
//                 lastkid=arr[i];

//             }
//         }
//         return kidsPlaces>=k;
//     }
//     static int RaceTrack(int arr[],int k){
//         int start=0;
//         int end=(int)1e9;
//         int ans=-1;
//         while (start<=end) {
//             int mid=start+(end-start)/2;
//             if (isPossible(arr,mid,k)) {
//                 ans=mid;
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return ans;
//     }