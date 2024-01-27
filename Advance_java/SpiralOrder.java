import java.util.Scanner;

public class SpiralOrder {
    
    static void PrintArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }

    static void PrintSpiral(int ans[][],int n,int c){
        int top=0,right=c-1,bottom=n-1,left=0;
        int count=0;
        while (count<n*n) {
            //left row
            for(int i=top;i<=bottom && count<n*c;i++){
                System.out.print(ans[i][left]+"  ");
                count++;
            }
            left++;
            

             //bottom row
            for(int i=left;i<=right && count<n*c;i++){
                System.out.print(ans[bottom][i]+"   ");
                count++;
            }
            bottom--;
            
            //rightCol
            for(int i=bottom;i>=top && count<n*c;i--){
                System.out.print(ans[i][right]+"  ");
                count++;
            }
            right--;

            //topRow
            for(int i=right;i>=left && count<n*c;i--){
                System.out.println(ans[top][i]+"   ");
                count++;
       }
            top++;
        }


    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter number of row"));
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter Array");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original Array ");
        PrintArray(arr);

        PrintSpiral(arr, r, c);
    }
}





//Spriral Order-----------------------------------------
// while (total<r*c) {
//             //topRow
//             for(int i=left;i<=right && total<r*c;i++){
//                 System.out.println(arr[top][i]+"   ");
//                 total++;
//             }
//             top++;

            
//             //rightCol
//             for(int i=top;i<=bottom && total<r*c;i++){
//                 System.out.print(arr[i][right]+"   ");
//                 total++;
//             }
//             right--;

            
//             //bottom row
//             for(int i=right;i>=left && total<r*c;i--){
//                 System.out.print(arr[bottom][i]+"   ");
//                 total++;
//             }
//             bottom--;
            
//             //left row
//             for(int i=bottom;i>=top && total<r*c;i--){
//                 System.out.print(arr[i][left]+"   ");
//                 total++;
//             }
//             left++;
//             }
        
//     }





//geenrate matrix in spiral order-------------------------------------------------
//  while (count<=n*n) {
//             //topRow
//             for(int i=left;i<=right && count<n*n;i++){
//                 ans[top][i]=count;
//                 count++;
//             }
//             top++;

            
//             //rightCol
//             for(int i=top;i<=bottom && count<n*n;i++){
//                 ans[i][right]=count;
//                 count++;
//             }
//             right--;

            
//             //bottom row
//             for(int i=right;i>=left && count<n*n;i--){
//                 ans[bottom][i]=count;
//                 count++;
//             }
//             bottom--;
            
//             //left row
//             for(int i=bottom;i>=top && count<n*n;i--){
//                 ans[i][left]=count;
//                 count++;
//             }
//             left++;
//             }
//         return ans;
//     }


//reverse Spiral=======================================================================================
//    while (count<n*n) {
//             //left row
//             for(int i=top;i<=bottom && count<n*c;i++){
//                 System.out.print(ans[i][left]+"  ");
//                 count++;
//             }
//             left++;
            

//              //bottom row
//             for(int i=left;i<=right && count<n*c;i++){
//                 System.out.print(ans[bottom][i]+"   ");
//                 count++;
//             }
//             bottom--;
            
//             //rightCol
//             for(int i=bottom;i>=top && count<n*c;i--){
//                 System.out.print(ans[i][right]+"  ");
//                 count++;
//             }
//             right--;

//             //topRow
//             for(int i=right;i>=left && count<n*c;i--){
//                 System.out.println(ans[top][i]+"   ");
//                 count++;
//        }
//             top++;
//         }


//     }