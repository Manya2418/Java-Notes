// recurstion on String
// import java.util.ArrayList;
import java.util.Scanner;
public class Recursion3 {

    static void KeypadCombination(String digit,String[] keypad,String result){
        if(digit.length()==0){
            System.out.print(result+" ");
            return;
        }

        int curr=digit.charAt(0)-'0';//2

        String choices=keypad[curr];
        
        for(int i=0;i<choices.length();i++){
            KeypadCombination(digit.substring(1), keypad, result+choices.charAt(i));
        }
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //keypad Combination

        String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String digit="232";
        KeypadCombination(digit, keypad, "");
    }
    }




//  Remove all the occurrence if 'a' from string s="abcax"------------------------------------------------- 
//  for(int i=0;i<str.length();i++){
//     String ans="";
//     if(str.charAt(i)!='a'){
//         ans+=str.charAt(i);
//     }
//     System.out.print(ans);
//     }



//  static String RemoveA(String str,int index,String ans){
//         if(index==str.length()){
//             return ans;
//         }
//         if(str.charAt(index)!='a'){
//             ans+=str.charAt(index);
//         }                     
//         return RemoveA(str, index+1,ans);
//     }


    // static String RemoveA(String str,int index){
    //    if(index==str.length()){
    //     return "";
    //    }

    //    String smallans=RemoveA(str, index+1);
    //    char curr=str.charAt(index);
    //    if(curr!='a'){
    //     return curr+smallans;
    //    }else{
    //     return smallans;
    //    }  // }


//using substriing remove a------------------------------------------------------------------------
    // static String RemoveA(String str){
    //    //withoutusing 
    //    if(str.length()==0){
    //     return "";
    //    }
    //    String smallans=RemoveA(str.substring(1));
    //    char curr=str.charAt(0);
    //    if(curr!='a'){
    //     return curr+smallans;
    //    }
    //    else{
    //     return smallans;
    //    }

    // }

//  Reverse string using Recursion-----------------------------------------------------------------------
//  static String ReverseStr(String str,int index){

//         if(index==str.length()){
//             return "";
//         }

//         String smallans=ReverseStr(str, index+1);
//         char curr=str.charAt(index);
//         return smallans+curr;
//     }



// Check string is pallindrome or not---------------------------------------------------------------------------
//  static boolean CheckPallindrome(String str,int left,int right){

//         if(left>=right){
//             return true;
//         }
//         return (str.charAt(left)==str.charAt(right) && CheckPallindrome(str, left+1, right-1));
// }


// Print subSequences-------------------------------------------------------------------------------------------
// static ArrayList<String> getSubseq(String str){
//     ArrayList<String> ans=new ArrayList<>();

//     if(str.length()==0){
//         ans.add("");
//         return ans;
//     }
//     char curr=str.charAt(0);
//     ArrayList<String> smallans=getSubseq(str.substring(1));
//     for(String ss:smallans){
//         ans.add(ss);
//         ans.add(curr+ss);
//     }

//     return ans;
//  }


//  SubSequence------------------------------------------------------------------
//  static void subSequences(String str,String currAns){
//         if(str.length()==0){
//             System.out.println(currAns);
//             return;
//         }
//         //string=   abc
//         char ch=str.charAt(0);  //a
//         String smallans=str.substring(1);   //bc
//         subSequences(smallans, currAns+ch);     
//         subSequences(smallans, currAns);
//     }
   




    // static void SumofSubsets(int arr[],int index,int sum){
    //     if(index==arr.length){
    //         System.out.println(sum);
    //         return;
    //     }

    //     SumofSubsets(arr, index+1, sum+arr[index]);
    //     SumofSubsets(arr, index+1, sum);
    // }
   
//Frog Jumps-----------------------------------------------------------------------------------------
// static int FrogJumps(int arr[],int n,int index){
//         if(index==n-1){
//             return 0;
//         }
//         int opt1=Math.abs(arr[index+1]-arr[index])+FrogJumps(arr,n, index+1);
//         if(index==n-2){
//             return opt1;
//         }
//         int opt2=Math.abs(arr[index+2]-arr[index])+FrogJumps(arr,n, index+2);
//         return Math.min(opt1, opt2);
//     }