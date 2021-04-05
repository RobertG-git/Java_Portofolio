package src.C9_UpcastingDowncasting;

public class Rhino extends Terrestrial {

    public Rhino(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void saySomething() {
        System.out.println("Vveerrsseee... This rhino says something... \"");
    }

    public void camouflage() {
        System.out.println("I'm using my thick skin, strong horn and impressive large size to defend.");
    }

    public void horn() {
        System.out.println("I have a strong horn!");
    }

    public static void subspeciesDescription() {
        System.out.println("[static method] Rhino subspecies");
    }

    @Override
    public void specialCaracteristic() {
        System.out.println("I have a strong horn!");
    }

    @Override
    public String toString() {
        return "This is a Rhino! " + super.toString();
    }
}
