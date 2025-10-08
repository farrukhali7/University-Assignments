public class Pen{
	private String color;    //encapsulation
    private int thickness;
    private String companyName;
    private int price;
    
    // default/null constructor
    public Pen(){
    	color = "black";
        thickness = 1;
        companyName = "dollar";
        price = 30;
    }
    
    // parameterized constructor
    public Pen(String color, int thickness, String companyName, int price){
    	this.color = color;
        this.thickness = thickness;
        this.companyName = companyName;
        this.price = price;
	}
    
    // copy constructor
    public Pen(Pen other){
    	this.color = other.color;
        this.thickness = other.thickness;
        this.companyName = other.companyName;
        this.price = other.price;   
    }
    
    // Getters and Setters
    public void setColor(String color){
    	this.color = color;
    }
    public String getColor(){
    	return color;
    }
    
    public void setThickness(int thickness){
    	this.thickness = thickness;
    }
    public int getThickness(){
    	return thickness;
    }
    
    public void setCompanyName(String companyName){
    	this.companyName = companyName;
    }
    public String getCompanyName(){
    	return companyName;
    }
    
    public void setPrice(int price){
    	this.price = price;
    }
    public int getPrice(){
    	return price;
    }
    
    //method
    public String messageDisplay(){
    	return "Pen company = " + color + " ,thickness = " + thickness + " , companyName = " + companyName + " ,price = " + price;
    }
}
