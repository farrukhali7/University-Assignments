public class ElectricEngine implements Engine {
    private int electricConsumption;

    @Override
    public void start(){
        System.out.println("Electric Engine is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Electric Engine is stopping...");
    }

    public ElectricEngine(){
        this.electricConsumption = 10;
    }
    public ElectricEngine(int electricConsumption){
        this.electricConsumption = electricConsumption;
    }
        public ElectricEngine(ElectricEngine other){
        this.electricConsumption = other.electricConsumption;
    }

    public void setElectricConsumption(int electricConsumption){
        this.electricConsumption = electricConsumption;
    }
    public int getElectricConsumption(){
        return electricConsumption;
    }

    @Override
    public String toString() {
        return "Electric Engine Consumption = " + electricConsumption;
    }
}
