import java.util.ArrayList;
import java.util.Collections;

public class CourseList implements Cloneable{
    private ArrayList<Course> cc;

    public CourseList(){
        this.cc = new ArrayList<>();
    }

    public CourseList(ArrayList<> cc){
        this.cc = new ArrayList<>(cc);
    }

    public CourseList(CourseList other){
        this.cc = new ArrayList<>(other.cc);
    }

    //Add course
    public void addCourse(Course c){
        cc.add(c);
    }

    //remove course
    public removeCourse(Course c){
        if (cc.contains(c)) {
            cc.remove(c);
        }else{
            return "can't find the course";
        }
    }

    //find course
    public findCourse(Course c){
        for(int i=0 ; i < cc.size();i++){
            if (cc.contains(c)) {
                return "Course is present in the List at " + cc.get(i);
            }else{
                return "Course is not present in the list!";
            }
        }
    }

    //Sorting
    public SortingCourseList(Course c){
        Collections.sort(cc);
    }

    //shallow copy
    public Object clone() throws CloneNotSupportedException{
        CourseList shallowCopy = (CourseList) super.clone();
        shallowCopy.cc = new ArrayList<>(this.cc);
        return shallowCopy;
    }


    @Override
    public String toString(){
        return cc.toString();
    }
}
