public class Recursion_5 {
    

    public static void reverseString(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }


    public static void main(String args[]){

        String str="Manya";
        int index=str.length()-1;
        
        reverseString(str,index);
    }
}
