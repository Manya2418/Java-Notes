public class Recursion_3 {
    
    public static int printStack(int x,int n){
    
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int next=printStack(x, n-1);
        int xpow=x*next;
        return xpow;
    }

    public static void main(String args[]){
        int x=2,n=5;
        int ans=printStack(x, n);
        System.out.print(ans);


    }
}
