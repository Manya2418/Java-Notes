import java.nio.Buffer;
import java.util.Scanner;

public class Sorting {
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        //Copying value from array in to this empty array

        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1) {
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
        merge(arr,l,mid,r);

    }
    
   
   
  
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int mid=(0+arr.length)/2;
        System.out.println(arr.length-mid);
    }
}


//  Bubble sort-----------------------------------------------------------------------------------------------------------
// static void BubbleSort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }


//  Insertion Sort------------------------------------------------------------------------------------------------------
//  static void InsertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int j=i;
//             while(j>0 && arr[j]<arr[j-1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j-1];
//                 arr[j-1]=temp;
//                 j--;
//             }
//         }
//     }


//Selection sort--------------------------------------------------------------------------------------------------------
//  static void SelectionSort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){

//                 if(arr[min]>arr[j]){
//                     min=j;
//                 }
//             }
//             int temp=arr[min];
//             arr[min]=arr[i];
//             arr[i]=temp;
//         }
//     }


//Transfert zeroes to the end---------------------------------------------------------------------------------------
//     static void TransferZeroes(int arr[]){
    
//     for(int i=0;i<arr.length-1;i++){
//         for(int j=0;j<arr.length-i-1;j++){
//             if(arr[j]==0 && arr[j+1]!=0){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     } }


//Sort Fruits-------------------------------------------------------
// static void SortFruits(String arr[]){
//     int n=arr.length;
//     for(int i=0;i<n-1;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j].compareTo(arr[j+1])>0){
//                 String temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     }
//    }


//Merge Sort--------------------------------------------------------------------------------------------

//    static void merge(int arr[],int l,int mid,int r){
//         int n1=mid-l+1;
//         int n2=r-mid;
//         int[] left=new int[n1];
//         int[] right=new int[n2];
//         int i,j,k;
//         //Copying value from array in to this empty array

//         for(i=0;i<n1;i++){
//             left[i]=arr[l+i];
//         }
//         for(j=0;j<n2;j++){
//             right[j]=arr[mid+1+j];
//         }
//         i=0;
//         j=0;
//         k=l;
//         while(i<n1 && j<n2){
//             if(left[i]<right[j]){
//                 arr[k++]=left[i++];
//             }
//             else{
//                 arr[k++]=right[j++];
//             }
//         }
//         while (i<n1) {
//             arr[k++]=left[i++];
//         }
//         while(j<n2){
//             arr[k++]=right[j++];
//         }


//     }
//     static void MergeSort(int arr[],int l,int r){

//         if(l>=r){
//             return;
//         }
//         int mid=(l+r)/2;
//         MergeSort(arr, l, mid);
//         MergeSort(arr, mid+1, r);
//         merge(arr,l,mid,r);

//     }
    