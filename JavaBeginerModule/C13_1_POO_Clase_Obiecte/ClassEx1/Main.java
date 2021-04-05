package C13_1_POO_Clase_Obiecte.ClassEx1;

public class Main {

    public static void main(String[]args) {
        Masina masinaAnei = new Masina();
        Masina masinaLuiMarius = new Masina();
        Masina masinaLuiGeorge = new Masina();

        masinaAnei.vopseste("Verde");
        masinaLuiGeorge.parcurgeDistanta(10);
        masinaLuiGeorge.vopseste("caramiziu");
        masinaLuiGeorge.parcurgeDistanta(100);
        masinaAnei.parcurgeDistanta(5);

        // Quiz exercise:
        masinaLuiMarius.vopseste("mov");
        masinaLuiMarius.parcurgeDistanta(10);
        masinaLuiMarius.vopseste("argintiu");
        masinaLuiMarius.parcurgeDistanta(200);


        // afisare campuri:

        System.out.println("Masina Ana:"
                + "\n\t- culoare: " + masinaAnei.culoareCaroserie
                + "\n\t- km parcursi: " + masinaAnei.kmParcursi);
        System.out.println("Masina George:"
                + "\n\t- culoare: " + masinaLuiGeorge.culoareCaroserie
                + "\n\t- km parcursi: " + masinaLuiGeorge.kmParcursi);

        System.out.println("Masina Marius:"
                + "\n\t- culoare: " + masinaLuiMarius.culoareCaroserie
                + "\n\t- km parcursi: " + masinaLuiMarius.kmParcursi);
    }



}
