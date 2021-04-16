package src.C30_IO_Work_with_files.Ex2;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    /*
    2. Se dau 2 fisiere ce contin fiecare cate un sir de numere ordonate, separate prin spatiu. Scrie un program care
    produce un al treilea fisier ce va contine sirul de numere ordonat crescator. In cadrul rezolvarii, nu ai voie sa
    folosesti niciun tip de colectie.
     */

    public static void main(String[] args) throws IOException {
        mergeFiles();
    }

    public static void mergeFiles() throws IOException {
        int firstNumber = -404;
        int secondNumber = -404;
        boolean isUsed = true;
        boolean isUsed2 = true;

        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\User_principal\\Desktop\\" +
                "Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex2\\Numbers1")));
             Scanner sc2 = new Scanner(new BufferedReader(new FileReader("C:\\Users\\User_principal\\Desktop\\" +
                     "Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex2\\Numbers2")));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\User_principal\\Desktop\\" +
                     "Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex2\\NumbersMerge"))) {

            while (true) {

                if (!sc.hasNextInt() && !isUsed2) {
                    while (sc2.hasNextInt()) {
                        outputFile.write(sc2.nextInt() + " ");
                    }
                    break;
                }
                if (!sc2.hasNextInt() && !isUsed) {
                    while (sc.hasNextInt()) {
                        outputFile.write(sc.nextInt() + " ");
                    }
                    break;
                }

                if (isUsed) {
                    firstNumber = sc.nextInt();
                    isUsed = false;
                }

                if (isUsed2) {
                    secondNumber = sc2.nextInt();
                    isUsed2 = false;
                }


                if (firstNumber < secondNumber) {
                    outputFile.write(firstNumber + " ");
                    isUsed = true;
                } else {
                    outputFile.write(secondNumber + " ");
                    isUsed2 = true;
                }
            }


            outputFile.write(Math.max( firstNumber, secondNumber) + " ");
        }
    }
}
