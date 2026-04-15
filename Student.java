package school;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private GradesInCourses grades;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = new GradesInCourses();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public GradesInCourses getGrades() {
        return grades;
    }
}