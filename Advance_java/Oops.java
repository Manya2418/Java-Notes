import java.util.Scanner;

class person{
    String name="Manya";
    int age=24;

    public static void welcome(String name){
        System.out.println("Hey welcome "+name);
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}


public class Oops {

    static int sum(int a){
        a=a*10;
        return a;
    } 

    static void change(int val){
        System.out.println("This is from change"+val);

    }
    static void psum(){
        int value=32;
        change(value);
        System.out.println(value);
    }
  
    public static void main(String[] args) {
        
        person manya=new person();
        person suman=new person();
        person operation=new person();

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        manya.sum(a, b);
        sum(a);
        
        System.out.println("Your answer is ");
        suman.name="suman";
        suman.age=23;
        App obj=new App();

        person.welcome(null);
        System.out.println(suman.name);
        System.out.println(suman.age); 
        System.out.println(manya.name);
        System.out.println(manya.age);

        person.welcome(manya.name);
        
        
        System.out.println("value of a before changing "+a);

        // sum(5);
        System.out.println("value of a after changing "+a);
        change(a);
        psum();
        System.out.println((540*441)/4);
        

    
    }
    
}




// 1.method signature = methodname+parameteres
// static= modifier(non access modifier) - we can directly call methods no need to create object in it




// constructor-special method used to initialize object.
// constructor does not have any return type
// its name same with class


// formal parameter= defined during function defintation
// int sum(int a,int b)---formal parameter(it copies the value)

// parameter whcih we assign during calling are called actual parameter

//pass by value and pass by reference ---copies the value of actual parameter

// scope of variable
// class level scope
// block level scope
// method level scope

// memory allocation in array
// primitive data,references,function----stack memory
// heap--objects--Array is also an object then address stored in statck