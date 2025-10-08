public class Main{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setX(3);
        t1.setY(5);
        t1.setZ(7);
        System.out.println(t1);     

        Triangle t2 = new Triangle();
        t2.setX(4);
        t2.setY(4);
        t2.setZ(6);
        System.out.println(t2);

        Triangle t3 = new Triangle();
        t3.setX(4);
        t3.setY(4);
        t3.setZ(4);
        System.out.println(t3);

        Triangle t4 = new Triangle(t2);
        System.out.println(t4);

        Triangle t5 = new Triangle(10, 12 , 13);
        System.out.println(t5);

        Triangle t6 = new Triangle(11  , 13);
        System.out.println(t6);

        Triangle t7 = new Triangle(15);
        System.out.println(t7);
    }
}