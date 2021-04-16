package src.C30_IO_Work_with_files.Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    /*

    1. Se da urmatorul fisier text, TextInput.txt. Scrie un program care primeste de la tastatura doua cuvinte (i.e. siruri de caractere fara spatii) si inlocuieste in text toate aparitiile primului cu cel de-al doilea.

    Obs: deoarece citirea si scrierea se realizeaza din/in acelasi fisier iti recomandam, pentru simplitate, sa faci mai intai citirea (completa) si abia ulterior scrierea. Pasii propusi sunt:
    1. Citirea fisierului:
        Deschide fisierul TextInput.txt pentru citire.
        Citeste (tot) continutul fisierului.
        Inchide fisierul (pentru citire).
    2. Procesarea textului
        Scrierea fisierului:
    3. Deschide (acelasi) fisier TextInput.txt pentru scriere.
        Scrie (intreg) continutul fisierului.
        Inchide fisierul (pentru scriere).

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

        ArrayList<String> words = new ArrayList<>();
        try (Scanner sc2 = new Scanner(new BufferedReader(new FileReader("C:\\Users\\User_principal\\Desktop" +
                "\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex1\\TextInput")))) {
            while (sc2.hasNext()) {
                words.add(sc2.nextLine());
            }
        }

        // textProcessing
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).contains(firstString)) {
                words.set(i,words.get(i).replace(firstString,secondString));
            }
        }

        // writeInFile
        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\User_principal\\Desktop" +
                "\\Devmind\\2. InteliiJ share\\JavaJuniorModule\\src\\C30_IO_Work_with_files\\Ex1\\TextInput"))) {
            for (String s : words) {
                outputFile.write(s);
                outputFile.newLine();
            }
        }
    }
}
