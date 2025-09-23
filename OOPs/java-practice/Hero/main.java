public class Main{
  public static void main(String[] args){
    
    // Creating hero using Default constructor 
    Hero hero1 = new Hero();
    hero1.setName("hypo");
    hero1.setAge(21);
    hero1.setPower("immortal");
    hero1.setDressColor("red");
    System.out.println(hero1.display());

    // Creating hero using parameterized constructor
    Hero hero2 = new Hero("baka", 33 , "gigantic" , "green" );
    System.out.println(hero2.display());

    Hero hero3 = new Hero(Hero2);
    System.out.println(hero3.display());
}
}
