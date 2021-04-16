package src.C29_Lucrul_cu_exceptii.ClassEx2;

public class TooLowBloodPressureException extends BloodPressureException {
    public TooLowBloodPressureException() {
        super();
    }

    public TooLowBloodPressureException(String message) {
        super(message);
    }
}
