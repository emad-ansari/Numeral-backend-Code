import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int roll_no;
        float marks;
        String name;
        name = in.next();
        roll_no = in.nextInt();
        marks = in.nextFloat();

        Student student1 = new Student(roll_no, marks, name);
        Student student2;




        student1.printData();

        System.out.println(student1.name);
//        System.out.println(student1.marks);
//        System.out.println(student1.roll_no);

    }



}
class Student {

    int roll_no;
    float marks;
    String name;
    Student (){

    }
    Student (int rolno, float mark, String name){
        this.roll_no = rolno;
        this.marks = mark;
        this.name = name;
    }

    void setData(int rolno, float mark, String name){
        this.roll_no = rolno;
        this.marks = mark;
        this.name = name;

    }

    void printData(){
        System.out.println("[ Name : " + name + " : Roll no : " + roll_no + " : Marks : " + marks + " ]");
    }
}

