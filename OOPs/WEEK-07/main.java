public class main {
  public static void main(String[] args){
    Vector2D v1 = new Vector2D(3,4);   //constructor line of v1
    v1.setLabel("V1");

    Vector2D v2 = new Vector2D(1,2);   //constructor line of v2
    v2.setLabel("V2");

    Vector2D added = v1.add(v2);
    Vector2D subtracted = v1.subtract(v2);
    double dotProduct = v1.dot(v2);
    double magnitude = v1.magnitude();

    System.out.println("Vector 1: " + v1);
    System.out.println("Vector 2: " + v2);
    System.out.println("Added Vector: " + added);
    System.out.println("Subtracted Vector: " + subtracted);
    System.out.println("Dot Product: " + dotProduct);
    System.out.println("Magnitude of V1 " + magnitude);
  }
}
