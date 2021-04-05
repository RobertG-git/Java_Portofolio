package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public class Singer extends Person implements IHasName,ICanSing {

    public Singer(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
    }

    @Override
    public void sing(String song) {
        System.out.println("I'm singing: " + song);
    }
}
