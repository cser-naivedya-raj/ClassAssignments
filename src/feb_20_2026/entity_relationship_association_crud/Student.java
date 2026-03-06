package feb_20_2026.entity_relationship_association_crud;

/**
 * Learner class represents a learner entity.
 * Demonstrates association where Learner HAS-A Project.
 */
public class Student {

    // Learner attributes
    private int studentId;
    private String studentName;
    private String email;
    private long phoneNumber;

    // Association: Learner has a Project
    private Project assignedProject;

    // Parameterized constructor
    public Student(int studentId, String studentName, String email, long phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Default constructor
    public Student() {
    }

    // Getter and Setter methods

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Project getAssignedProject() {
        return assignedProject;
    }

    public void setAssignedProject(Project assignedProject) {
        this.assignedProject = assignedProject;
    }

    /**
     * Display learner information
     */
    public void displayStudentDetails() {
        System.out.println("Student Information:");
        System.out.println("---------------------------");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();

        if (assignedProject != null) {
            assignedProject.displayProjectDetails();
        } else {
            System.out.println("No Project Assigned.");
        }

        System.out.println("---------------------------");
    }

    /**
     * CREATE operation
     */
    public void createProject(Project projectObj) {

        if (this.assignedProject == null) {

            if (projectObj != null
                    && projectObj.getId() != 0
                    && projectObj.getName() != null
                    && !projectObj.getName().isEmpty()
                    && projectObj.getDescription() != null
                    && !projectObj.getDescription().isEmpty()) {

                this.assignedProject = projectObj;
                System.out.println("Project created successfully!");

            } else {
                System.out.println("Invalid project information.");
            }

        } else {
            System.out.println("A project already exists.");
        }
    }

    /**
     * READ operation
     */
    public void readProject() {
        if (assignedProject != null) {
            assignedProject.displayProjectDetails();
        } else {
            System.out.println("No Project Assigned.");
        }
    }

    /**
     * UPDATE operation
     */
    public void updateProject(int projectId, String projectName, String projectDescription) {

        if (assignedProject != null) {

            if (assignedProject.getId() == projectId) {
                assignedProject.setName(projectName);
                assignedProject.setDescription(projectDescription);
                System.out.println("Project updated successfully!");
            } else {
                System.out.println("Project ID mismatch.");
            }

        } else {
            System.out.println("No project available to update.");
        }
    }

    /**
     * DELETE operation
     */
    public void deleteProject(int projectId) {

        if (assignedProject != null) {

            if (assignedProject.getId() == projectId) {
                assignedProject = null;
                System.out.println("Project removed successfully!");
            } else {
                System.out.println("Project ID not found.");
            }

        } else {
            System.out.println("No project available to delete.");
        }
    }
}