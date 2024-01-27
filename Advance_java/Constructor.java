package Advance_java;

public class Constructor {

    String str_1="manya nidnd aa rhi bhut";
    int a,b;
    String str="Manya";
    void display(){
        System.out.println(str);
    } 
    Constructor(int x,int y) {
        System.out.println("within class");
    }
    int add(){
        return a+b;
    }
    int multi(){
        return a*b;
    }
    public static void main(String[] args) {
        Constructor obj1=new Constructor(12,42);
        System.out.println(obj1.add() );
        Constructor obj2=new Constructor(12,21);
        obj2.display();
        Constructor obj3=new Constructor(12,10 );
        obj3.display();
        App obj=new App();
        obj.printOutsideClass();
    }
}

class App{
    void printOutsideClass(){
        Constructor obj3=new Constructor(32, 3);

        System.out.println("Outside Class"+obj3.str);
    }
}


// access specifier

// if the method is declared by static keyword than it can be use without creating any object
// but if it not written with static then we have to create object for int

// create constructor---