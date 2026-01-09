package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GradingProgram {

    /**
     * Scanner used for the user input
     **/
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Grades data = new Grades();

        System.out.println("Welcome to the Grading tool , would you like to look for your grade?");
        System.out.println("Choose 'Yes' or 'No' .");
        String answer = scanner.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("Please enter your firstname");
            String firstnameValidation = scanner.nextLine();
            System.out.println("Please enter your lastname");
            String lastnameValidation = scanner.nextLine();

            Student found = data.findStudent(firstnameValidation, lastnameValidation);

            if (found == null) {
                System.out.println("Student not found");
            } else {
                System.out.println("For which course would you like to know?");
                System.out.println("1 . Maths");
                System.out.println("2 . English");
                System.out.println("3 . Science");
                System.out.println("4 . History");
                System.out.println("5 . Geography");
                System.out.println("6 . Phisics");
                System.out.println("7 . PE");
                System.out.println("8 . Average Grade");
                String courseChoice = scanner.nextLine();

                switch (courseChoice) {
                    case "1" -> System.out.println("Maths grade : " + found.getGrades().getGrade("Maths"));
                    case "2" -> System.out.println("English grade : " + found.getGrades().getGrade("English"));
                    case "3" -> System.out.println("Science grade :" + found.getGrades().getGrade("Science"));
                    case "4" -> System.out.println("Science grade :" + found.getGrades().getGrade("History"));
                    case "5" -> System.out.println("Science grade :" + found.getGrades().getGrade("Geography"));
                    case "6" -> System.out.println("Science grade :" + found.getGrades().getGrade("Phisics"));
                    case "7" -> System.out.println("Science grade :" + found.getGrades().getGrade("PE"));
                    case "8" -> System.out.println("Average grade : " + found.getGrades().getAverage());
                }
            }
        }
    }
}
