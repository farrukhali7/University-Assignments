public class Main{
  public static void main(String[] args){
    Turtle t = new Turtle();
    String commands = "FFRFFLFF";
    for(char c:commands.toCharArray()){
      switch(c){
        case 'F' : t.moveForward(); break;
        case 'R' : t.turnRight(); break;
        case 'L' : t.turnLeft(); break;
      }
    }
    System.out.println("Final Position: " + t.getX() + "," + t.getY());
  }
}
