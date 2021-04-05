package C13_1_POO_Clase_Obiecte.Ex1;

public class Laptop {

    // Starea obiectului
    int vechime; // ani e.g. 1 an
    String culoareCarcasa;
    String procesor;
    int spatiuStocare; // Gb e.g. 8mb
    String tipTastatura; // querty, azerty

    // Comportamentul obiectului
    public void adaugareVechime(int vechimeAditionala) {
        vechime += vechimeAditionala;
    }

    public void vopseste(String nouaCuloare) {
        culoareCarcasa = nouaCuloare;
    }

    public void schimbareProcesor(String procesorNou) {
        procesor = procesorNou;
    }

    public void printObjectState() {
        System.out.println("\t - Vechimea laptopului este de " + vechime + " an/i.");
        System.out.println("\t - Culoarea laptopului este: " + culoareCarcasa +".");
        System.out.println("\t - Procesorul laptopului este:" + procesor +".");
        System.out.println("\t - Spatiul de stocare este de " + spatiuStocare + "Gb.");
        System.out.println("\t - Tastatura este de tip: " + tipTastatura + ".");
    }

    public void initializeState() {
        vechime = 1;
        culoareCarcasa = "negru";
        procesor = "intel";
        spatiuStocare = 500;
        tipTastatura = "qwerty";
    }
}
