package W02_Algoritmi.MetodeJava2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    /*
    1. Numar - munte
    1. Implementeaza o aplicatie care analizeaza daca numerele introduse de utilizator sunt numere-munte si furnizeaza detalii despre proprietatile (de munte) ale acestuia.
    Aplicatia va rula dupa urmatorul model:

    Aplicatia porneste si ofera clientului un mesaj de salut:
    Buna! Introdu numarul de verificat:
    Utilizatorul introduce un numar valid (intreg, pozitiv).
    Optional, poti trata cateva cazuri de eroare posibile.
    Incearca sa ajuti utilizatorul sa corecteze eroarea, fara a intrerupe programul.
    De exemplu, repeta citirea de un numar limitat de ori, in speranta ca utilizatorul va introduce (in final) un numar valid.
    Aplicatia permite utilizatorului sa introduca o intrebare despre numarul introdus anterior, sub forma de comanda.
    Mesajul afisat in acest pas va fi: Ce vrei sa stii despre numar?
    Ulterior, utilizatorul va introduce o comanda. Comenzile la care poate raspunde sistemul, si pe care trebuie sa le implementezi sunt:
    este-munte: va afisa in functie de caz:
    <numar> este un numar-munte!, unde <numar> este numarul introdus de utilizator
    <numar> nu este un numar-munte., unde <numar> este numarul introdus de utilizator
    panta-maxima: va afisa in functie de caz:
    <numar> are panta maxima de <valoare>, unde <valoare> se calculeaza conform specificatiilor anterioare
    <numar> nu este un numar-munte!, daca numarul nu este valid
    panta-minima: va afisa in functie de caz:
    <numar> are panta minima de <valoare>, unde <valoare> se calculeaza conform specificatiilor anterioare
    <numar> nu este un numar-munte!, daca numarul nu este valid
    distanta-urcare: va afisa in functie de caz:
    <numar> are distanta de urcare de <valoare>, unde <valoare> se calculeaza conform specificatiilor anterioare
    <numar> nu este un numar-munte!, daca numarul nu este valid
    distanta-coborare: va afisa in functie de caz:
    <numar> are distanta de coborare de <valoare>, unde <valoare> se calculeaza conform specificatiilor anterioare
    <numar> nu este un numar-munte!, daca numarul nu este valid
    urmatorul-numar: se considera ca numarul actual nu mai este de interes (i.e. analiza acestuia s-a incheiat) si permite utilizatorului introducerea unui nou numar.
    Mesajul afisat in acest pas va fi: Introdu noul numar de verificat:
    Aplicatia continua din pasul 3.
    stop: pana la intalnirea acestei comenzi, programul va permite introducerea de noi comenzi, conform algoritmului descris. La introducerea comenzii stop programul isi va termina executia.
    La iesire, va afisa mesajul Ne bucuram ca ai utilizat aplicatia, pe curand!
    ajutor: va afisa meniul de comenzi, adica:
    Comenzile disponibile sunt:
    ajutor			- afiseaza acest meniu de ajutor
    este-munte		- verifica daca un numar este munte
    panta-minima		- afiseaza panta minima
    panta-maxima		- afiseaza panta maxima
    distanta-urcare		- afiseaza distanta de urcare
    distanta-coborare	- afiseaza distanta de coborare
    stop			- inchide aplicatia
    pentru orice alta comanda (i.e. invalida), se va afisa meniul de comenzi prezentat anterior. Astfel, se permite utilizatorului sa revada comenzile valide si sa introduca o noua comanda.
         */

    public static void main(String[] args) {

        // 1 & 2
        System.out.println("Hello! Please insert number to check: ");
        int[] n = readN();

        // 3.
        System.out.println();
        System.out.println("What do you want to know about number?");
        System.out.print("""
                \t - a - is mountain
                \t - b - maximum slope
                \t - c - minimum slope
                \t - d - ascending distance
                \t - e - descending distance
                \t - f - next number\s
                \t - g - stop program
                \t - h - help""");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String read = sc.next();
        char answer = read.charAt(0);
        while (answer != 'g') {
            switch (answer) {
                case 'a' -> {
                    System.out.println(isMountain(n));
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'b' -> {
                    System.out.println(maximumSlop(n));
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'c' -> {
                    System.out.println(minimumSlop(n));
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'd' -> {
                    System.out.println(ascendDistance(n));
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'e' -> {
                    System.out.println(descendingDistance(n));
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'f' -> {
                    System.out.println("Please insert the new number");
                    n = readN();
                    System.out.println();
                    read = sc.next();
                    answer = read.charAt(0);
                }
                case 'h' -> {
                    System.out.println("Need some help?");
                    System.out.print("""
                            \t - a - is mountain
                            \t - b - maximum slope
                            \t - c - minimum slope
                            \t - d - ascending distance
                            \t - e - descending distance
                            \t - f - next number\s
                            \t - g - stop program
                            \t - h - help""");
                    System.out.println();
                    read = sc.next();
                    answer = read.charAt(0);
                }
            }
        }
        System.out.println("Thank you for using our app!");
    }

    public static int[] readN(){
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];
        int stopKey = -1;
        int numberOfElements = 0;

        int read = sc.nextInt();
        while (read != stopKey) {
            n[numberOfElements] = read;
            numberOfElements++;
            if (numberOfElements == n.length) {
                n = Arrays.copyOf(n, n.length * 2);
            }
            read = sc.nextInt();
        }
        n = Arrays.copyOf(n, numberOfElements);
        System.out.print("Your number is: ");
        displayArray(n);

        return n;
    }

    public static boolean isMountain(int[] n) {

        int topIndex = topIndex(n);
        int baseIndex = baseIndex(n, topIndex);

        return baseIndex == n.length - 1;
    }

    public static int maximumSlop(int[] n) {
        // calculating topIndex and baseIndex
        int topIndex = topIndex(n);
        int baseIndex = baseIndex(n, topIndex);

        // calculating the max slope
        if (baseIndex == n.length - 1) {
            int maxSlope = 0;
            int slope;

            for (int i = 0; i < n.length - 1; i++) {
                slope = Math.abs(n[i] - n[i + 1]);
                if (slope > maxSlope) {
                    maxSlope = slope;
                }
            }
            return maxSlope;
        } else {
            return -1;
        }

    }

    public static int minimumSlop(int[] n) {
        // calculating topIndex and baseIndex
        int topIndex = topIndex(n);
        int baseIndex = baseIndex(n, topIndex);

        // calculating the min slope
        if (baseIndex == n.length - 1) {
            int minSlope = 10;
            int slope;
            for (int i = 0; i < n.length - 1; i++) {
                slope = Math.abs(n[i] - n[i + 1]);
                if (slope < minSlope) {
                    minSlope = slope;
                }
            }
            return minSlope;
        } else {
            return -1;
        }

    }

    public static int ascendDistance(int[] n) {
        // calculating topIndex and baseIndex
        int topIndex = topIndex(n);

        // calculating ascendDistance
        int sum = 0;
        if ((isMountain(n)) & (topIndex != 0)) {
            for (int i = 0; i <= topIndex - 1; i++) {
                sum += Math.abs(n[i + 1] - n[i]);

            }
        } else if (topIndex == 0) {
            sum = -1;
        }
        return sum;
    }

    public static int descendingDistance(int[] n) {
        // calculating topIndex and baseIndex
        int topIndex = topIndex(n);
        int baseIndex = baseIndex(n, topIndex);

        // calculating descendingDistance
        int sum = 0;
        if ((isMountain(n)) && ((baseIndex != n.length - 1))) {
            for (int i = topIndex; i <= baseIndex - 1; i++) {

                sum += Math.abs(n[i + 1] - n[i]);
            }
        }
        if (baseIndex == n.length - 1) {
            sum = -1;
        }
        return sum;
    }

    public static void displayArray(int[] n) {
        System.out.println();
        for (int j : n) {
            System.out.print(j);
        }
    }

    public static int topIndex(int[] n) {
        int topIndex = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] < n[i + 1]) {
                topIndex = i + 1;
            } else if (n[i] >= n[i + 1]) {
                break;
            }
        }
        return topIndex;
    }

    public static int baseIndex(int[] n, int topIndex) {
        int baseIndex = topIndex;
        for (int j = topIndex; j < n.length - 1; j++) {
            if (n[j] > n[j + 1]) {
                baseIndex++;
            } else if (n[j] < n[j + 1]) {
                break;
            }
        }
        return baseIndex;
    }

}


