public class Vector2D {
  private double x;
  private double y;
  private String label;

  public Vector2D(double x,double y){
    this.x = x;
    this.y = y;
    this.label = "default";
  }
  
  public double magnitude(){   //pythagorous theorem
    return Math.sqrt(x * x + y * y);   //sqrt = square root
  }
  
  public Vector2D add(Vector2D v){   //v = another vector 
    return new Vector2D(this.x + v.x, this.y + v.y);   //new vector created
  }
  
  public Vector2D subtract(Vector2D v){
    return new Vector2D(this.x - v.x, this.y - v.y);
  }
  
  public double dot(Vector2D v){
    return this.x * v.x + this.y * v.y;
  }

  //Getters and Setters
  public double getX(){return x;}
  public void setX(double x){this.x = x;}

  public double getY(){return y;}
  public void setY(double y){this.y = y;}

  public String getLabel(){return label;}
  public void setLabel(String label){this.label = label;}

  @Override
  public String toString(){
    return label + ": (" + x + "," + y + ")";
  }
}
