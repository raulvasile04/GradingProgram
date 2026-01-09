package school;

import java.util.HashMap;
import java.util.Map;

/** Public class that stores the Students name and grade in a course . Used in the GradingProgram **/
public class GradesInCourses {

    private Map<String , Integer > gradesPerCourse;

    public GradesInCourses(){
        gradesPerCourse = new HashMap<>();
    }

    public void addGrade(String course , int grade){
        gradesPerCourse.put(course , grade);
    }

    public Integer getGrade(String course){
        return gradesPerCourse.get(course);
    }

    public double getAverage(){
        int sum = 0 ;
        for(int grade : gradesPerCourse.values()){
            sum += grade;
        }
        return (double)sum / gradesPerCourse.size();
    }
}
