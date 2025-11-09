public class Student implements Cloneable, Comparable<Student>{
    private String name;
    private int ID;

    //default constructor
    public Student(){
        this.name = "Unknown";
        this.ID = 0000;
    }

    //parameterized constructor
    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    //copy constructor
    public Student(Student other){
        this.name = other.name;
        this.ID = other.ID;
    }

    //Setters and Getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

        public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }

    public int compareTo(Student other){
        return this.ID - other.ID;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Student name is: " + name + " and it's ID is:" +ID;
    }

    
}