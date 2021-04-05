package src.C8_Mostenire.Ex1;

public class Main {

    public static void main(String[] args) {

        // Vechile test
        Vehicle rgVehicle = new Vehicle("3FDS9DFF8FSD7", 4, "Moby");
        System.out.println("Serial number is: " + rgVehicle.getSerialNumber()  + "\n");
        System.out.println("Goto: " + rgVehicle.goTo(2.0,3.1) + "\n");
        System.out.println("Add fuel: " + rgVehicle.addFuel(20) + "\n");
        rgVehicle.printInfo();
        System.out.println();

        // VehicleOnRoad test
        OnRoad rgVehicleOnRod = new OnRoad("3FDS9DFF8FSD7", 4, "MobyRoad", 4, 5);
        System.out.println(rgVehicleOnRod.goTo(10, 15) + "\n");
        System.out.println(rgVehicleOnRod.addFuel(10) + "\n");
        rgVehicleOnRod.printInfo();
        System.out.println();

        // VehicleOnWater test
        OnWater rgVehicleOnWatter = new OnWater("F8GFDG86D87GGD", 10, "Vessel", 2, 500);
        System.out.println(rgVehicleOnWatter.goTo(10, 15) + "\n");
        System.out.println(rgVehicleOnWatter.addFuel(10) + "\n");
        rgVehicleOnWatter.printInfo();
        System.out.println();

        // VehicleOnAir test
        OnAir rgVehicleOnAir = new OnAir("BC325987DFKJS34", 120, "Bluesky", 4, "has first class");
        System.out.println(rgVehicleOnAir.goTo(10, 15) + "\n");
        System.out.println(rgVehicleOnAir.addFuel(100) + "\n");
        rgVehicleOnAir.printInfo();
        System.out.println();
    }
}
