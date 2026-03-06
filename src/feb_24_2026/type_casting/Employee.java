package feb_24_2026.type_casting;

public sealed class Employee permits SoftwareDeveloper, SoftwareTester {

    public void entry() {
        System.out.println("Employee entered into the Campus");
    }

    public void meeting() {
        System.out.println("Employee is attending the meeting");
    }

    public void exit() {
        System.out.println("Employee exited from the Campus");
    }
}