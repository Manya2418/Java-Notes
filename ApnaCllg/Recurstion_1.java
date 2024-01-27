public class Recurstion_1 {

    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    // sum of natural numbers
    public static void sumNum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        sumNum(i+1, n, sum);
    }


    public static void main(String args[]){
        int n=5;
        printNum(n);

        sumNum(1,10,0);

    }
}
