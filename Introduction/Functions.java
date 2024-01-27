import java.util.*;

public class Functions{

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
           
        }
    }


    // public static int Sum(int a,int b){
    //     int sum=a*b;
    //     return sum;
    // }
    
    // public static void printFactorial(int n){
    //     int fact=1;
    //     if(n<0){
    //         System.out.println("Invalid number");
    //         return;
    //     }

    //     for(int i=1; i<=n; i++){
    //         fact=fact*i;
    //     }
    //     System.out.print(fact);
    //     return;
    // }




    // public static void evenOdd(int n){
    //     if(n%2==0){
    //         System.out.print("Even");
    //     }else{
    //         System.out.print("odd");
    //     }

    // }
 



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // printMyName(name);

        // int p=sc.nextInt();
        // int q=sc.nextInt();

        int n=sc.nextInt();

        // int a=Sum(p,q);
        // System.out.println(a);

        // printFactorial(n);
        // evenOdd(n);
        table(n);
        
        
    }
}




// returnType FunctionName(type arg1,type arg2, type arg3){
//     //operation
// }