package src.C8_Mostenire.Ex1;

public class Vehicle {

    // Fields
    private final String serialNumber;
    private int noPersons;
    private String name;

    // Constructors
    public Vehicle(String serialNumber, int noPersons) {
        this(serialNumber, noPersons, "Unknown");
    }

    public Vehicle(String serialNumber, int noPersons, String name) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    // Methods
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public boolean goTo(double positionX, double positionY) {
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    public boolean addFuel(double amount) {
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }

    public void printInfo() {
        System.out.println("Vehicle properties:"
                + "\n\t - serial number: " + this.serialNumber
                + "\n\t - capacity: " + this.noPersons + " persons"
                + "\n\t - name: " + this.name);
    }
}
