package school;

import java.util.HashMap;
import java.util.Map;

public class GradesInCourses {

    private Map<String, Integer> gradesPerCourse;

    public GradesInCourses() {
        gradesPerCourse = new HashMap<>();
    }

    public void addGrade(String course, int grade) {
        gradesPerCourse.put(course, grade);
    }

    public Integer getGrade(String course) {
        return gradesPerCourse.get(course);
    }

    public double getAverage() {
        if (gradesPerCourse.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : gradesPerCourse.values()) {
            sum += grade;
        }

        return (double) sum / gradesPerCourse.size();
    }
}