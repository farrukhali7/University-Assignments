public class Main{
public static void main(String[] args){
	// For default constructor
	Pen pen1 = new Pen();     //oject created
    pen1.setColor("Red");
    pen1.setThickness(2);
    pen1.setCompanyName("Fountain");
    pen1.setPrice(25);
    System.out.println(pen1.messageDisplay());
    
    // For parameterized constructor
    Pen pen2 = new Pen( "blue" , 2 , "ColoRun" , 35 );
    System.out.println(pen2.messageDisplay());
 	
    // For Copy Constructor
    Pen pen3 = new Pen(pen2);
    System.out.println(pen3.messageDisplay());
    
}
}
