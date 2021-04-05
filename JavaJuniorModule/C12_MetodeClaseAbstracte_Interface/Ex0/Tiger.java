package src.C12_MetodeClaseAbstracte_Interface.Ex0;

public class Tiger extends Terrestrial {

    @Override
    public void eat(int unitsOfFood) {
        System.out.println("Eating meat like a Tiger, " + unitsOfFood + " kilograms.");
    }

    @Override
    public void move(int distance) {
        System.out.println("Fast moving forward like tiger, " + distance + " meters in " + distance / 2 + " days.");
    }

    @Override
    public void saySomething() {
        System.out.println("Ggggrrrr... This tiger says something...");
    }

    @Override
    public void specialCharacteristic() {
        System.out.println("I am a perfect hunter - agile and precise!");
    }
}
