package src.C2_Recap_RecursivitateArray;

public class Ex4 {
    /*
    4. Bubble sort
    4.1. Implementeaza o metoda void bubbleSort(double[] values), care sorteaza elementele colectiei in ordine crescatoare.

    4.2. Daca nu ai facut-o deja, optimizeaza algoritmul anterior astfel incat sa tina cont de faptul ca elementele din capatul array-ului sunt deja sortate si prin urmare nu mai este necesara iterarea prin acestea. Cu alte cuvinte, putem diminua treptat numarul de pasi ai fiecarei iteratii, mergand pana la elementele deja sortate in etapele anterioare.

    4.3. Modifica algoritmul anterior astfel incat sa sorteze elementele descrescator.
     */

    public static void main(String[] args) {
        double[] values = {5, 1, 8, 4, 2 };

        bubbleAscendSort(values);
        System.out.println();
        bubbleDescendSort(values);
    }

    // 4.1 & 4.2
    public static void bubbleAscendSort(double[] values) {
        for (int i = 0; i < values.length - 1 ; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j]) {
                    double aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }

    // 4.3
    public static void bubbleDescendSort(double[] values) {
        for (int i = 0; i < values.length - 1 ; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] < values[j]) {
                    double aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
