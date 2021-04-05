package src.C9_UpcastingDowncasting;

public class Terrestrial extends Animal {
    //Fields
    private int legs;
    private int eyes;

    //Constructors
    public Terrestrial(boolean carnivore, int weight, int size, String species) {
        super(carnivore, weight, size, species);
    }

    public Terrestrial(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species);
        this.legs = legs;
        this.eyes = eyes;
    }

    //Methods
    public void fight() {
        System.out.println("The terrestrial animal is now fighting!!");
    }

    public void saySomething() {
        System.out.println("Unknown sound for non-specific terrestrial animal...");
    }

    public void specialCaracteristic() {
        System.out.println("No particular characteristic for generic terrestrial animal.");
    }

    public static void subspeciesDescription() {
        System.out.println("[static method] Unknown subspecies - Class 'Terrestrial'");
    }

    @Override
    public void move(int distance) {
        System.out.println("This is a terrestrial species.");
        super.move(distance);
    }

    @Override
    public String toString() {
        return  "The terrestrial animal has: " + this.legs + " legs and " + this.eyes + " eyes.\n" + super.toString();
    }

}
