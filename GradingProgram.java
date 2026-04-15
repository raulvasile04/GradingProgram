package school;

import java.util.Scanner;

public class GradingProgram {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Grades data = new Grades();

        System.out.println("Welcome to the grading tool.");
        System.out.println("Would you like to look up a student's grade? (Yes/No)");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter the student's first name:");
            String firstName = scanner.nextLine();

            System.out.println("Please enter the student's last name:");
            String lastName = scanner.nextLine();

            Student foundStudent = data.findStudent(firstName, lastName);

            if (foundStudent == null) {
                System.out.println("Student not found.");
                return;
            }

            System.out.println("Select a course:");
            System.out.println("1. Math");
            System.out.println("2. English");
            System.out.println("3. Science");
            System.out.println("4. History");
            System.out.println("5. Geography");
            System.out.println("6. Physics");
            System.out.println("7. PE");
            System.out.println("8. Average Grade");

            String courseChoice = scanner.nextLine();

            switch (courseChoice) {
                case "1" -> System.out.println("Math grade: " + foundStudent.getGrades().getGrade("Math"));
                case "2" -> System.out.println("English grade: " + foundStudent.getGrades().getGrade("English"));
                case "3" -> System.out.println("Science grade: " + foundStudent.getGrades().getGrade("Science"));
                case "4" -> System.out.println("History grade: " + foundStudent.getGrades().getGrade("History"));
                case "5" -> System.out.println("Geography grade: " + foundStudent.getGrades().getGrade("Geography"));
                case "6" -> System.out.println("Physics grade: " + foundStudent.getGrades().getGrade("Physics"));
                case "7" -> System.out.println("PE grade: " + foundStudent.getGrades().getGrade("PE"));
                case "8" -> System.out.printf("Average grade: %.2f%n", foundStudent.getGrades().getAverage());
                default -> System.out.println("Invalid choice.");
            }
        } else if (answer.equalsIgnoreCase("No")) {
            System.out.println("Program ended.");
        } else {
            System.out.println("Invalid input. Please restart the program and enter Yes or No.");
        }
    }
}