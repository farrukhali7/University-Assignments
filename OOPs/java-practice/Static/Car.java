public class Car{
    static int totalCars = 0; // it will be shared by all objects to avoid separate for all objects
    String name;

    public Car(String name){
        this.name = name;
        totalCars++;
    }

    public void display(){
        System.out.println(name + " car has been added");
    }

    public static void showTotalCars(){
        System.out.println("Total cars = " + totalCars);
    }

}