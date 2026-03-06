package feb_23_2026.oops_inheritance;

/**
 * Machine class represents a generic machine.
 */
public class Machine {

    // Instance variables
    String machineName;
    String machineType;

    // Default constructor
    public Machine() {
        System.out.println("Machine object created.");
    }

    // Method to display machine information
    public void displayMachineInfo() {
        System.out.println("Machine Name: " + machineName);
        System.out.println("Machine Type: " + machineType);
    }
}