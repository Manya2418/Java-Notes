import java.util.Scanner;

public class Practice {

    static int[] PrifixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static int FindSum(int arr[],int start,int last){
        int prifix[]=PrifixSum(arr);
        int ans=prifix[last]-arr[start-1];
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8]; //5 nu size aray
        System.out.println("Enter Array");
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter query");
        int n=sc.nextInt();
        while (n!=0) {
            System.out.println("Enter range");
            int st=sc.nextInt();
            int last=sc.nextInt();
            int ans=FindSum(arr,st,last);
            System.out.println("Your ans i"+ans);
            n--;
        }
        
    }
}