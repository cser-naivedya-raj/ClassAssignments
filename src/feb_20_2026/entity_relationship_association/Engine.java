package feb_20_2026.entity_relationship_association;

public class Engine {

    private double engineCapacity;
    private String coolingType;
    private int cylinderCount;

    public Engine(double engineCapacity, String coolingType, int cylinderCount) {
        this.engineCapacity = engineCapacity;
        this.coolingType = coolingType;
        this.cylinderCount = cylinderCount;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void showEngineInfo() {
        System.out.println("Engine Information:");
        System.out.println("---------------------");
        System.out.println("Engine Capacity (CC): " + engineCapacity);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Number of Cylinders: " + cylinderCount);
        System.out.println();
    }

    public void displayEngineDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayEngineDetails'");
    }
}