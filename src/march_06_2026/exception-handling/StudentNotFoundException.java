package march_06_2026;

public class StudentNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Student Object Doesn't Exist!";
    }
}