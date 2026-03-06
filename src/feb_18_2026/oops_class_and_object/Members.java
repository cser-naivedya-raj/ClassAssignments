package feb_18_2026.oops_class_and_object;

public class Members {

    public static int staticValue;
    public static String sv;

    // Static Method
    public static void showStaticMethod() {
        System.out.println("Static method executed");
    }

    // Static Block
    static {
        System.out.println("Static block initialized");
    }

    // Non-static variable
    public String instanceValue = "Instance Variable";
    public String nsv;

    // Non-static Method
    public void showInstanceMethod() {
        System.out.println("Instance method executed");
    }

    // Non-static block
    {
        System.out.println("Instance block executed");
    }

    // Constructor
    Members() {
        System.out.println("Members class constructor called");
    }

    public static void sm() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sm'");
    }
}