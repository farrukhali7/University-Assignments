
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Point p1 = new Point();
        p1.setX(20);
        p1.setY(30);
        System.out.println(p1);

        Pen p2 = new Pen();
        p2.setColor("red");
        p2.setCompany("fountain");
        System.out.println(p2);

        Pen p3 = new Pen("Blue","likho_bhai");
        p3.setX(33);
        System.out.println(p3);

        Pen p4 = new Pen(p3);  //for copy constructor
        p4.setX(67);
        System.out.println(p4);

    }
}