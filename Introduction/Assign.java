// import java.util.*;
// class Assign{
//     public static void main(String[] args){

//         Scanner sc= new Scanner(System.in); 
//         System.out.print("Enter number");
//         int choice=sc.nextInt();

//         switch (choice) {
//             case 1:
//              int n=sc.nextInt();
//                 if(n>=90){
//                     System.out.print("This is Good");
//                 }
//                 else if(n<=89 || n>=60){
//                     System.out.print("This is also Good");
//                 }
//                 else{
//                     System.out.print("This is Good as well");
//                 }
            
//                 break;
            
//             case 0:
//             break;
//             default:
//                 break;
//         }
//     }
// }

class Assign{
    public static void main (String [] args){
        int n=5;

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }






        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     }
    
        // for(int i=1; i<=n; i++){
        //     for(int j=i; j<=n-1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" "+i);
        //     }
        //     System.out.println();
        // }

    //     1
    //     212
    //    32123
    //   4321234
    //  543212345
        // for(int i=1; i<=n; i++){
        //      for(int j=1; j<=n-i; j++){

        //         System.out.print(" ");
        //      }
        //      for(int j=i; j>=1; j--){

        //         System.out.print(j);
        //      }
        //      for(int j=2; j<=i; j++){

        //         System.out.print(j);
        //      }
        //     System.out.println();}




        // for(int i=1; i<=n;i++){
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=n; i>=1;i--){
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++){
        //     for(int j=i; j<=4; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }








    //     *****
    //     *   *
    //    *   *
    //   *   *
    //  *****

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=5; j++){
        //         if(i==1||i==5 ||j==1||j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // *        *
        // **      **
        // * *    * *
        // *  *  *  *
        // *   **   *
        // *   **   *
        // *  *  *  *
        // * *    * *
        // **      **
        // *        *

        for(int i=1; i<=5; i++){
            for(int j=1;j<=i; j++){
                if(j==1|| j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i; j++){
                 if(j==1|| j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=5; i>=1; i--){
            for(int j=1;j<=i; j++){
                if(j==1|| j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i; j++){
                if(j==1|| j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

 

    }
}