package C13_1_POO_Clase_Obiecte.Ex1;

public class Main {
    public static void main(String[] args) {

        /*
        1.1. Alege 2 obiecte de tipuri diferite si proiecteaza clasele aferente, folosind notiunile studiate in acest capitol. Fiecare tip de obiect (i.e. clasa) trebuie sa contina:
        Reprezentarea starii: minim 5 campuri (la alegere).
        Reprezentarea comportamentului: minim 3 actiuni la alegere, care sa fie corelate logic cu tipul obiectului.
        Pentru fiecare clasa, defineste inca o metoda, printObjectState(), care afiseaza starea interna a obiectelor:
        Concret, metoda va afisa toate campurile obiectului, pe rand, intr-un mod placut (i.e. alaturi de un mesaj semnificativ pentru fiecare camp).
        1.2. Dupa ce ai definit cele 2 clase, creeaza cate 2 obiecte de fiecare tip si initializeaza toate campurile cu valori corespunzatoare. Pentru initializare, defineste cate o metoda corespunzatoare fiecarei clase de obiecte, initializeState(…), care primeste drept parametri valorile tuturor campurilor (i.e. valorile cu care trebuie initializata starea). Apeleaza ulterior metoda in main(…) pentru a initializa fiecare obiect.
        1.3. La final, dupa initializare, afiseaza starea fiecarui obiect folosind metoda corespunzatoare.
         */

        // creare obiecte
        Laptop laptopRobert = new Laptop();
        Laptop laptopAna = new Laptop();

        Telefon telefonRobert = new Telefon();
        Telefon telefonAna = new Telefon();

        // initializare stare
        laptopRobert.initializeState();
        laptopAna.initializeState();
        telefonRobert.initializeState();
        telefonAna.initializeState();

        System.out.println("Stare Laptop Robert:");
        laptopRobert.printObjectState();

        System.out.println();
        System.out.println("Stare Laptop Ana:");
        laptopAna.printObjectState();

        System.out.println();
        System.out.println("Stare Telefon Robert:");
        telefonRobert.printObjectState();

        System.out.println();
        System.out.println("Stare Telefon Ana:");
        telefonAna.printObjectState();
    }
}
