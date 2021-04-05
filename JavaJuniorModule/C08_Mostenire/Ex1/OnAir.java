package src.C8_Mostenire.Ex1;

public class OnAir extends Vehicle{

    // Fields
    private int noTurbines;
    private String hasFirstClass;

    // Constructors
    public OnAir(String serialNumber, int noPersons) {
        super(serialNumber,noPersons);
    }

    public OnAir(String serialNumber, int noPersons, String name) {
        super(serialNumber,noPersons,name);
    }

    public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        super(serialNumber,noPersons,name);
        this.noTurbines = noTurbines;
    }

    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, String hasFirstClass) {
        this(serialNumber, noPersons, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }

    // Methods
    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "].");
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.println("Adding " + amount + "l of fuel to the airplane.");
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Airplane  properties:"
                + "\n\t - number of turbines: " + this.noTurbines
                + "\n\t - " + this.hasFirstClass);
    }
}
