package C21_PrelucrareaSirurilorStringBuilder;

public class ClassEx1 {

    /*
    Conversia la / din tipuri numerice
    - 'String' -> tip numeric
     */

    public static void main(String[] args) {
        String doubleStr = "-123.9";
        String intStr = "-105";
        String byteStr = "+15";

        Double doubleAux = Double.valueOf(doubleStr);
        double doubleValue = doubleAux.doubleValue();
        int intValue = Integer.valueOf(intStr).intValue();
        byte byteValue = Byte.valueOf(byteStr).byteValue();

        System.out.println(doubleValue + " " + intValue + " " + byteValue);

    }

}