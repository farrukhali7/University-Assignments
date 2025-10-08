public class Point {
    private double x;
    private double y;

    //Default constructor
    public Point() {
    x = 0;
    y = 0;
    }

    //Parameterized constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Copy Constructor
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    //Setters and Getters
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        return "x = " + x + " ," + " y = " + y;
    }
}
