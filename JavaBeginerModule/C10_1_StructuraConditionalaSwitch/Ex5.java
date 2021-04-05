package C10_1_StructuraConditionalaSwitch;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        /*
        5. Implementeaza functionarea unui modul ATM real: se citeste de la tastatura un numar natural nenul n care corespunde unei anumite operatii ce poate fi realizata de catre ATM (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.).
        Vezi tabelul de mai jos pentru o lista completa de operatii disponibile.
        In functie de operatia solicitata, ATM-ul trebuie sa actualizeze informatiile specifice clientului curent (in cazul de fata, sold curent).

        In vederea selectarii unei anumite operatii, se va folosi o structura conditionala de tip switch.
        Odata ce s-a terminat de efectuat operatia solicitata de utilizator, ATM-ul isi va continua executia, asteptand o noua comanda de la utilizator.
        Singura posibilitate de a intrerupe acest flux este introducerea unei operatii speciale de tip iesire (exemplu: 6 - Iesire).

        Gandeste-te la cat mai multe cazuri de eroare si trateaza-le corespunzator (exemple: la retragerea sumei, numarul citit de la tastatura sa fie divizibil cu 10, sa fie pozitiv, sa fie mai mic decat soldul disponibil etc.)
         */

        int n;
        int soldCurent = 1000;
        int retragereNumerar;
        int depunereNumerar;
        double cursValutar = 4.8;

        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bine ati venit =====");
        System.out.println("\t1. Interogare Sold\n" +
                           "\t2. Retragere Numerar\n" +
                           "\t3. Depunere\n" +
                           "\t4. Info\n" +
                           "\t5. Curs Valutar\n" +
                           "\t6. Iesire");

        n = sc.nextInt();

        while (n > 0) {
            switch (n) {
                case 1:
                    System.out.println("Soldul dumneavoastra este " + soldCurent + " RON.");
                    n = sc.nextInt();
                    continue;
                case 2:
                    System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
                    retragereNumerar = sc.nextInt();
                    if (retragereNumerar > 0) {

                        if (retragereNumerar % 10 == 0) {

                            if (retragereNumerar < soldCurent) {
                                soldCurent = soldCurent - retragereNumerar;
                                System.out.println("Operatie efectuata cu succes!");
                            } else {
                                System.out.println("Nu aveti suficienti bani in cont!");
                            }

                        } else {
                            System.out.println("Suma pe care doriti sa o retrageti trebuie sa fie mutiplu de 10.");
                        }

                    } else {
                        System.out.println("Suma introdusa trebuie sa fie pozitiva!");
                    }

                    n = sc.nextInt();
                    continue;
                case 3:
                    System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
                    depunereNumerar = sc.nextInt();
                    if (depunereNumerar > 0) {

                        if (depunereNumerar % 10 == 0) {

                                soldCurent = soldCurent + depunereNumerar;
                                System.out.println("Operatie efectuata cu succes!");

                        } else {
                            System.out.println("Suma pe care doriti sa o depuneti trebuie sa fie mutiplu de 10.");
                        }

                    } else {
                        System.out.println("Suma introdusa trebuie sa fie pozitiva!");
                    }
                    n = sc.nextInt();
                    continue;
                case 4:
                    System.out.println("Cursul valutar euro este: " + cursValutar + " RON");
                    n = sc.nextInt();
                    continue;
                case 5:
                    System.out.println("Info banca:\n" +
                            "\tNume banca: DevBank\n" +
                            "\tSucursala: Piata Victoriei nr.2 \n" );
                    n = sc.nextInt();
                    continue;
                case 6:
                    break;
                default:
                    System.out.println("Operatiuni disponibile:\n" +
                            "\t1. Interogare Sold\n" +
                            "\t2. Retragere Numerar\n" +
                            "\t3. Depunere\n" +
                            "\t4. Info\n" +
                            "\t5. Curs Valutar\n" +
                            "\t6. Iesire");
                    n = sc.nextInt();
                    continue;
            }

        }

    }
}
