package src.C12_MetodeClaseAbstracte_Interface.Ex0;

public class Zebra extends Terrestrial {

    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating grass like a Zebra, " + unitsOfFood + " kilograms.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Fast moving forward like Zebra, " + distance + " meters in " + distance / 2 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("Wzzeeaaaa... This zebra says something...");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I have particular stripes!");
    }
}
