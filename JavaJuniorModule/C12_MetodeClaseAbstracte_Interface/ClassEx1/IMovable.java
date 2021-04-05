package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public interface IMovable {

    // static & final fields:
    public double metersToKilometers = .001;

    // abstract methods:
    public void moveForward();
    public void moveLeft();
    public void moveRight();

    public double getDistanceWalked();
}
