package src.C12_MetodeClaseAbstracte_Interface.Ex0;

public class Rhino extends Terrestrial {

    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating grass like a rhino, " + unitsOfFood + " tons.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Slowly moving forward like rhino, " + distance + " meters in " + distance / 2 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("Vveerrsseee... This rhino says something... ");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I have a strong horn!");
    }
}
