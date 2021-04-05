package C13_1_POO_Clase_Obiecte.ClassEx2;

public class Masina {

    // Starea obiectului
    String culoareCaroserie;
    int putereMotor;
    String tipCombustibil;
    int kmParcursi;

    // Comportamentul obiectului
    public void vopseste(String culoareNoua) {
        culoareCaroserie = culoareNoua;
    }

    public void parcugeDistanta(int noiKmParcursi) {
        kmParcursi += noiKmParcursi;
    }

}
