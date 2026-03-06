package feb_20_2026.entity_relationship_association_crud;

/**
 * Application class responsible for executing business operations.
 */
public class JavaApp {

    public static void startExecution() {

        // Create learner object
        Student learner = new Student(1, "Raj", "raj@gmail.com", 9876893210L);

        // Display learner information
        learner.displayStudentDetails();

        // Create assignment object
        Project assignment = new Project(1, "Flight Registration System", "AI Based Java Application");

        // Perform CRUD operations
        learner.createProject(assignment);   // CREATE
        learner.readProject();               // READ
        learner.updateProject(1, "Train Reservation System", "Spring AI Based Java Web App"); // UPDATE
        learner.deleteProject(1);            // DELETE
        learner.readProject();
    }
}