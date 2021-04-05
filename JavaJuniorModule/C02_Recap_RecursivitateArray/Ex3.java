package src.C2_Recap_RecursivitateArray;

public class Ex3 {
    /*
    3. Cerne zero-uri
    Dandu-se un array de numere intregi, scrie un algoritm care sa „mute“ toate elementele nule (i.e. 0) la inceputul vectorului.
    Ordinea elementelor nenule din array trebuie sa ramana neschimbata (vezi exemplele urmatoare pentru detalii).
     */

    public static void main(String[] args) {
        int[] array = {0, 2, 1, 0, -1, 14, 0, -6};
        moveZeroesInArrayV2(array);
    }

    public static void moveZeroesInArrayV2(int[] array) {
        int[] secondArray = new int[array.length];
        int numberOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                secondArray[numberOfElements] = array[i];
                numberOfElements++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                secondArray[numberOfElements] = array[i];
                numberOfElements++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
