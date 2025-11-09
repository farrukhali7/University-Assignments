public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla");
        Car c2 = new Car("BMW");
        Car c3 = new Car("Toyota");

        c1.display();
        c2.display();
        c3.display();

        Car.showTotalCars(); //as we are calling showTotalCars() from car class so we have to write static in that method.
        c1.showTotalCars(); //for this you won't need the showTotalCars method to be static 
    }
}
