import java.util.*;

public class PrimeNum {

    public static void PrimeNum(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            
            if(n%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.print("Number is prime");
        }else{
            System.out.print("Not prime");
        }
        
    }







    
    public static void Average(int a,int b,int c){
        int d=(a+b+c)/3;
        System.out.print("Average is"+d);
    }

    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
                
            }
            
        }
        System.out.print(sum);
    }
    public static void greaterOne(int p,int q){
        if(p>q){
            System.out.print(p+" is greater than"+q);
        }else{
            System.out.print(q+"is greater");
        }
    }

    public static void cirumCircle(int r){
        double c=2*r*3.14;
        System.out.print(c);
    }

    public static void EligibleOrNOt(int age){
        if(age>=18){
            System.out.print("eligible");
        }else{
            System.out.print("Not eligible");
        }
    }

    public static void raisPower(int a,int b){
        double power=Math.pow(a,b);
        System.out.print(power);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // Average(a,b,c);

        // PrimeNum(n);

        // int n=sc.nextInt();
        // sumOfOdd(n);

        // int p=sc.nextInt();
        // int q=sc.nextInt();
        // greaterOne(p,q);

        // int n=sc.nextInt();
        // cirumCircle(r);

        // EligibleOrNOt(n);
        // int i=1;
        // do{
        //     System.out.println(i);
        //     // i++;
        //     return;
        // }while(i>1);
        // System.out.print("enter number till where you want to print");
        // int n=sc.nextInt();
        // int count=0;
        // for(int i=1; i<=n; i++){
        //     if(i>0){
        //         count++;
        //     }
        //     System.out.println(i);
            
        // }System.out.println("Positive numbers are"+count);
    
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // raisPower(a,b);

        // common factors
        // int g=0;
        // for(int i=1; i<=b; i++){
        //     if(a%i==0 && b%i==0){
        //         g=i;
        //     }
        // }System.out.println(g);

        int n=sc.nextInt();
        int a=0,b=1;
        int c=0;
        while(c<=n){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
            
        }
    
    }
    
}
