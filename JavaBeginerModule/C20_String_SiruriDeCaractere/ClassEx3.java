package C20_String_SiruriDeCaractere;

public class ClassEx3 {

    // Exemplul 1 - Utilizarea specificatorilor

    public static void main(String[] args) {

        String result = String.format("The animal %s has:%n\t- %d eyes,"
                        + " %n\t- %d legs,%n\t- weights %f",
                "\"Tiger Dolu\"", 2, 4, 210.15);

        System.out.println(result +"\n");


        //Exemplul 2 - Utilizarea flag-urilor

        long bigNumber = 123_456_789l;
        int smallInteger = -42;
        double realValue = 3123.14159265358979;

        String ret;

        ret = String.format("Original, unformatted values: %d; %d; %f", bigNumber, smallInteger, realValue);
        System.out.println(ret + "\n");

        ret = String.format("Padding to length 6: %06d; %06d; %06f", bigNumber,smallInteger,realValue);
        System.out.println(ret + "\n");

        ret = String.format("Adding sigh: %+06d; %+06d; %+06f", bigNumber,smallInteger,realValue);
        System.out.println(ret + "\n");

        ret = String.format("Adding digit grouping: %+,06d; %+,06d; %+,06f", bigNumber, smallInteger,realValue);
        System.out.println(ret + "\n");

        ret = String.format("Changing number of decimals: %+06d; %+,06d; %+,06.2f", bigNumber,smallInteger,realValue);
        System.out.println(ret + "\n");
    }


}
