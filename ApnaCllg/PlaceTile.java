public class PlaceTile {

    public static int tileplace(int n,int m){

        if(n==m){
            return 2;

        }
        if(n<m){
            return 1;
        }
        int vertical=tileplace(n-m, m);

        int horizontal=tileplace(n-1, m);
        return vertical+horizontal;
    }

    public static void main(String args[]){

        int n=4,m=2;
        int ans=tileplace(n, m);
        System.out.println(ans);

    }
}