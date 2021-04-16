package src.C29_Lucrul_cu_exceptii.ClassEx2;

public class BloodPressureException extends RuntimeException{
    public BloodPressureException() {
        super();
    }

    public BloodPressureException(String message) {
        super(message);
    }
}
