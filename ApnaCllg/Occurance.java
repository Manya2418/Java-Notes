public class Occurance{



    public static int first=-1,last=-1;

    public static void occurFirstLast(String str,int index,char elem){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char current=str.charAt(index);
        if(current==elem){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        occurFirstLast(str,index+1,elem);
    }

    public static void main(String args[]){

        String str="ada";

        occurFirstLast(str,0,'a');



    }
}