package C13_1_POO_Clase_Obiecte.Ex1;

public class Telefon {

    // Starea obiectului
    String culoareCarcasa;
    int numarCamereFoto;
    int vechime;
    boolean recunoastereFaciala;
    int spatiuMemorie; //Gb

    // Comportamentul obiectului

    public void upgradeSecuritate() {
        recunoastereFaciala = true;
    }

    public void upgradeCamere(int noulNumarDeCamereFoto) {
        numarCamereFoto = noulNumarDeCamereFoto;
    }

    public void upgradeMemorie(int memorieAditionala) {
        spatiuMemorie += memorieAditionala;
    }

    public void printObjectState() {
        System.out.println("\t - Culoarea telefonului este " + culoareCarcasa + ".");
        System.out.println("\t - Telefonul are un numar de " + numarCamereFoto + " camere foto.");
        System.out.println("\t - Vechimea telefonului este de " + vechime + " an/i");
        System.out.println("\t - Telefonul are recunoastere faciala? R: " + (recunoastereFaciala ? "adevarat" : "fals") +".");
        System.out.println("\t - Spatiul de memorie este de " + spatiuMemorie + "Gb.");
    }

    public void initializeState() {
        culoareCarcasa = "negru";
        numarCamereFoto = 3;
        vechime = 2;
        recunoastereFaciala = false;
        spatiuMemorie = 128;
    }

}
