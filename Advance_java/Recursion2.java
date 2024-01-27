import java.util.ArrayList;
import java.util.Scanner;

public class Recursion2 {
    
    static ArrayList<Integer> IsExitOrNot(int arr[],int x,int index){
        if(index==arr.length){
            //return empty list
            return new ArrayList<>();
        }
        ArrayList<Integer> ans=new ArrayList<>();

        if(arr[index]==x){
            ans.add(index);
        }
        

        ArrayList<Integer> Smallans=IsExitOrNot(arr, x, index+1);
        ans.addAll(Smallans);
        return ans;
    }
 

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        //printArray by recursion
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
       

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=IsExitOrNot(arr,15,0);
        System.out.println(ans);
    }
}


//Print Array Using Recursion--------------------------------------------------------------
// static void PrintArray(int arr[],int n ){
     
//         if(n==0){
//             System.out.print(arr[n]+"   ");
//             return;
//         }
//         PrintArray(arr, n-1);
//         System.out.print(arr[n]+"  ");
        
        
//     }


//  static void PrintArray(int arr[],int index){
//         if(index==arr.length){
//             return;
//         }
//         System.out.print(arr[index]+"  ");
//         PrintArray(arr,index+1);    
        
//     }




//  Find maximum--------------------------------------------------------------
    // static void FindMax(int arr[],int index,int max){   
    //     if(index==arr.length){
    //         System.out.println(max);
    //         return;
    //     }
    //     if(max<arr[index])
    //     {
    //         max=arr[index];
    //     }
    //     FindMax(arr,index+1,max);
    // }


// static int FindMax(int arr[],int index){
//     if(index==arr.length-1){
//         return arr[index];
//     }

//     int small=FindMax(arr, index+1);
//     int ans=Math.max(small, arr[index]);

//     return ans;
//    }


//Sum of Elements-------------------------------------------------------------
//  static int SumofElement(int arr[],int index){
       
//         if(index==arr.length){
//             return 0;
//         }

//         int smallAns=SumofElement(arr, index+1);
//         return arr[index]+smallAns;

//     }


// X is exit or not------------------------------------------------------------------------------
// static Boolean IsExitOrNot(int arr[],int x,int index){
//         if(index==arr.length){
//             return false;
//         }
        
//         if(arr[index]==x){
//             return true;
//         }
        

//         return IsExitOrNot(arr, x, index+1);
//     }




// Return index of x-----------------------------------------------------------------------------------------------
// static int IsExitOrNot(int arr[],int x,int index){
//         if(index==arr.length){
//             return -1;
//         }
        
//         if(arr[index]==x){
//             return index;
//         }
        

//         return IsExitOrNot(arr, x, index+1);
//     }