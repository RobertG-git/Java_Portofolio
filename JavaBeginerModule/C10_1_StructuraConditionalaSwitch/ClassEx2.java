package C10_1_StructuraConditionalaSwitch;

public class ClassEx2 {

    public static void main(String[] args) {

        int dayOfWeek = 2;
        dayOfWeek = 10;
        // dayOfWeek = 4;
        // dayOfWeek = 7;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Nu ai introdus un numar valid.");
                System.out.println("Zilele saptamanii sunt in intervalul [1, 7], "
                        + " iar tu ai introdus: " + dayOfWeek);
        }
    }
}
