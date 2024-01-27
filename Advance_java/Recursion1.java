public class Recursion1 {

    static int GreatestCommon(int a,int b){
        if(b==0){
            return a;
        }

        return GreatestCommon(b, a%b);
    
    }
   

    public static void main(String[] args) { 
        
        //greatest common divisor

        int ans=GreatestCommon(15,24);
        System.out.println(ans);

    }
}



// static void PrintNumbers(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//          System.out.println(n);
//         PrintNumbers(n-1);   
//     }

// //factorial 
//     static int factorial(int n){
//         // 6=6*5*4*3*2*1
//         if(n==0){
//             return 1;
//         }
//         int fact=factorial(n-1);
//         int ans=fact*n;
//         return ans;       
//     }



//Fibonaachi seriex--------------------------------------------------------------
//   static int Fibbonachi(int n){
//         if(n==0||n==1){
//             return n;
//         }
//         return  Fibbonachi(n-1)+Fibbonachi(n-2);
//     }



// SUM OF DIGITS-----------------------------------------------------------------------------
// static int SumDigit(int n){
//         if(n>=0 && n<=9){
//             return n;
//         }     
//         return SumDigit(n/10)+n%10;   
//     }


//Count digit in a given number--------------------------------------------------------------
// static int CountOfDigits(int n){
//         if(n/10==0){
//             return 1;
//         }
//         return CountOfDigits(n/10)+1;
//     }
    
//calculate power ------------------------------------------------------------------------------------
// int sum=1,p=2,q=5;
//         for(int i=1;i<=q;i++){
//             sum*=p;   
//         }
//         System.out.println(sum);


// static int CalculatePower(int p,int q){
//     int ans=1;
//     if(q==0){
//         return 1;
//     }
 //      return ans*CalculatePower(p, q-1)*p;
 // }


//   static int CalculatePower(int p,int q){
//         if(q==0){
//             return 1;
//         }
//         if(q%2==0){
//             return CalculatePower(p, q/2)*CalculatePower(p, q/2);
//         }return CalculatePower(p, q/2)*CalculatePower(p, q/2)*p;
//     }

//Calculate Multiples----------------------------------------------------------------------------
// static void CalculateMultiple(int n,int k){
//         if(k==1){
//             System.out.println(n);
//             return;
//         }
//         CalculateMultiple(n, k-1);
//         System.out.println(n*k);
//     }

//sum of natural numbers---------------------------------------------------------------------------------------------------
//  static int SumofNaturalNum(int n){
//         if(n==1){
//             return 1;
//         }
//         if(n%2==0){
//             return SumofNaturalNum(n-1)-n;
//         }
//         return SumofNaturalNum(n-1)+n;
//     }

//  Find Greatest common divisor--------------------------------------------------------------------------------------------------
// int a=120,b=105,index=0;
// for(int i=1;i<=12;i++){
//     if(a%i==0 && b%i==0){
//         index=i;
// }}
// System.out.println(index);

//  static int GreatestCommon(int a,int b){
//         while(a%b!=0){
//             int rem=a%b;
//             a=b;
//             b=rem;
//         }
//         return b;
//     }