package W02_Algoritmi.AlgoritmiDeBaza;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {

        /*
        4.1. Scrie o aplicatie care primeste de la utilizator (i.e. prin citirea de la tastatura) un numar, baza de numeratie in care se afla numarul si baza de numeratie in care se doreste a fi convertit.
        Programul va realiza conversia numarului din baza introdusa in cea ceruta.
        Daca utilizatorul introduce alte baze de numeratie in afara de 2 si 10, programul va afisa o eroare corespunzatoare si se va termina.
         */

        int n;
        int currentBase; // base in which number is
        int baseToConvert; // base in which number must be converted

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert 'n', 'currentBase','baseToConvert' : ");
        n = sc.nextInt();
        currentBase = sc.nextInt();
        baseToConvert = sc.nextInt();

        switch (currentBase){
            case 2:
                System.out.println(binToDecConvertor(n));
                break;
            case 10:
                System.out.println(DecToBinConvertor(n));
                break;
            default:
                System.out.println("Please insert a valid base! '2' or '10'.");
                break;
        }

    }
    public static int binToDecConvertor(int n) {
        n = palindrom(n);
        int convertedNo = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            convertedNo = convertedNo * 2 + lastDigit;
            n /= 10;
        }

        return convertedNo;
    }

    public static int DecToBinConvertor(int n) {
        int convertedNo = 0;
        while (n != 0) {
           convertedNo = convertedNo * 10 + n % 2;
            n = n / 2;
        }
        return palindrom(convertedNo);
    }

    public static int palindrom (int n) {
        int palindrom = 0;
        while (n != 0 ) {
            int lastDigit = n % 10;
            palindrom = palindrom * 10 +lastDigit;
            n /= 10;
        }
        return palindrom;
    }
}
