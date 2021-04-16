package src.C30_IO_Work_with_files.Ex1_1;

import java.io.*;
import java.util.Scanner;

public class Ex1_1 {
    /*
    1.1. Modifica implementarea anterioara astfel:

        - textul se va scrie in alt fisier (ex: TextOutput.txt)
        - programul nu va stoca tot textul si va face „conversia“ textului linie cu linie, urmand pasii:
            1. se citeste o noua linie din fisierul de intrare
            2. se inlocuieste cuvantul cheie
            3. se scrie in fisierul de output linia curenta
     */

    public static void main(String[] args) throws IOException {
        textProcessing();
    }

    public static void textProcessing () throws IOException {
        // readFile & data
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert first word: ");
        String firstString = sc.nextLine();
        System.out.println("Please insert first word: ");
        String secondString = sc.nextLine();
        sc.close();

        String currentWord;
        try (Scanner sc2 = new Scanner(new BufferedReader(new FileReader("C:\\Users\\User_principal\\Desktop\\" +
                "Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex1_1\\TextInput"))) ;
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\User_principal\\Desktop\\" +
                "Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex1_1\\TextOutput"))) {
            while (sc2.hasNext()) {
                currentWord = sc2.nextLine();
                if (currentWord.contains(firstString)) {
                    currentWord = currentWord.replace(firstString,secondString);
                }
                outputFile.write(currentWord);
                outputFile.newLine();
            }
        }
    }
}
