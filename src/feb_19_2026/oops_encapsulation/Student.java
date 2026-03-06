package feb_19_2026.oops_encapsulation;

public class Student {

    // Private instance variables
    private int studentId;
    private String studentName;
    private String emailId;
    private long phoneNumber;

    // Static variables
    private static String cityName;
    private static String stateName;
    private static String countryName;

    // Static block
    static {
        cityName = "Jaipur";
        stateName = "Rajasthan";
        countryName = "India";
    }

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int studentId, String studentName, String emailId, long phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    // ===== Getters & Setters =====

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Static Getters & Setters

    public static String getCityName() {
        return cityName;
    }

    public static void setCityName(String cityName) {
        Student.cityName = cityName;
    }

    public static String getStateName() {
        return stateName;
    }

    public static void setStateName(String stateName) {
        Student.stateName = stateName;
    }

    public static String getCountryName() {
        return countryName;
    }

    public static void setCountryName(String countryName) {
        Student.countryName = countryName;
    }

    // Display Method
    public void displayStudentDetails() {

        System.out.println("\n--- Student Information ---");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Email ID: " + getEmailId());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("City: " + cityName);
        System.out.println("State: " + stateName);
        System.out.println("Country: " + countryName);
    }
}