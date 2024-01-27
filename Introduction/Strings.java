import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        // concatination

        // String firstName="My name is Manya";
        // String lname="manya";
        // String fullname=firstName+"@"+lname;
        // System.out.println(fullname);

        // String name=firstName.substring(11,firstName.length());

        // System.out.println(name);

        // System.out.println(fullname.length());

        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }


        // s1>s2  then +value
        // s1<s2 then -value
        // s1==s2 :0

        // if(firstName.compareTo(lname)==0){
        //     System.out.print("string is equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Tony")==new String("Tony")){
        //     System.out.println("Strings are are equal");
        // }else{
        //     System.out.println("string are not equal");
        // }

        // ParseInt and Tostring

        // String str="123";
        // int number=Integer.parseInt(str);
        // System.out.println(number);

        // int num=1231;
        // String str1=Integer.toString(num);
        // System.out.print(str1);

        Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int length=0;
        // String mystr[]=new String[size];
        // for(int i=0; i<size; i++){
        //     mystr[i]=sc.next();
        //     length+=mystr[i].length();

        // }
        // System.out.println(length);



// **********replacing e with i


    //     String str1=sc.nextLine();
    //     String result="";

    //     for(int i=0; i<str1.length(); i++){
    //         if(str1.charAt(i)=='e'){
    //             result+="i";
    //         }else{
    //             result+=str1.charAt(i);
    //         }
    //     }
    
    //     System.out.print(result);

        // String str2=sc.nextLine();
        // String username="";

        // for(int i=0; i<str2.length();i++){
            
        //     if(str2.charAt(i)=='@'){
                
        //         break;
        //     }else{
        //         username+=str2.charAt(i);
        //     }
        // }System.out.print(username);

        StringBuilder sb=new StringBuilder("Manya");

        // System.out.print(sb.charAt(0));
        // sb.setCharAt(1, 'p');
        // System.out.println(sb);
        // sb.insert(2,'o');
        // System.out.println(sb);


        // delete---(0,2)=0,1
        // sb.delete(0,2);
        // System.out.print(sb);

        // sb.append("hell");
        // System.out.println(sb);

        // System.out.println(sb.length());

        // reverse string

        String str=sc.nextLine();

        // for(int i=0;i<sb.length()/2;i++){
        //     int front=i;
        //     int back=sb.length()-1-i;

        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }
        // System.out.print(sb);

        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
         
        //     rev=rev+str.charAt(i);
        // }
        // System.out.println(rev);

        // using array

        // char a[]=str.toCharArray();
        // String rev="";
        
        // for(int i=a.length-1;i>=0;i--){
        //     rev=rev+a[i];
        // }
        // System.out.print(rev);

        System.out.print(sb.reverse());

        
    }
    
}
