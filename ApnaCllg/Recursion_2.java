public class Recursion_2 {
    
    public static int printFact(int n){
        if(n==1){
            return 1;
        }
        int fact_num=printFact(n-1);
        int fact=n*fact_num;
        return fact;
    }



    public static void main(String args[]){
        int n=4;

        int num=printFact(n);
        System.out.println(num);
    }
}
