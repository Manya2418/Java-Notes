public class Subsequence {
    
    public static void subSequence(String str,int index,String newString){
        
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);
        subSequence(str, index+1, newString+currChar);
        subSequence(str, index+1, newString);
    }

    public static void main(String args[]){
    String str="abcde";
    subSequence(str, 0, "");
    }
}

// abc ke subseuence ------sequence will not change
// abc, ab, ac, bc , a, b, c 