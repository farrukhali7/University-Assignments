public class PetrolEngine implements Engine {
    private int petrolConsumptionPerKM;

    @Override
    public void start(){
        System.out.println("petrol Engine is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Petrol Engine is stopping...");
    }

    public PetrolEngine(){
        petrolConsumptionPerKM = 20;
    }

    public PetrolEngine(int petrolConsumptionPerKM){
        this.petrolConsumptionPerKM = petrolConsumptionPerKM;
    }

    public PetrolEngine(PetrolEngine other){
        this.petrolConsumptionPerKM = other.petrolConsumptionPerKM;
    }

    public void setPetrolConsumptionPerKM(int petrolConsumptionPerKM){
        this.petrolConsumptionPerKM = petrolConsumptionPerKM;
    }
    public int getPetrolConsumptionPerKM(){
        return petrolConsumptionPerKM;
    }

    @Override
    public String toString(){
        return "Petrol Engine Consumption = " + petrolConsumptionPerKM;
    }
}
