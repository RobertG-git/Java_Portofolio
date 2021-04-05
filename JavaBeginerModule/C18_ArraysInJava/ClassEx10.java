package C18_ArraysInJava;

public class ClassEx10 {

    // Interschimbarea a doua valori

    public static void displayArray(double[] array, String message) {
        System.out.print(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean swap(double[] array, int index1, int index2) {

        // validarea indecsilor
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            return false;
        }

        // algoritmul de interschimbare
        double aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
        return true;

    }

    public static void main(String[] args) {
        double[] appleStockPrices = {173.2, 181.5, 183.4, 184.3, 190.0, 192.3};

        displayArray(appleStockPrices,"Vectorul initial este:\n");

        swap(appleStockPrices, 5, 2);   // OK
        swap(appleStockPrices, 3, 100); // ERR - va lasa array-ul nemodificat
        swap(appleStockPrices, 1, 1);   // OK - va lasa array-ul nemodificat
        swap(appleStockPrices, 1, 4);   // OK

        displayArray(appleStockPrices, "Vectorul final este:\n");
    }
}
