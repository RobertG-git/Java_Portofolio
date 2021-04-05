package src.C9_UpcastingDowncasting;

public class Tiger extends Terrestrial {

    public Tiger(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species, legs, eyes);
    }

    @Override
    public void saySomething() {
        System.out.println("Ggggrrrr... This tiger says something...");
    }

    public void camouflage() {
        System.out.println("I'm a fearless beast! I don't hide!");
    }

    public void agility() {
        System.out.println("I am a perfect hunter - agile and precise!");
    }

    public static void subspeciesDescription() {
        System.out.println("[static method] Tiger subspecies");
    }

    @Override
    public void specialCaracteristic() {
        System.out.println("I am a perfect hunter - agile and precise!");
    }

    @Override
    public String toString() {
        return "This is a Tiger! " + super.toString();
    }
}
