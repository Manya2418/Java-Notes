public class Movex {
    

    public static void moveStrEnd(String str,int count,int index,char elem,String str2){
        
        if(index==str.length()){
            for(int i=0; i<count;i++){
                str2+=elem;
            }
            System.out.println(str2);
            return;
        }
        char current=str.charAt(index);

        if(current==elem){
            count++;
        }else{
            str2+=current;
        }
        moveStrEnd(str,count,index+1, elem,str2);
      
}
        

    public static void main(String args[]){
        String str="axbcxxd";

        moveStrEnd(str,0,0,'x',"");
    }
}
