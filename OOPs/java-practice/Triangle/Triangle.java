public class Triangle {
    private double x;
    private double y;
    private double z;
    
    //Default constructor
    public Triangle() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    //Copy Constructor
    public Triangle(Triangle other){
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    // For Triangle with no equal sides(Scalene):
    // parameterized constructor
    public Triangle(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // For Isosceles triangle(Two equal sides)
    //parameterized constructor
    public Triangle(double x, double y){
        this.x = x;
        this.y = y;
        this.z = y;
    }

    //for equilateral triangle(All equal sides)
    //parameterized constructor 
    public Triangle(double x){
        this.x = x;
        this.y = x;
        this.z = x;
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

    public void setZ(double z){
        this.z = z;
    }
    public double getZ(){
        return z;
    }

    //Right angle triangle check
    public String typeOfTriangle(){
        if (x*x == y*y +z*z || z*z == y*y + x*x || y*y == z*z + x*x) {
            return "This is a Right angle Triangle";
        }else if(x == y && y != z|| y == z && z != x || z == x && x != y){ 
            return "This is a Isosceles Triangle";
        }else if(x == y && y == z && z == x){
            return "This is a Equilateral Triangle with each angle of 60 degrees";
        }else{
            return "This Triangle is a Scalene Triangle";
        }
    }

    //calculating parameter 
    public double parameter(){
        return x + y + z;
    }

    @Override
    public String toString(){
        return "Triangle sides: x = " + x + " , " + y + " , " + z + ". It's parameter is = " + parameter() + " and " + typeOfTriangle();
    }
}
