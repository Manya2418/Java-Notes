public class MergeSort {
    
    static void Merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        //l=0; mid=3 but index
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2) {
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void MergeSort(int arr[],int l,int r){

        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        MergeSort(arr, l, mid);
        MergeSort(arr, mid+1, r);
        Merge(arr,l,mid,r);

    }
    public static void main(String[] args) {
        int arr[]={12,2,5,3};
        //merge Sort
        MergeSort(arr,0,arr.length-1);
        for(int s:arr){
            System.out.print(s+"    ");
        }
    }
}
