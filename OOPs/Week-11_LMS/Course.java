public class Course implements Cloneable {
    private String courseName;
    private String code;

    public Course(){
        this.courseName = "nothing";
        this.code = "nothing";
    }

    public Course(String courseName, String code){
        this.courseName = courseName;
        this.code = code;
    }

    public Course(Course other){
        this.courseName = other.courseName;
        this.code = other.code;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }

    //shallow copy
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Course name= " + courseName + " and the code is= " + code;
    }
}