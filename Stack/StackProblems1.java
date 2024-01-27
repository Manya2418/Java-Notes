import java.util.Stack;

public class StackProblems1 {

    static int[] NextGreater(int arr[]){

        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        st.push(arr[arr.length-1]);
        for(int i=arr.length-1;i>=0;i++){
            int curr=arr[i];
            while (st.peek()<curr) {
                st.pop();
            }
            if(st.peek()<curr){
                ans[i]=st.peek();
            }
            if(st.size()==0){
                ans[i]=curr;
            }
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        //Remove consequtive

        int arr[]={1,3,2,1,8,6,3,4};
        int ans[]=NextGreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


// static boolean isBalanced(String str){
//     Stack<Character> st=new Stack<>();
//     int n=str.length();
//     for(int i=0;i<n;i++){
//         char ch=str.charAt(i);
//         if(ch=='('){
//             st.push(ch);
//         }else{
//             if(st.size()==0){
//                 return false;
//             }
//             if(st.peek()=='('){
//                 st.pop();
//             }
//         }
//     }
//     if(st.size()==0){
//         return true;
//     }else{
//         return false;
//     }
// }


//Find minimum number of element that should be delete for balanced brackets
// static int isBalanced(String str){
//     Stack<Character> st=new Stack<>();
//     int count=0;
//     int count2=0;
//     int n=str.length();
//     for(int i=0;i<n;i++){
//         char ch=str.charAt(i);
//         if(ch=='('){
//             st.push(ch);
//             count++;
//         }else{
//             count2++;
//         }
//     }
//     if(count>count2){
//         return count-count2;
//     }else{
//         return count2-count;
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st=new Stack<>();
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch=='(' || ch=='{' || ch=='['){
//                 st.push(ch);
//             }
//             else if(st.size()==0){
//                 return false;
//             }
//             else if(st.peek()=='(' && ch==')'){
//                 st.pop();
//             }
//             else if(st.peek()=='{' && ch=='}'){
//                 st.pop();
//             }else if(st.peek()=='[' && ch==']'){
//                 st.pop();
//             }else{
//                 return false;
//             }
//         }
//         if(st.size()==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }


// static int[] RemoveCon(int arr[]){
//     Stack<Integer> st=new Stack<>();
//     for(int i=0;i<arr.length;i++){
//         int curr=arr[i];
//         if(st.size()==0 || st.peek()!=curr){
//             st.push(curr);
//         }
//         else if(st.peek()==curr){
//             if(i==arr.length-1 || curr!=arr[i+1]){
//                 st.pop();
//             } 
//         }
//     }
//     int ans[]=new int[st.size()];
//     for(int i=st.size()-1;i>=0;i--){
//         ans[i]=st.pop();
//     }
//     return ans;
// }



// static int[] NextGreater(int arr[]){
//     int ans[]=new int[arr.length];
//     for(int i=0;i<arr.length;i++){
//         ans[i]=-1;
//         for(int j=i+1;j<arr.length;j++){      
//             if(arr[i]<arr[j]){
//                 ans[i]=arr[j];
//                 break;
//             }
//         }
//     }
//     return ans;
// }



















