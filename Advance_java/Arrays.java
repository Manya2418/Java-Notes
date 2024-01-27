// import java.util.Scanner;


public class Arrays {
    
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void change(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        
        printArray(arr);

    }

    public static void main(String[] args) {
        
        int arr[]={1,2,23,5};

        // same references

        // int arr2[]=arr; //shallow copy
        // int arr2[]=arr.clone(); //deep copy 1st method

        // in java.util class we have copy method which we take to parameter(arr.new length);
        // int arr2[]=java.util.Arrays.copyOf(arr,arr.length);
        
        int arr2[]=java.util.Arrays.copyOfRange(arr,1,3);
        // int num=12;
        printArray(arr);
        System.out.println();
        printArray(arr2);
        System.out.println();
        change(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        printArray(arr2);
        
    
        
    }
}

// java mai pass by value hota hai then array ki copy bnegi it goes to address and can change


// taking input of array and display
// for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0; j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+"  ");
//             }
//             System.out.println();
//         }



// find sum of array element-----------------------------------------------------
// int sum=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0; j<arr[i].length;j++){
//                 sum=sum+arr[i][j];
                
//             }
            
//         }
//         System.out.println("Your ans is "+sum);
        

// find max value in array-----------------------------------------------------
// int max=0;
//         for(int i=0;i<arr.length;i++){

            
//             if(max<arr[i]){
//                 max=arr[i];
//             }
            
//         }
//         System.out.println(max);



// find x in given array-----------------------------------------------
// int x=5;
//         int index=-1;
//        for(int i=0;i<arr.length;i++){
            
//             if(arr[i]==x){
//                 index=i;
//             }

            
//         }
//         System.out.println(index);
        