public class Main {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle();              // Default triangle
        MyTriangle triangle2 = new MyTriangle(6);             // Equilateral triangle
        MyTriangle triangle3 = new MyTriangle(6, 10);         // Isosceles triangle
        MyTriangle triangle4 = new MyTriangle(3, 4, 5);       // Right angle triangle
        MyTriangle triangle5 = new MyTriangle(triangle4);     // Cloned triangle

        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);
        System.out.println(triangle5);

        System.out.println("Triangles created: " + MyTriangle.getTotalTriangles());
    }
}
