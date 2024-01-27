public class CountPath {
    
    public static int countPath(int i,int j,int n,int m){
        if(i==n|| j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downpaths=countPath(i+1, j, n, m);
        
        int rightpath=countPath(i, j+1, n, m);
    
        return downpaths+rightpath;
    }


    public static void main(String[] args) {
        
        int n=3,m=3;
        int ans=countPath(0,0,n,m);
        
        System.out.println(ans);
    }
}
