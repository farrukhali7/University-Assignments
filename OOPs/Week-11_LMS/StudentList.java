import java.util.ArrayList;
import java.util.Collections;

public class StudentList implements Cloneable{
    private ArrayList<Student> ss;

    public StudentList(){
        this.ss = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> ss){
        this.ss = new ArrayList<>(ss);
    }

    //copy constructor will make a deep copy in the arrayList
    public StudentList(StudentList other){
        this.ss = new ArrayList<>(other.ss);
    }

    //add method
    public String addStudent(Student s){
        ss.add(s);
        return "Student " + s + " has been successfully added to the List!";
    }

    //remove method
    public String removeStudent(Student s){
            if (ss.contains(s)) {   //contains method checks all the elements in the List so no need of loop.
                ss.remove(s);
                return "The Student " + s + " has been removed";
            }else if(!ss.contains(s)){
                return "Student is not present in the List";
            }else{
                return "An error has been occured";
            }
    }

    //find method
    public String findStudent(Student s){
        for(int i = 0 ; i <ss.size();i++ ){
            if (ss.get(i).equals(s)) {
                return "Student " + s + " is present in the list at" + i;
            }
        }
        return "Student is not present";
    }

    //Sorting method
    public void sortingArray(ArrayList<Student> ss){
        Collections.sort(ss);
    }

    //shallowcopy
    @Override
    public Object clone() throws CloneNotSupportedException{
        StudentList shallowCopy = (StudentList) super.clone();
        shallowCopyCopy.ss = new ArrayList<>(this.ss);
        return shallowCopy;
    }

    @Override //The method return ss.toString(); Converts the entire ArrayList<Student> into a single string. Each Student is printed using that object’s own toString() method from your Student class.
    public String toString(){
        return ss.toString();
    }

}