package C22_AlgoritmiDeProcesareAStringurilor;

public class Ex6 {
    /*
    6. Implementeaza doua metode String substring(String source, int beginIndex) si respectiv
    String substring(String source, int beginIndex, int endIndex), avand un comportament similar cu metodele substring(…) ale clasei String.
     */

    public static void main(String[] args) {
        String source = "Ana are mere";
        int beginIndex = 4;

        System.out.println(substring(source,beginIndex));

    }

    public static String substring(String source,int beginIndex ) {
        StringBuilder sbSource = new StringBuilder();
        for (int i = beginIndex; i < source.length(); i++) {
            sbSource.append(source.charAt(i));
        }

        return String.valueOf(sbSource);
    }
}
