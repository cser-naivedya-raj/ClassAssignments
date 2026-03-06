package feb_20_2026.entity_relationship_association_crud;

/**
 * Project entity class.
 * Stores information related to a project such as id, title and details.
 */
public class Project {

    // Instance variables
    private int projectId;
    private String projectTitle;
    private String projectInfo;

    // Default constructor
    public Project() {
    }

    // Parameterized constructor
    public Project(int projectId, String projectTitle, String projectInfo) {
        this.projectId = projectId;
        this.projectTitle = projectTitle;
        this.projectInfo = projectInfo;
    }

    // Getter and Setter methods

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    /**
     * Method to print project information
     */
    public void showProjectDetails() {
        System.out.println("Project Information:");
        System.out.println("---------------------------");
        System.out.println("Project ID: " + projectId);
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Details: " + projectInfo);
        System.out.println();
    }
}