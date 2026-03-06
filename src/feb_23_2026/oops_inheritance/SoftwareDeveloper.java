package feb_23_2026.oops_inheritance;

public final class SoftwareDeveloper extends Employee {

    String jobTitle;
    double baseSalary;
    String responsibility;
    double bonusAmount;

    static String departmentName;
    static String officeBranch;
    static String companyName;

    // Static method to initialize company information
    public static void setCompanyInfo(String comp, String dept, String br) {
        companyName = comp;
        departmentName = dept;
        officeBranch = br;
    }

    // Constructor
    public SoftwareDeveloper(String jobTitle, String responsibility,
                             double baseSalary, double bonusAmount) {

        this.jobTitle = jobTitle;
        this.responsibility = responsibility;
        this.baseSalary = baseSalary;
        this.bonusAmount = bonusAmount;
    }

    public void performTask() {
        System.out.println("Working on software development activities");
    }

    public void conductKTSession() {
        System.out.println("Providing KT session on modern development technologies");
    }

    public void showDeveloperDetails() {

        System.out.println("----- Developer Information -----");
        System.out.println("Company        : " + companyName);
        System.out.println("Department     : " + departmentName);
        System.out.println("Branch         : " + officeBranch);
        System.out.println("Job Title      : " + jobTitle);
        System.out.println("Responsibility : " + responsibility);
        System.out.println("Base Salary    : " + baseSalary);
        System.out.println("Bonus Amount   : " + bonusAmount);
        System.out.println("City           : " + city);
        System.out.println("State          : " + state);
        System.out.println("Country        : " + country);
        System.out.println("---------------------------------");
    }
}