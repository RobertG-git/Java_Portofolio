package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public class Person implements IMovable {

    private String lastName;
    private String firstName;
    private int age;
    private double distance;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setLasName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName +" are " + this.age + " ani.";
    }

    @Override
    public void moveForward() {
        this.distance += 0.9;
        System.out.println("Person took a step forward");
    }

    @Override
    public void moveLeft() {
        this.distance += 0.5;
        System.out.println("Person took a step to the left");
    }

    @Override
    public void moveRight() {
        this.distance += 0.5;
        System.out.println("Person took a step to the right");
    }

    @Override
    public double getDistanceWalked() {
        return this.distance * metersToKilometers;
    }
}
