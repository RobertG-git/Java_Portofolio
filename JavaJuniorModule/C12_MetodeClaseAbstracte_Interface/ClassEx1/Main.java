package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public class Main {

    public static void main(String[] args) {

//        Person person = new Person("robert","girbea", 28);
//        person.moveForward();
//        person.moveLeft();
//        person.moveRight();
//        System.out.println(person.getDistanceWalked() + "\n");
//
        RockStar rockStar = new RockStar("r", "g",30);
//        rockStar.sing("Dance with me!");
//        rockStar.dance("Dance with me!");
//        System.out.println(rockStar.getName());
//
//        RockStar rStar = new RockStar("Barrett","Syd",32);
//        IHasName iHasNameRef = rStar;
//        System.out.println("The rockstar name is: " + iHasNameRef.getName());
//
//        // ICanSing iCanSingRef = IHasNameRef;  -> does not work because cannot be referred a interface reference to
//        // other interface type.
//
//        ICanSing iCanSingRef = rStar;
//        iCanSingRef.sing("The best!");
//
//        ICanSing singer1 = new Singer("Jackson", "Michael",49);
//        singer1.sing("Thriller");

        //Metode generice
//        recordSong(new Singer("r","g",30));
//        recordSong(new RockStar("r","g",30));

        recordSong(new Singer("r","g",30));
        recordDance(new RockStar("r","g",30));
        rockStar.stopDance();
        System.out.println(ICanDance.getHorsePower(2500,20));

    }

    public static void recordSong(ICanSing singer) {
        System.out.println("Start song recording...");
        singer.sing("The greatest");
        System.out.println("Stop recording...");
    }
    public static void recordDance(ICanDance dancer) {
        System.out.println("Start dance recording...");
        dancer.dance("The greatest");
        System.out.println("Stop recording...");
    }

}
