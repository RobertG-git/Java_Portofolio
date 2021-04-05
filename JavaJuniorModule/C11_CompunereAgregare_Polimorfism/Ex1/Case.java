package src.C11_CompunereAgregare_Polimorfism.Ex1;

public class Case {

    public void pressPowerButton() {
        System.out.println("class Case: Power button pressed.");
    }

    public void pressVolumeUp() {
        System.out.println("class Case: Volume UP pressed.");
    }

    public void pressVolumeDown() {
        System.out.println("class Case: Volume DOWN pressed.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
