package src.C7_EnhancedFor_Enum.ClassEx2;

public enum ApplicationStatus {
    IN_PROGRES ("Student application in progres"),
    ACCEPTED ("Student is accepted"),
    REFUSED ("Student was rejected");

    String message;
    ApplicationStatus(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }
}
