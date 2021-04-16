package src.C29_Lucrul_cu_exceptii.ClassEx2;

public class TooHighBloodPressureException extends BloodPressureException{
    public TooHighBloodPressureException() {
        super();
    }

    public TooHighBloodPressureException(String message) {
        super(message);
    }
}
