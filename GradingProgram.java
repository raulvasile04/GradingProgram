package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GradingProgram {

    /** Scanner used for the user input **/
    static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        List<Student> students = studentsList();

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

            /** For-Each loop that loops through the Students list to look for the Student name from the user input **/
            for(Student student : students){
                    if (student.firstname.equals(firstnameValidation) && student.lastname.equals(lastnameValidation) && courseChoice.equals("1")) {
                       getMathsGrades(firstnameValidation , lastnameValidation);
                       break;
                    } else if(student.firstname.equals(firstnameValidation) && student.lastname.equals(lastnameValidation) && courseChoice.equals("2")) {
                        getEnglishGrades(firstnameValidation , lastnameValidation);
                        break;
                    }else if(student.firstname.equals(firstnameValidation) && student.lastname.equals(lastnameValidation) && courseChoice.equals("3")){
                        averageGradeCalculator(firstnameValidation , lastnameValidation);
                        break;
                    }
            }
        }else if(answer.equals("No")){
            System.out.println("Have a nice day !");
        }
    }

    /** This is a list of all the Students . It contains their first- and lastname and age
     * . It takes the parameters of the constructor in the Student class */
    public static List<Student> studentsList(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Raul", "Vasile", 17));
        students.add(new Student("Miruna", "Paun", 18));
        students.add(new Student("Rares", "Vasile", 15));
        students.add(new Student("Gucci", "Mane", 23));
        return students;
    }

    /** This is a List of the grades of the students participating in the 'Maths' course **/
    public static List<GradesInCourses> mathsGrades(){
        ArrayList<GradesInCourses> mathsStudents = new ArrayList<>();
        mathsStudents.add(new GradesInCourses("Raul" , "Vasile" , 3.0));
        mathsStudents.add(new GradesInCourses("Miruna" , "Paun" , 2.5));
        mathsStudents.add(new GradesInCourses("Rares" , "Vasile" , 1.7));
        mathsStudents.add(new GradesInCourses("Gucci" , "Mane" , 4.5));
        return mathsStudents;
    }

    /** This is a List of the grades of the students participating in the 'English' course **/
    public static List<GradesInCourses> englishGrades(){
        ArrayList<GradesInCourses> englishStudents = new ArrayList<>();
        englishStudents.add(new GradesInCourses("Raul" , "Vasile" , 2.0));
        englishStudents.add(new GradesInCourses("Miruna" , "Paun" , 1.5));
        englishStudents.add(new GradesInCourses("Rares" , "Vasile" , 1.3));
        englishStudents.add(new GradesInCourses("Gucci" , "Mane" , 1.0));
        return englishStudents;
    }

    /** This method calculates the average grade between the 'Maths' course and the 'English' course ,
     * and prints out that average grade */
    public static void averageGradeCalculator(String first , String last){
        for(GradesInCourses studentMaths : mathsGrades()){
            for(GradesInCourses studentEnglish : englishGrades()){
                if(studentMaths.firstname.equals(first) && studentEnglish.firstname.equals(first) &&
                   studentMaths.lastname.equals(last) && studentEnglish.lastname.equals(last)) {
                    double averageGrade = (studentMaths.gradeInCourse + studentEnglish.gradeInCourse) / 2;
                    System.out.println("Your average grade is " + averageGrade);
                    return;
                }
            }
        }
    }

    /** This method gets the grades of course 'Maths' of a specific student and prints it out **/
    public static void getMathsGrades(String first , String last){
        for(GradesInCourses studentGrade : mathsGrades()){
            if(studentGrade.firstname.equals(first) && studentGrade.lastname.equals(last)){
                System.out.println("Your grade is " + studentGrade.gradeInCourse);
                return;
            }
        }
    }

    /** This method gets the grades of course 'English' of a specific student and prints it out **/
    public static void getEnglishGrades(String first , String last){
        for(GradesInCourses studentGrade : englishGrades()){
            if(studentGrade.firstname.equals(first) && studentGrade.lastname.equals(last)){
                System.out.println("Your grade in english is " + studentGrade.gradeInCourse);
                return;
            }
        }
    }
}
