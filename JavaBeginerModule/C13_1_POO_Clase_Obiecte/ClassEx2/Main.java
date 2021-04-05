package C13_1_POO_Clase_Obiecte.ClassEx2;

public class Main {
    public static void main(String[] args) {
        //Crearea unui nou obiect de tip'Masina', numit 'masinaAnei'
        Masina masinaAnei = new Masina();

        // Verificarea valorilor campurilor de tip ''int''
        // - dupa initializarea automata la valoarea implicita
        System.out.println("Masina Anei a parcurs: " + masinaAnei.kmParcursi + " km.");
        System.out.println("Masina Anei are: " + masinaAnei.putereMotor + " cai putere.");

        // Actualizarea starii obiectului 'masinaAnei'
        // - prin modificarea campurilor necesare
        masinaAnei.tipCombustibil = "benzina";
        masinaAnei.culoareCaroserie = "rosu";
        masinaAnei.putereMotor = 85;

        // Obiect 2
        Masina masinaLuiMarius = new Masina();
        masinaLuiMarius.tipCombustibil = "benzina";
        masinaLuiMarius.culoareCaroserie = "albastra";
        masinaLuiMarius.putereMotor = 105;

        // Obiect 3
        Masina masinaLuiGeorge = new Masina();
        masinaLuiGeorge.tipCombustibil = "motorina";
        masinaLuiGeorge.culoareCaroserie = "verde";
        masinaLuiGeorge.putereMotor = 144;

        // Afisarea culorilor celor 3 masini
        System.out.println();
        System.out.println("Culorile masinilor sunt: "
                  + "\n\t- masinaAnei: " + masinaAnei.culoareCaroserie
                  + "\n\t- masinaLuiMarius: " + masinaLuiMarius.culoareCaroserie
                  + "\n\t- masinaLuiGeorge: " + masinaLuiGeorge.culoareCaroserie);

        // Afisare si definire alte atribute
        masinaAnei.vopseste("verde");
        masinaLuiGeorge.parcugeDistanta(10);
        masinaLuiGeorge.parcugeDistanta(100);
        masinaAnei.parcugeDistanta(5);

        System.out.println();
        System.out.println("Masina Ana:"
                   + "\n\t- culoare: " + masinaAnei.culoareCaroserie
                   + "\n\t- km parcursi: " + masinaAnei.kmParcursi);
        System.out.println("Masina George: "
                   + "\n\t- culoare: " + masinaLuiGeorge.culoareCaroserie
                   + "\n\t- km parcursi: " + masinaLuiGeorge.kmParcursi);
    }
}
