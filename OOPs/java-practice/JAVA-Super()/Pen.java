public class Pen extends Point {
    protected String color;
    protected String company;

    //Default constructor
    public Pen(){
        super();
        color = "Black";
        company = "Dollar";
    }

    //parameterized constructor
    public Pen(String color , String company){
        super();
        this.color = color;
        this.company = company;
    }

    //Copy Constructor
    public Pen(Pen other){
        super();
        this.color = other.color;
        this.company = other.company;
    }

    //Setters and Getters
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setCompany(String company){
        this.company = company;
    }
    public String getcompany(){
        return company;
    }

    @Override
    public String toString(){
        return "Pen's color = " + color + " , and it's company is = " + company + " , and x value is = " +getX();
    }
}
