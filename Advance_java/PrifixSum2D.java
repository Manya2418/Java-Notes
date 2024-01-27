import java.util.Scanner;

public class PrifixSum2D {
    static void PrintArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
    }
    
    static void PrifixRow(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        PrintArray(arr);
    }
    static void PrifixRowCol(int arr[][]){
        PrifixRow(arr);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j]+=arr[i-1][j];
            }
        }
        PrintArray(arr);
    }

    static int CalculateSum(int arr[][],int l1,int r1,int l2,int r2){

        int up=0,left=0,com=0;
        PrifixRowCol(arr);
        int sum=0;
        int total=arr[l2][r2];
        if(l1>=1){
            up=arr[l1-1][r2];
        }
          
        if(r1>=1){
            left=arr[l2][r1-1];
        }
        if (r1>=1 && l1>=1) {
            com=arr[l1-1][r1-1];
        }
            
        
        
        sum=total-up-left+com;
        return sum;
    }

    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();

        System.out.println("Enter number of column");
        int c=sc.nextInt();
        System.out.println("Enter array");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0; j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        // PrifixRow(arr);
        

        // PrifixRowCol(arr);

        int answer=CalculateSum(arr, 1, 1, 2, 2);
        System.out.println(answer);
        
    }
}

//brust force method--------------
// Print sum in matrix in given range------------------
//  static int SumArray(int arr[][],int l1,int r1,int l2,int r2){
//         int sum=0;
//         for(int i=l1;i<=l2;i++){
//             for(int j=r1;j<=r2;j++){
//                 sum+=arr[i][j];
//             }

//         }
//         return sum;
//     }
// int ans=SumArray(arr, 0, 0, 2, 2);

//         PrintArray(arr);
//         System.out.println(ans);



//sum by using row ------------------------------------------------------------------------------------------------
// static int ArraySum(int arr[][],int l1,int r1,int l2,int r2){
//         int sum=0;
//         PrifixSum(arr);
//         for(int i=l1;i<=l2;i++ ){
//             if(r1>=1)
//                 sum=sum+arr[i][r2]-arr[i][r1-1];
//             else   
//                 sum+=arr[i][r2];
//         }
//         return sum;    
//     }
// int answer=ArraySum(arr, 1, 1, 2, 2);
//         System.out.println(answer    );



   //prifix sum of 2d Array
    
    // static void PrifixSum(int arr[][]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=1;j<arr[i].length;j++){
    //             arr[i][j]+=arr[i][j-1];
    //         }
    //     }
    // }
