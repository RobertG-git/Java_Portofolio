package src.C4_ConcepteDeBazaOOP;

public class Vehicle {

    // ObjectState
    // 1. 2.

    private static final String producedBy = "Volkswagen";
    private final int productionYear;
    private final String vin;
    private String plateNumber;
    private int kilometers;
    private int lastSoldOnYear;
    private int positionX;
    private int positionY;

    // Object behaviour
    // 2.

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getKilometers() {
        return kilometers;
    }

    public Vehicle(int productionYear, String vin, String plateNumber, int lastSoldOnYear, int positionX, int positionY) {
        this.productionYear = productionYear;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Vehicle(int productionYear, String vin, String plateNumber) {
        this(productionYear, vin, plateNumber, -404, -404, -404);
    }

    public Vehicle(int productionYear, String vin) {
        this(productionYear, vin, "Unknown", -404, -404, -404);
    }

    //3. a,b,c,d,e

    public void sellVehicle(String plateNumber, int lastSoldOnYear) {
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
    }

    public void moveVehicle(int newPositionX, int newPositionY) {
        this.kilometers = (int) (this.kilometers + (Math.sqrt(Math.pow(newPositionX - this.positionX, 2) + Math.pow(newPositionY - this.positionY, 2))));
        this.positionX = newPositionX;
        this.positionY = newPositionY;
    }

    public boolean isVinValid(boolean isDrivingInNorthAmerica) {
        int[] vinValue = new int[17];
        int numberOfElements = 0;
        int[] products = new int[17];
        int sum = 0;
        if (!isDrivingInNorthAmerica) {
            System.out.print("Is not driving in North America! -> Result: ");
            return true;
        } else {
            for (int i = 0; i < vin.length(); i++) {
                if (Character.isDigit(Integer.valueOf(vin.charAt(i)))) {
                    vinValue[numberOfElements] = vin.charAt(i) - 48;
                    numberOfElements++;
                } else {
                    for (int j = 0; j < Constants.ROW_LETTERS_VIN.length; j++) {
                        if (vin.charAt(i) == Constants.ROW_LETTERS_VIN[j]) {
                            vinValue[numberOfElements] = Constants.NUMBER_VIN_ASSOCIATE[j];
                            numberOfElements++;
                        }
                    }
                }
            }
            for (int i = 0; i < products.length; i++) {
                products[i] = vinValue[i] * Constants.WEIGHT[i];
                sum += products[i];
            }

            System.out.print("Vin check performed - > is vin valid? R: ");
            return sum % 11 == 10;
        }

    }

    public void printVinDecomposed() {
        System.out.println("Identificatorul producatorului: " + this.vin.substring(0, 3));
        System.out.println("Atributele vehiculului: " + this.vin.substring(3, 8));
        System.out.println("Cifra de verificare: " + this.vin.charAt(8));
        System.out.println("Anul productiei modelului: " + this.vin.charAt(9));
        System.out.println("Seria fabricii: " + this.vin.charAt(10));
        System.out.println("Identificatorul numeric: " + this.vin.substring(11, 16));
    }

    public void display() {
        System.out.println("Car details are the following:"
                + "\n\t- producedBy: " + producedBy
                + "\n\t- productionYear: " + this.productionYear
                + "\n\t- vin: " + this.vin
                + "\n\t- plateNumber: " + this.plateNumber
                + "\n\t- kilometers: " + this.kilometers
                + "\n\t- lastSoldOnYear: " + this.lastSoldOnYear
                + "\n\t- positionX: " + this.positionX
                + "\n\t- positionY: " + this.positionY);
    }

}
