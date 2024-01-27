import java.util.Scanner;

public class PrefixSufix {
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    static int calculateSum(int arr[]){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean PrefixSufixSum(int arr[]){
        int totalSum=calculateSum(arr);

        int pref=0;
        for(int i=0;i<arr.length;i++){
            pref+=arr[i]; 
            int suffix=totalSum-pref;
            if(pref==suffix){
                return true;
            }   
        }
        return false;
    }
    static int[] suffixSum(int arr[]){
        int totalSum=calculateSum(arr);
        int suffix[]=new int[arr.length];
        suffix[0]=totalSum;
        for(int i=1;i<arr.length;i++){
            suffix[i]=suffix[i-1]-arr[i-1];
        }
        return suffix;
    }
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // boolean ans=PrefixSufixSum(arr);
        int ans[]=suffixSum(arr);
        PrintArray(ans);
    }
}


// find suffix ---------------------------------------------------------------------
// static int[] suffixSum(int arr[]){
//         int totalSum=calculateSum(arr);
//         int suffix[]=new int[arr.length];
//         suffix[0]=totalSum;
//         for(int i=1;i<arr.length;i++){
//             suffix[i]=suffix[i-1]-arr[i-1];
//         }
//         return suffix;
//     }