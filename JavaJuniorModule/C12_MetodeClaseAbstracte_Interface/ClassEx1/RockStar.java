package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public class RockStar extends Singer implements ICanDance {

    public RockStar(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
    }

    public void dance(String melody) {
        System.out.println("I'm a rockstar and I can dance on " + melody);
    }

}
