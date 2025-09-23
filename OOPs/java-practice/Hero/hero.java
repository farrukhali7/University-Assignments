public class Hero {	
	private String name;
    private int age;
    private String power;
    private String dressColor;
    
    //Default constructor
    public Hero(){
    	name = "uralon";
        age = 22;
        power = "invisibility";
        dressColor = "red";
    }
    
    //parameterized constructor
    public Hero(String name, int age, String power, String dressColor)		{
    	this.name = name;
        if(age <= 0){
        	System.out.println("Age can't be in negative");
            this.age = 1;
        }else{
        	this.age = age;
        }
        this.power = power;
        this.dressColor = dressColor;
    	}

	//Setters and Getters
    public String setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setAge(int age){
    	if(age <=0){
        System.out.println("Age can't be negative");
        this.age = 1;
        }else{
        this.age = age;
        }
    }
    
    public String getAge(){
    	return age;
    }
    
    public void setPower(String power){
    	this.power = power;
    }
    
    public String getPower(){
    	return power;
    }
    
    public void setDressColor(String dressColor){
    	this.dressColor = dressColor;
    }
    
    public String getDressColor(){
    	return dressColor;
    }
    
    public String display(){
    	return "your Hero name is: " + name + " and he/she is " + age+ " years old, having power of " + power + " and has dress in " +dressColor+ " color."
    }


}
