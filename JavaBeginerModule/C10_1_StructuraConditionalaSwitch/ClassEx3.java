package C10_1_StructuraConditionalaSwitch;

public class ClassEx3 {

    public static void main(String[] args) {

        int theDayToday = 1;
        //theDayToday = 4;
        //theDayToday = 6;
        //theDayToday = 7;
        //theDayToday = 10;

        switch (theDayToday) {
            case 1:
                System.out.println("Luni");
            case 2:
                System.out.println("Marti");
            case 3:
                System.out.println("Miercuri");
            case 4:
                System.out.println("Joi");
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
            case 7:
                System.out.println("Este weekend");
                break;
            default:
                System.out.println("Nu ai introdus un numar valid.");
                System.out.println("Zilele saptamanii sunt in intervalul [1, 7], "
                + "iar tu ai introdus: " + theDayToday);
                break;
        }

        System.out.println("\nWork hard, play hard!");
    }

}
