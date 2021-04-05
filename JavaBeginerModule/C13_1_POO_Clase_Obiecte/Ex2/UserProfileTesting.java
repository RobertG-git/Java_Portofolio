package C13_1_POO_Clase_Obiecte.Ex2;

public class UserProfileTesting {

    public static void main(String[] args) {

        /*
        2.2. Comportamentul obiectelor de tip class ProfilUtilizator va fi definit prin urmatoarele metode:

            initializeazaProfil(): metoda va citi de la tastatura, pe rand, informatiile necesare initializarii starii
            actualizareEmail(String): metoda va actualiza adresa de email
            actualizareNumarTelefon(String): metoda va actualiza numarul de telefon
            afisareVarsta(int an): metoda primeste ca argument anul curent (i.e. 2020), calculeaza varsta aproximativa (i.e. ca diferenta de ani) si afiseaza rezultatul
            afisareStareInterna(): actiunea va afisa starea completa a obiectului

        2.3. Testeaza implementarea anterioara printr-un scenariu riguros, implementat intr-o clasa separata (i.e. TestareProfilUtilizator), care sa foloseasca cel putin 2 obiecte si sa apeleze cel putin o data fiecare metoda.
         */

        // Testing user Robert
        UserProfile userRobert = new UserProfile();
        System.out.println("Creating 'userRobert' profile");

        // 1.
        userRobert.initializeProfile();
        System.out.println("Profile of 'userRobert' is the following: ");
        userRobert.displayInternalState();

        // 2.
        System.out.println();
        System.out.println("Email successfully updated! ");
        userRobert.emailUpdate("garbearobert@yahoo.com");

        // 3.
        System.out.println();
        System.out.println("Phone number successfully updated! ");
        userRobert.phoneNumberUpdate("0766404322");

        // 4.
        System.out.println();
        System.out.print("Age of 'userRobert' profile is the following: ");
        userRobert.displayAge(2020);
        System.out.println();

        // 5.
        System.out.println();
        System.out.println("Current data of 'userRobert' profile is the following: ");
        userRobert.displayInternalState();


        // Testing user Ana

        System.out.println();
        UserProfile userAna = new UserProfile();
        System.out.println("Creating 'userAna' profile");

        // 1.
        userAna.initializeProfile();
        System.out.println("Profile of 'userAna' is the following: ");
        userAna.displayInternalState();

        // 2.
        System.out.println();
        System.out.println("Email successfully updated! ");
        userAna.emailUpdate("ana@yahoo.com");

        // 3.
        System.out.println();
        System.out.println("Phone number successfully updated! ");
        userAna.phoneNumberUpdate("0766443322");

        // 4.
        System.out.println();
        System.out.print("Age of 'userAna' profile is the following: ");
        userAna.displayAge(2020);
        System.out.println();

        // 5.
        System.out.println();
        System.out.println("Current data of 'userAna' profile is the following: ");
        userAna.displayInternalState();
    }

}
