public class RemoveDup {
    public static boolean[] map=new boolean[26];

    public static void removeDuplicate(String str,int index,String newstr){
        if(index==str.length()){
            System.out.print(newstr);
            return;
        }
        char current=str.charAt(index);
        if(map[current-'a']==true){
            removeDuplicate(str, index+1, newstr);
        }else{
            newstr+=current;
            map[current-'a']=true;
            removeDuplicate(str, index+1, newstr);
        }
    } 
    public static void main(String args[]){

        String str="asdjfksdjfaad";
        removeDuplicate(str, 0, "");
    }
}
