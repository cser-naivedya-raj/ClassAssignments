package feb_23_2026.oops_inheritance;

public class JavaApp {

    public static void startExecution() {

        // Parent and Child demonstration
        System.out.println("Static Value: " + Child.sv);
        Child.sm();

        Child childObj = new Child();
        System.out.println("Instance Value: " + childObj.nsv);
        childObj.nsm();

        // Setting static location details
        Employee.setLocation("Jaipur", "Rajasthan", "India");
        SoftwareDeveloper.setCompanyDetails(
                "Capgemini",
                "Software Development",
                "Jaipur"
        );

        // Creating SoftwareDeveloper object
        SoftwareDeveloper developer = new SoftwareDeveloper(
                "Senior Software Developer",
                "Backend Developer",
                850000,
                50000
        );

        developer.displaySoftwareDeveloperDetails();
    }
}