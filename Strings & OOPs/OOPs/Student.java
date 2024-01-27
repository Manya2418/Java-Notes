public class Student {
    String name;
    static int rollNo;
    double percentage;
    final String school="BBps";
    private static int numberofstudent;
    public int get(){
        return rollNo;
    }
    public int Set(int rollNo){
        return  rollNo;
    }

    public Student(){

    }
    static public int getStudents(){
        return numberofstudent;
    }
    public Student(String name,int rollNo,double percentage){
        this.name=name;
        this.rollNo=rollNo;
        this.percentage=percentage;
        numberofstudent++;
        
    }

}
