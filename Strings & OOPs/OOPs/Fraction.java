public class Fraction{
    
    public static int gcd(int num,int den){
        int min=Math.min(num, den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return min;
    }
    static fraction add(fraction f1,fraction f2){
            int num=f1.num*f2.den+f2.num*f1.den;
            int den=f1.den*f2.den;
            fraction f3=new fraction(num, den);
            return f3;
        }
    
    static fraction add2(fraction f1,fraction f2){
            int num=f1.num*f2.den+f2.num*f1.den;
            int den=f1.den*f2.den;
            // f1=fraction(num,den);
            f1=new fraction(num, den);
            return f1;
        }
    static fraction substract(fraction f1,fraction f2){
            int num=f1.num*f2.den-(f2.num*f1.den);
            int den=f1.den*f2.den;
            f1=new fraction(num, den);
            return f1;
        }
    static fraction Multiply(fraction f1,fraction f2){
            int num=f1.num*f2.num;
            int den=f1.den*f2.den;
            fraction f3=new fraction(num, den);
            return f3;
        }

    public static class fraction {
        int num;
        int den;
        fraction(int a,int b){
            this.num=a;
            this.den=b;
            simplipy();
        }
        fraction(){

        }

        void simplipy(){
           int hcf=gcd(num,den);
           num/=hcf;
           den/=hcf;

        }
       
    }

    public static void main(String[] args) {
        
        fraction f1=new fraction(5,3);
        fraction f2=new fraction(7, 3);
        fraction f3=add(f1, f2);
        
        
        
        System.out.println(f3.num+"/"+f3.den);
    }
}
