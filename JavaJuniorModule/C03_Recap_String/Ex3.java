package src.C3_Recap_String;

public class Ex3 {
    /*
    3. String to number
    Se da urmatoarea definitie a metodei convertStringToNumber(String numberStr), avand ca scop conversia unui numar pozitiv,
    reprezentat sub forma de sir de caractere, intr-o valoare numerica. Utilizand intr-un mod inteligent array-ul definit la inceputul metodei,
    realizeaza conversia sirului de caractere numberStr intr-o valoare numerica (i.e. tipul int), fara a utiliza nicio
    metoda din Java de conversie a String-urilor in valori numerice.
     */

    public static void main(String[] args) {
        String numberStr = "154";
        System.out.println(convertStringToNumber(numberStr));
    }

    public static int convertStringToNumber(String numberStr) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int numValue = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (numberStr.charAt(i) == digits[j]) {
                    numValue = numValue * 10 + j;
                }
            }
        }

        return numValue;
    }
}
