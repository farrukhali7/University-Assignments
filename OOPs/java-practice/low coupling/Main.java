public class Main {
    public static void main(String[] args) {
        // Engine e = new Engine();  //error as interfaces can't be instantiated
        Engine e = new PetrolEngine();
        e.start();
        e.stop();
        
        Engine e1 = new ElectricEngine();
        e1.start();
        e1.stop();
        // e1.getelectricConsumption;  // cannot get as this is not declared in the interface

        ElectricEngine e3 = new ElectricEngine();  //it can't be ElectricEngine e2 = new ElectricEngine(e1);  it is giving error     
        e3.start();
        e3.stop();
        ElectricEngine e4 = new ElectricEngine(e3);
        System.out.println(e4);
        

    }
}
