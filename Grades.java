package school;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    List<Student> students = new ArrayList<>();

    public Grades (){
        Student student1 = new Student("Raul" , "Vasile" , 21);
        Student student2 = new Student("Rares" , "Vasile" , 13);
        Student student3 = new Student("Jon" , "Jones", 16);
        Student student4 = new Student("John" , "Cena" , 20);
        Student student5 = new Student("Mamma" , "Mia" , 18);
        Student student6 = new Student("Leo" , "Messi" , 18);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        MathsGrades();
        EnglishGrades();
        ScienceGrades();
        PE();
        Geography();
        Phisics();
        History();
    }

    public void MathsGrades(){
        students.get(0).getGrades().addGrade("Maths" , 3);
        students.get(1).getGrades().addGrade("Maths" , 2);
        students.get(2).getGrades().addGrade("Maths" , 1);
        students.get(3).getGrades().addGrade("Maths" , 4);
        students.get(4).getGrades().addGrade("Maths" , 5);
        students.get(5).getGrades().addGrade("Maths" , 3);
    }

    public void EnglishGrades(){
        students.get(0).getGrades().addGrade("English" , 3);
        students.get(1).getGrades().addGrade("English" , 2);
        students.get(2).getGrades().addGrade("English" , 5);
        students.get(3).getGrades().addGrade("English" , 4);
        students.get(4).getGrades().addGrade("English" , 6);
        students.get(5).getGrades().addGrade("English" , 1);
    }

    public void ScienceGrades(){
        students.get(0).getGrades().addGrade("Science" , 1);
        students.get(1).getGrades().addGrade("Science" , 4);
        students.get(2).getGrades().addGrade("Science" , 3);
        students.get(3).getGrades().addGrade("Science" , 2);
        students.get(4).getGrades().addGrade("Science" , 1);
        students.get(5).getGrades().addGrade("Science" , 6);
    }

    public void Phisics(){
        students.get(0).getGrades().addGrade("Phisics" , 2);
        students.get(1).getGrades().addGrade("Phisics" , 1);
        students.get(2).getGrades().addGrade("Phisics" , 6);
        students.get(3).getGrades().addGrade("Phisics" , 3);
        students.get(4).getGrades().addGrade("Phisics" , 2);
        students.get(5).getGrades().addGrade("Phisics" , 1);
    }

    public void History(){
        students.get(0).getGrades().addGrade("History" , 1);
        students.get(1).getGrades().addGrade("History" , 3);
        students.get(2).getGrades().addGrade("History" , 2);
        students.get(3).getGrades().addGrade("History" , 3);
        students.get(4).getGrades().addGrade("History" , 4);
        students.get(5).getGrades().addGrade("History" , 1);
    }

    public void Geography(){
        students.get(0).getGrades().addGrade("Geography" , 2);
        students.get(1).getGrades().addGrade("Geography" , 1);
        students.get(2).getGrades().addGrade("Geography" , 4);
        students.get(3).getGrades().addGrade("Geography" , 3);
        students.get(4).getGrades().addGrade("Geography" , 2);
        students.get(5).getGrades().addGrade("Geography" , 2);
    }

    public void PE(){
        students.get(0).getGrades().addGrade("PE" , 1);
        students.get(1).getGrades().addGrade("PE" , 1);
        students.get(2).getGrades().addGrade("PE" , 1);
        students.get(3).getGrades().addGrade("PE" , 1);
        students.get(4).getGrades().addGrade("PE" , 1);
        students.get(5).getGrades().addGrade("PE" , 1);
    }

    public Student findStudent(String firstname , String lastname){
        for(Student s : students){
            if(s.firstname.equals(firstname) && s.lastname.equals(lastname)){
                return s;
            }
        }
        return null;
    }
}
