package src.C4_ConcepteDeBazaOOP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started! " + "\n");

        // Object creation
        Vehicle vehicleRg = new Vehicle(2008, "1M8GDM9AXKP042788", "PH01CAR", 2012, 40, 40);
        Vehicle vehicleAn = new Vehicle(2010, "2M8GDM9AXKP042788", "PH02CAR");
        Vehicle vehicleDa = new Vehicle(2012, "3M8GDM9AXKP042788");

        // Getter check
        vehicleRg.setPlateNumber("PH55WEN");
        System.out.println("Kilometers vehicleRG :" + vehicleRg.getKilometers());
        System.out.println("Plate number vehicleRg is: " + vehicleRg.getPlateNumber());
        System.out.println();

        // Sell car
        vehicleRg.sellVehicle("PH01NEW", 2018);

        // Move vehicle
        vehicleRg.moveVehicle(20,20);

        // Vin decomposition
        vehicleRg.printVinDecomposed();

        // Vin checking
        System.out.println();
        System.out.println(vehicleRg.isVinValid(true));
        System.out.println(vehicleAn.isVinValid(true));
        System.out.println(vehicleDa.isVinValid(false));

        // Car details
        System.out.println();
        vehicleRg.display();
    }
}