package SortingTechniq;

public class Bucket {


    static int[] SortArray(int arr[]){
        //frequency array
        int freq[]=new int[3];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
    
        int arr[]={0,0,1,0,2,2,2,1};
        int ans[]=SortArray(arr);
        for(int s:ans){
            System.out.print(s+"    ");

        }
    }
}


//  Buckete Sort-----------------------------------------------------------------
// static void BucketSort(float arr[]){
//         int n=arr.length;
//         ArrayList<Float>[] buckets=new ArrayList[n];

//         for(int i=0;i<n;i++){
//             buckets[i]=new ArrayList<>();
//         }
//         for(int i=0;i<n;i++){
//             int bucketIndex=(int)arr[i]*n;
//             buckets[bucketIndex].add(arr[i]);
//         }
//         for(int i=0; i<buckets.length;i++){
//             Collections.sort(buckets[i]);
//         }
//         int index=0;
//         for(int i=0;i<buckets.length;i++){
//             ArrayList<Float> currBucket=buckets[i];
//             for(int j=0;j<currBucket.size();j++){
//                 arr[index++]=currBucket.get(j);
//             }
//         }
//     }





// in given sorted array if two numbers are not sorted then swap these two element only------------------------------------------------------------------------------------
// static void SortArray(int arr[]){
//         int x=-1;
//         int y=-1;
//         if(arr.length<=1){
//             return;
//         }
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<arr[i-1]){
//                 if(x==-1){
//                     x=i-1;
//                 }else{
//                     y=i;
//                 }
//             }
            
//         }
//         int temp=arr[x];
//             arr[x]=arr[y];
//             arr[y]=temp;
//     }



//by using partition side - element at left side and + element at right side------------------------------------------------------------------------------------------
// static void SortArray(int arr[]){
//         int l=0;
//         int r=arr.length-1;
//         while(l<r){
        
//             while(arr[l]<0){
//                 l++;
//             }
//             while(arr[r]>0){
//                 r--;
//             }
//             if(arr[l]>0 && arr[r]<0){
//                 int temp=arr[l];
//                 arr[l]=arr[r];
//                 arr[r]=temp;
//                 l++;
//                 r--;
//             }
//         }
//     }