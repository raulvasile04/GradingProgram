package school;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private List<Student> students = new ArrayList<>();

    public Grades() {
        createStudents();
        assignGrades();
    }

    private void createStudents() {
        students.add(new Student("John", "Doe", 21));
        students.add(new Student("Miles", "Morales", 13));
        students.add(new Student("Biggie", "Smalls", 16));
        students.add(new Student("John", "Cena", 20));
        students.add(new Student("Mamma", "Mia", 18));
        students.add(new Student("Leo", "Messi", 18));
    }

    private void assignGrades() {
        assignMathGrades();
        assignEnglishGrades();
        assignScienceGrades();
        assignPEGrades();
        assignGeographyGrades();
        assignPhysicsGrades();
        assignHistoryGrades();
    }

    private void assignGrade(int studentIndex, String course, int grade) {
        students.get(studentIndex).getGrades().addGrade(course, grade);
    }

    private void assignMathGrades() {
        assignGrade(0, "Math", 3);
        assignGrade(1, "Math", 2);
        assignGrade(2, "Math", 1);
        assignGrade(3, "Math", 4);
        assignGrade(4, "Math", 5);
        assignGrade(5, "Math", 3);
    }

    private void assignEnglishGrades() {
        assignGrade(0, "English", 3);
        assignGrade(1, "English", 2);
        assignGrade(2, "English", 5);
        assignGrade(3, "English", 4);
        assignGrade(4, "English", 6);
        assignGrade(5, "English", 1);
    }

    private void assignScienceGrades() {
        assignGrade(0, "Science", 1);
        assignGrade(1, "Science", 4);
        assignGrade(2, "Science", 3);
        assignGrade(3, "Science", 2);
        assignGrade(4, "Science", 1);
        assignGrade(5, "Science", 6);
    }

    private void assignPhysicsGrades() {
        assignGrade(0, "Physics", 2);
        assignGrade(1, "Physics", 1);
        assignGrade(2, "Physics", 6);
        assignGrade(3, "Physics", 3);
        assignGrade(4, "Physics", 2);
        assignGrade(5, "Physics", 1);
    }

    private void assignHistoryGrades() {
        assignGrade(0, "History", 1);
        assignGrade(1, "History", 3);
        assignGrade(2, "History", 2);
        assignGrade(3, "History", 3);
        assignGrade(4, "History", 4);
        assignGrade(5, "History", 1);
    }

    private void assignGeographyGrades() {
        assignGrade(0, "Geography", 2);
        assignGrade(1, "Geography", 1);
        assignGrade(2, "Geography", 4);
        assignGrade(3, "Geography", 3);
        assignGrade(4, "Geography", 2);
        assignGrade(5, "Geography", 2);
    }

    private void assignPEGrades() {
        assignGrade(0, "PE", 1);
        assignGrade(1, "PE", 1);
        assignGrade(2, "PE", 1);
        assignGrade(3, "PE", 1);
        assignGrade(4, "PE", 1);
        assignGrade(5, "PE", 1);
    }

    public Student findStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return students;
    }
}