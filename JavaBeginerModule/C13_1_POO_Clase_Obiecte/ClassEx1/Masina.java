package C13_1_POO_Clase_Obiecte.ClassEx1;

public class Masina {

    // starea obiectului
    String culoareCaroserie;
    int putereMotor;
    String tipCombustibil;
    int kmParcursi;

    // comportamentul obiectului
    public void vopseste(String culoareNoua) {
        culoareCaroserie = culoareNoua;
    }

    public void parcurgeDistanta(int noiKmParcursi) {
        kmParcursi +=  noiKmParcursi;
    }

}
