//package Advance_java;
//
//import java.util.Scanner;
//
//public class TwoDArray {
//    public static void PrintTwoDArray(int arr[][]){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+"  ");
//            }
//            System.out.println();
//        }
//    }
//
//   static void SpiralPrint(int arr[][],int r,int c){
//        int toprow=0,bottomrow=r-1;
//        int rightcol=c-1,leftCol=0;
//
//        // toprow->left to right
//        while() {
//            for(int i=leftCol;i<=rightcol;i++){
//            System.out.print(arr[toprow][i]+"   ");
//            }
//
//            // rightcol->top to down
//            for(int i=toprow;i<=bottomrow;i++){
//                System.out.print(arr[i][rightcol]+" ");
//            }
//
//            // bottomrow= right to left
//
//            for(int i=rightcol;i>=leftCol;i--){
//                System.out.print(arr[bottomrow][i]);
//            }
//
//            // column print kai liye row vary hogi
//
//            // leftrow-> bottom to up;
//            for(int i=bottomrow;i>=0;i--){
//                System.out.print(arr[i][leftCol]);
//            }
//        }
//
//   }
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter rows for array");
//        int n=sc.nextInt();
//
//        // int ans[][]=PascalT(n);
//        // PrintTwoDArray(ans);
//
//    }
//}
//
//
//
//// Addition of two 2d Arrays------------------------------------------------------------
//// static void AddArray(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
////         int sum[][]=new int[r1][c1];
////         if(r1==r2 && c1==c2){
////             for(int i=0;i<r1;i++){
////             for(int j=0;j<c1;j++){
////                 sum[i][j]=arr1[i][j]+arr2[i][j];
////             }
////         }
////         }else{
////             System.out.println("Addition is not possible");
////             return;
////         }
//
////         PrintTwoDArray(sum, r1, c1);
////     }
//
//
//
//// Multiplication of matrices----------------------------------------------
//    // static void MultiplyArray(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
//    //     if(c1!=r2){
//    //         System.out.println("Multiplication is not possible");
//    //         return;
//    //     }
//    //     int ans[][]=new int[r1][c2];
//    //     for(int i=0;i<r1;i++){
//    //         for(int j=0;j<c2;j++){
//    //             for(int k=0;k<r1;k++){
//    //                 ans[i][j]+=(arr1[i][k]*arr2[k][j]);
//    //             }
//    //         }
//    //     }
//    //     PrintTwoDArray(ans, r1, c2);
//    // }
//
//// reverse row of matrix------------------------------------------------------------------------------------
//// for(int i=0;i<n;i++){
////     for(int j=m-1;j>=0;j--){
////         System.out.print(arr1[i][j]+"  ");}
////         System.out.println();}
//
//
//
//// Transpose with using extra space-----------------------------------------
////  static int[][] Tran spose(int arr[][],int r,int c){
////         int ans[][]=new int[c][r];
////         for(int i=0;i<c;i++){
////             for(int j=0;j<r;j++){
////                 ans[i][j]=arr[j][i];
////             }
////         }
////         return ans;
////     }
//
//// Transpose array without using extra space----------------------------------------------------------------------
//// static void Transpose(int arr[][],int r,int c){
//
////         for(int i=0;i<c;i++){
////             for(int j=i;j<r;j++){
////                 int temp=arr[i][j];
////                 arr[i][j]=arr[j][i];
////                 arr[j][i]=temp;
////             }
////         }
//
//
////     }
//
//
//// rotate array by 90 degree angle----------------------------------------------------
//// static void Transpose(int arr[][],int r,int c){
//
////         for(int i=0;i<c;i++){
////             for(int j=i;j<r;j++){
////                 int temp=arr[i][j];
////                 arr[i][j]=arr[j][i];
////                 arr[j][i]=temp;
////             }
////         }
////     }
//
////     static int[] reverseArray(int arr[]){
//
////         int i=0;
////         int j=arr.length-1;
////         while(i<j){
////             int temp=arr[i];
////             arr[i]=arr[j];
////             arr[j]=temp;
////             i++;
////             j--;
////         }
////         return arr;
////     }
//
////     //  r and c will be same because we can rotate only square matrix here------------------------------------------------------------------
////     static int[][] Rotate(int arr[][],int n){
////         Transpose(arr, n, n);
////         for(int i=0; i<n;i++){
////             reverseArray(arr[i]);
////         }
////         // PrintTwoDArray(arr, n, n);
////         return arr;
////     }
//
//
//// Pascal theorem--------------------------------------------------------------------------------------
////  static int[][] PascalT(int n){
////         int ans[][]=new int[n][];
////         for(int i=0;i<n;i++){
////             //  ith row has i+1 column;
////             // ans[0]=new int[]
////             // ans[2]=new int[3]
////             ans[i]=new int[i+1];
//
////             // 1st and last element of every row is 1
////             ans[i][0]=ans[i][i]=1;
//
////             for(int j=1;j<i;j++){
////                 ans[i][j]=ans[i-1][j]+ ans[i-1][j-1];
////             }
//
////         }
////         return ans;
////     }