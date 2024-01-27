import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArraylistExamp {


     //reverse array list
    static void reverse(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;

        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l1=new ArrayList<>();

        ArrayList<String> l2=new ArrayList<>();

        //    adding new items
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add(16);

        // Collections.reverse(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1); 

        l2.add("wel");
        l2.add("new");
        l2.add("manya");

        Collections.sort(l2);
        System.out.println(l2);

       
    }
}


//  // ArrayList<Float> l2=new ArrayList<>();
//         // ArrayList<Boolean> l3=new ArrayList<>();

//         //adding new items
//         l1.add(12);
//         l1.add(13);
//         l1.add(14);
//         l1.add(15);
//         l1.add(16);

//         //get by index
//         System.out.println(l1.get(2));
//         System.out.println(l1.get(1));


//         //print all element
//         for(int i=0;i<l1.size();i++){
//             System.out.println(l1.get(i));
//         }

//         //print in [] bracket
//         System.out.println(l1);


//         //adding element in given index
//         l1.add(1,101);
//         System.out.println(l1.get(1));


//         l1.set(2,1001);
//         System.out.println(l1);


//         //removing element
//         l1.remove(2);
//         System.out.println(l1);

//         //remove by name
//         l1.remove(Integer.valueOf(14));
//         System.out.println(l1);

//         // System.out.println(l1.remove(Integer.valueOf(14)));

//         System.err.println(l1.contains(101));


//         //without using data type we can also add multple type of data type

//         ArrayList l2=new ArrayList();

//         l2.add("Psdf");
//         l2.add(312);
//         l2.add(123.41);

//         System.out.println(l2);
