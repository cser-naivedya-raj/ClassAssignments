package feb_18_2026.oops_class_and_object;

public class Main {

    public static void main(String[] args) throws Exception {

        // Setting static location details
        Student.setCity("Mumbai");
        Student.setState("Maharashtra");
        Student.setCountry("India");

        // Creating first student using constructor
        Student studentOne = new Student(
                1,
                "Rohit Sharma",
                "rohit@gmail.com",
                9876543210L
        );

        // Creating second student using setters
        Student studentTwo = new Student();

        studentTwo.setId(2);
        studentTwo.setName("Prachi Sharma");
        studentTwo.setEmailId("prachi@gmail.com");
        studentTwo.setContactNumber(9876548596L);

        // Display student information
        studentOne.displayStudentDetails();
        studentTwo.displayStudentDetails();

        System.out.println();

        // Running JavaApp execution method
        JavaApp.execution();

        System.out.println();

        // Accessing Members class
        System.out.println("Static Variable Value: " + Members.sv);
        Members.sm();

        Members memberObj = new Members();
        System.out.println("Instance Variable Value: " + memberObj.nsv);
        memberObj.nsm();   // correct non-static method
    }
}