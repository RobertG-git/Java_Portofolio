package src.C12_MetodeClaseAbstracte_Interface.Ex0;

public class Main {

    public static void main(String[] args) {
        Terrestrial terrestrial = new Rhino();
        Rhino rhino = new Rhino();
        rhino.eat(5);
        rhino.move(20);
        rhino.saySomething();
        rhino.specialCharacteristic();
    }

}
