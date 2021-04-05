package src.C12_MetodeClaseAbstracte_Interface.ClassEx1;

public interface ICanDance {

    void dance(String melody);

    default void stopDance() {
        System.out.println("Stop the dance!");
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }


}
