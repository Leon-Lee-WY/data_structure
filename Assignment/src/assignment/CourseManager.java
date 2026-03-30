package assignment;
import java.util.ArrayList;
public class CourseManager<T extends Course> {
    ArrayList<T> courses;
    CourseManager(){
        courses=new ArrayList();
    }
    public void addCourse(T course){
        courses.add(course);
    }
    public void removeCourse(String courseCode){
        for (int i=0;i<courses.size();i++){
            if (courses.get(i).getCourseCode().equalsIgnoreCase(courseCode)) {
                courses.remove(i);
                break;
            }
        }
    }
    public T getCourseWithHighestWorkload(){
        T high=courses.get(0);
        for(int i=0;i<courses.size()-1;i++){
            if(courses.get(i).calculateTotalWorkload()>courses.get(i+1).calculateTotalWorkload()){
                high=courses.get(i);
            }
        }
        return high;
    }
    
    public void sortCoursesbyWorkload(){
        for(int i=0;i<courses.size()-1;i++){
            for(int j=0;j<courses.size()-1-i;j++){
                if(courses.get(j).calculateTotalWorkload()>courses.get(j+1).calculateTotalWorkload()){
                    T temp=courses.get(j);
                    courses.set(j, courses.get(j+1));
                    courses.set(j+1, temp);
                }
            }
        }
    }
    public void printAllCourse(){
        for(T x:courses){
            x.printCourseDetails();
            System.out.println("");
        }
    }
}
