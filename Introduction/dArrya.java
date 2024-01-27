import java.util.Scanner;

public class dArrya {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter your row number");
        int n=sc.nextInt();
        
        System.out.println("Enter your column number");
        int m=sc.nextInt();

        int array[][]=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j]=sc.nextInt();
               
            }
        }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter number for search number");
        int x=sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(array[i][j]==x){
                
                    System.out.println("The index of "+x+" is "+i+j);
                }
            }
        }
    }
}


// 29450000555