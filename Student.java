package school;

/** Public class that stores Student data . Used in the GradingProgram **/
public class Student {

    public String firstname;
    public String lastname;
    public int age;
    private GradesInCourses grades;

    public Student(String firstname , String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.grades = new GradesInCourses();
    }

    public GradesInCourses getGrades(){
        return grades;
    }
}
