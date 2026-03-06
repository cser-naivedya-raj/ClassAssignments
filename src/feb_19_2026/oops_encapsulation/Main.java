package feb_19_2026.oops_encapsulation;

public class Main {

    public static void main(String[] args) throws Exception {

        // Static values using setters
        Student.setCity("Mumbai");
        Student.setState("Maharashtra");
        Student.setCountry("India");

        // Object 1
        Student s1 = new Student(
                1,
                "Rohit Sharma",
                "rohit@gmail.com",
                9876548210L
        );

        // Object 2 using setters
        Student s2 = new Student();

        s2.setId(2);
        s2.setName("Prachi Sharma");
        s2.setMailId("prachi@gmail.com");
        s2.setContactNumber(9876548211L);

        // Display details
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.out.println();

        // JavaApp execution
        JavaApp.execution();

        System.out.println();

        // Members class execution
        System.out.println("Static Variable: " + Members.sv);
        Members.sm();

        Members members = new Members();
        System.out.println("Non Static Variable: " + members.nsv);
        members.nsm();
    }
}