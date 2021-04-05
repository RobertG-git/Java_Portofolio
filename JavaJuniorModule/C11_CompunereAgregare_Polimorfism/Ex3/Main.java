package src.C11_CompunereAgregare_Polimorfism.Ex3;

public class Main {

    public static void main(String[] args) {
        Polimorfism polimorfism, polimorfism1;
        polimorfism = new Polimorfism();
        polimorfism1 = new PolimorfismDinamic();

        polimorfism.objectInfo();
        polimorfism1.objectInfo();

    }

}
