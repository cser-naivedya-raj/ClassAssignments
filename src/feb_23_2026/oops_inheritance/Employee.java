package feb_23_2026.oops_inheritance;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester {

    int employeeId;
    String employeeName;
    String email;
    long phoneNumber;

    static String cityName;
    static String stateName;
    static String countryName;

    // Static method to set location details
    public static void setLocation(String city, String state, String country) {
        cityName = city;
        stateName = state;
        countryName = country;
    }

    public void enterSystem() {
        System.out.println("Employee entered the system.");
    }

    public void loginAccount() {
        System.out.println("Employee logged in successfully.");
    }

    public void attendMeeting() {
        System.out.println("Employee joined the meeting.");
    }

    public void logoutAccount() {
        System.out.println("Employee logged out successfully.");
    }

    public void leaveSystem() {
        System.out.println("Employee exited the system.");
    }
}