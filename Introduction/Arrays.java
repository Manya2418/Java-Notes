import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        // int marks[]=new int[5];
        // marks[0]=92;
        // marks[1]=96;
        // marks[3]=94;

        // for(int i=0; i<=3; i++){
        //     System.out.println(marks[i]);
        // }
        // int rollNo[]={77,78,79,75,23};

        // System.out.println(rollNo[2]);

        // for(int i=0; i<5; i++){
        //     System.out.println(rollNo[i]);
        // }
        // int roll[]=new int[4];

        // for(int i=0; i<=3;i++){
        //     System.out.println(roll[i]);
        // }
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        // int a=5;
        int numbers[]=new int[size];

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        
        // int max=numbers[0];
        // for(int i=1; i<size; i++){
        //     if(numbers[i]>max){
        //         max=numbers[i];

        //     }
           
        // } System.out.print(max);

        int min=numbers[0];
        for(int i=1; i<size; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.print(min);

        // for(int i=0; i<size; i++){
        //    if(a==numbers[i]){
        //     System.out.print("Index is"+i);
        //    }
        // }
        // String names[]=new String[size];

        // for(int i=0; i<size; i++){
        //     names[i]=sc.next();
        // }

        // for(int i=0; i<size; i++){
        //     System.out.println(names[i]);
        // }
        

    }
}
