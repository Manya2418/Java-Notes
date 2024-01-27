public class Permutation {
    

    public static void printPerm(String str, String permutation,int index){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length();i++){
            char current=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permutation+current,index+1);  
        }
    }
                                  
    public static void main(String args[]){
        String str="ABC";
        printPerm(str,"",0);
    }
}
