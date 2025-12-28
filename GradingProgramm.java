package GradingProgram;

import java.util.ArrayList;
import java.util.Scanner;
public class GradingProgramm {

    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student("Raul" , "Vasile" , 2.0 , 17));
        students.add(new Student("Miruna", "Paun" , 1.5 , 18));
        students.add(new Student("Rares" , "Vasile" , 1.0  , 15));
        students.add(new Student("Gucci" , "Mane" , 5.5 , 23));

        for(Student student : students){
            if(student.grade <= 2.0){
                System.out.println(student.firstname + student.lastname +" got the grade " + student.grade + " categorized as very good");
            }else if(student.grade > 2.0 && student.grade <= 3.0){
                System.out.println(student.firstname + student.lastname + " got the grade " + student.grade + " categorized as good");
            }else if(student.grade > 3.0 && student.grade <= 4.0){
                System.out.println(student.firstname + student.lastname + " got the grade " + student.grade + " categorized as not that good");
            }else if(student.grade > 4.0 && student.grade <= 5.0){
                System.out.println(student.firstname + student.lastname + " got the grade " + student.grade + " categorized as bad");
            }else{
                System.out.println(student.firstname + student.lastname + " got the grade " + student.grade + " categorized as really really bad");
            }
        }
    }
}
