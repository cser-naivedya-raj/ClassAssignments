package march_05_2026.task1;

public class Student {

    private int id;
    private String name;
    private String mailId;
    private String contactNumber;

    // Default constructor
    public Student() {
    }

    // Constructor to initialize student information
    public Student(int id, String name, String mailId, String contactNumber) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    // Getter for student ID
    public int getId() {
        return id;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Getter for email ID
    public String getMailId() {
        return mailId;
    }

    // Setter for email ID
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    // Getter for contact number
    public String getContactNumber() {
        return contactNumber;
    }

    // Setter for contact number
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Added toString method (extra improvement)
    @Override
    public String toString() {
        return "Student [ID=" + id +
                ", Name=" + name +
                ", Mail=" + mailId +
                ", Contact=" + contactNumber + "]";
    }
}