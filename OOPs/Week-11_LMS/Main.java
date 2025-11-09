public class Main {
    public static void main(String[] args) {
        CourseList c1 = new CourseList();
        c1.addCourse("Java OOPs");
        c1.addCourse("Linear Algebra");
        c1.removeCourse("Java OOPs");
        c1.removeCourse("PST");
        c1.addCourse("Discrete");
        c1.addCourse("Physics");
        c1.addCourse("Communication");
        c1.SortingCourseList();
        System.out.println(c1.toString());

        StudentList s1 = new StudentList();
        s1.addStudent("Ayaz");
        s1.addStudent("Ahmed");
        s1.addStudent("qasim");
        s1.addStudent("rayyan");
        s1.removeStudent("Ahmed");
        s1.addStudent("john");
        s1.findStudent("qasim");
        System.out.println(s1.toString());
    }
}