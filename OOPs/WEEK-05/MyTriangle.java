public class MyTriangle {
    private double edge1;
    private double edge2;
    private double edge3;
    private static int totalTriangles = 0;   //Count how many triangles are created

    // Default constructor
    public MyTriangle() {
        this(0, 0, 0);  //all edges set to 0
    }

    //Equilateral Triangle
    public MyTriangle(double edge) {
        this(edge, edge, edge);   //takes one value and then all edges are set to that value
    }

    // Constructor with 2 sides (isosceles)
    public MyTriangle(double edgeA, double edgeB) {
        this(edgeA, edgeB, edgeA);   //takes two values and then two edges are set to that value while third one is assumed to be equals to first value
    }

  // 'this(...)' is a shortcut to call another constructor in the same class. in upper two(isosceles and Equilateral) this is used to call out 3 side constructor.

    // Constructor with 3 sides
    public MyTriangle(double edgeA, double edgeB, double edgeC) {
        this.edge1 = edgeA;
        this.edge2 = edgeB;
        this.edge3 = edgeC;    //takes 3 values and all edges are set to these values
        totalTriangles++;   //+1 in total triangle
    }

    //Copy constructor
    public MyTriangle(MyTriangle other) {
        this(other.edge1, other.edge2, other.edge3);
    }

    //Setters = These methods let you change the values of each edge after the triangle is created.
    public void setEdge1(double value) {
        edge1 = value;
    }

    public void setEdge2(double value) {
        edge2 = value;
    }

    public void setEdge3(double value) {
        edge3 = value;
    }

    //Getters = give values of triangle edges
    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public static int getTotalTriangles() {
        return totalTriangles;
    }

    public double calculatePerimeter() {
        return edge1 + edge2 + edge3;
    }

  public boolean isRightTriangle() {
    double[] sides = {edge1, edge2, edge3};
    java.util.Arrays.sort(sides); // ascending order
    double a = sides[0];  //smallest value
    double b = sides[1];
    double c = sides[2];  //biggest value = hypotenuse

    if ((a * a + b * b) == (c * c)) {   //pythagorus theorem
        return true;
    } else {
        return false;
    }
}

    @Override
    public String toString() {
        return "Edges: " + edge1 + ", " + edge2 + ", " + edge3 +
               " | Perimeter: " + calculatePerimeter() +
               " | Right Triangle: " + isRightTriangle();
    }
}
