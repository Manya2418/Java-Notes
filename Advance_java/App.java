
public class App {
    
    static String str="Manya sahu";

    public static void main(String[] args) {
        App obj=new App();

        // System.out.println(str);
        

        App2 obj2=new App2();
        obj2.printName();

        App3 obj4=new App3();
        obj4.printN();

        // AppN object=new AppN();
        // System.out.println(object.str);//private

    }
}

class App2{
    void printName(){
        App obj=new App();
        System.out.println(obj.str);
    }
}
class App3 extends App2{
    void printN(){
        App obj=new App();
        System.out.println("I am inherited class and result is "+obj.str);
    }
}

class App4 extends App{
    void printN(){
        App obj=new App();
        System.out.println(obj.str);
    }
}
