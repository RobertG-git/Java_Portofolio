package W02_Algoritmi.AlgoritmiDeBaza;

public class Ex4_2 {
    public static void main(String[] args) {

        /*
        4.2. Incearca sa intelegi cei 2 algoritmi si sa extinzi functionalitatea aplicatiei scrise de tine anterior, astfel incat acestea sa poata realiza conversia din/in orice baza in/din baza 10.
        Testeaza apoi riguros implementarea, folosind convertorul online pus la dispozitie.*/

        // /!\ Numbers are not converted to HEX format e.g. 2D. I do not know how to store this kind of format.

        System.out.println(anyBaseToDecConvertor(124, 8));
        System.out.println(decToAnyBaseConvertor(99, 16));

    }

    public static int decToAnyBaseConvertor(int numberToConvert, int baseToConvert) {
        int n;
        n = numberToConvert;
        int m = 0;
        int b = baseToConvert;
        int r = 0;
        while (n != 0){
            r = n % b;
            n = n / b;
            m = m * 10 + r;
        }
        return m;
    }

    public static double anyBaseToDecConvertor(int numberToConvert, int currentBase) {
        double s = 0;
        double n = -1;
        double b = currentBase;
        int digit = palindrom(numberToConvert);

        while (numberToConvert != 0){
            numberToConvert /= 10;
            n++;
        }

        while (digit != 0){
            int lastDigit = digit % 10;
            s += lastDigit * Math.pow(b,n);
            digit /= 10;
            n --;
        }

        return s;

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
