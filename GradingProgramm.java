package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GradingProgramm {

    static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Student> gradesByCourse = new ArrayList<>();
        List<Student> students = studentsList();
        List<GradesInCourses> gradeInMaths = mathsGrades();
        List<GradesInCourses> gradeInEnglish = englishGrades();


        System.out.println("Welcome to the Grading tool , would you like to look for your grade?");
        System.out.println("Choose 'Yes' or 'No' .");
        String answer = scanner.nextLine();

        if(answer.equals("Yes")){
            System.out.println("Please enter your firstname");
            String firstnameValidation = scanner.nextLine();
            System.out.println("Please enter your lastname");
            String lastnameValidation = scanner.nextLine();
            System.out.println("For which course would you like to know?");
            System.out.println("1 . Maths");
            System.out.println("2 . English");
            System.out.println("3 . Average grade");
            String courseChoice = scanner.nextLine();
            for(Student student : students){
                    if (student.firstname.equals(firstnameValidation) && student.lastname.equals(lastnameValidation) && courseChoice.equals(1)) {
                        System.out.println("Your grade in Maths is " + gradeInMaths);
                    } else {
                        System.out.println("You are not on the list");
                        break;
                    }
            }
        }else if(answer.equals("No")){
            System.out.println("Have a nice day !");
        }
    }

    public static List<Student> studentsList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Raul", "Vasile", 17));
        students.add(new Student("Miruna", "Paun", 18));
        students.add(new Student("Rares", "Vasile", 15));
        students.add(new Student("Gucci", "Mane", 23));
        return students;
    }

    public static List<GradesInCourses> mathsGrades(){
        ArrayList<GradesInCourses> mathsStudents = new ArrayList<>();
        mathsStudents.add(new GradesInCourses("Raul" , "Vasile" , 3.0));
        return mathsStudents;
    }

    public static List<GradesInCourses> englishGrades(){
        ArrayList<GradesInCourses> studentGrades = new ArrayList<>();
        studentGrades.add(new GradesInCourses("Raul" , "Vasile" , 2.0));
        return studentGrades;
    }

    public static double averageGradeCalculator(){
        List<GradesInCourses> mathsGrades = mathsGrades();
        List<GradesInCourses> englishGrades = englishGrades();
        for(GradesInCourses studentMaths : mathsGrades){
            for(GradesInCourses studentEnglish : englishGrades){
                double averageGrade = (studentMaths.gradeInCourse + studentEnglish.gradeInCourse) / 2 ;
                return averageGrade;
            }
        }
       return averageGradeCalculator();
    }
}
