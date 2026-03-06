package feb_19_2026.oops_encapsulation;

public class Members {

    public static int staticVar;

    // Static Method
    public static void displayStaticMethod() {
        System.out.println("Static method executed");
    }

    // Static Block
    static {
        System.out.println("Static block initialized");
    }

    // Instance variable
    public String instanceVar = "Instance Variable";

    // Instance Method
    public void displayInstanceMethod() {
        System.out.println("Instance method executed");
    }

    // Instance block
    {
        System.out.println("Instance block initialized");
    }

    // Constructor
    Members() {
        System.out.println("Members class constructor called");
    }
}