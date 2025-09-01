public class Turtle {
  private int x;
  private int y;
  private int angle;
  private boolean penDown;
  private String penColor;

  public Turtle(){
    x = 0;
    y = 0;
    angle = 0;
    penDown = true;
    penColor = "black";
  }

  public void moveForward(){
    if(angle == 0){
      y++;
      }elseif(angle == 90){
      x++;
      }elseif(angle == 180){
      y--;
      }elseif(angle == 270){
      x--;
      }

    public void turnLeft(){
      angle = angle - 90;   //to avoid getting angle in negative
      if(angle < 0){
        angle = angle +360
      };
    }
    public void turnRight(){
      angle = angle + 90   //to avoid getting angle more than 360
        if(angle >= 360){
        angle = angle - 360
        };
    }

    //Getters and Setters
    public int getX(){return x;}
    public void setX(int x){this.x = x;}

    public int getY(){return y;}
    public void setY(int y){this.y = y;}
  
    public int getAngle(){return angle;}
    public void setAngle(int angle){this.angle = angle;}
  
    public int isPenDown(){return penDown;}
    public void setPenDown(int penDown){this.penDown = penDown;}
  
    public int getPenColor(){return penColor;}
    public void setPenColor(int penColor){this.penColor = penColor;}
  }
}
