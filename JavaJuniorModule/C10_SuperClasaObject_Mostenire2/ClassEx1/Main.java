package src.C10_SuperClasaObject_Mostenire2.ClassEx1;

public class Main {
    public static void main(String[] args) {
        Person rg = new Person("Homosapiens","Girbea", "Robert",28, 50);
        Person sameRg = new Person("Homosapiens","Girbea", "Robert",28, 45);
        Person notSameRg = new Person("Homosapiens","Girbea", "Robert",29, 45);
        Person ana = new Person("Homosapiens","Popescu", "Ana",28, 50);

        System.out.println(rg.equals(sameRg));
        System.out.println(rg.equals(notSameRg));
        System.out.println(rg.equals(ana));

        System.out.println(rg.hashCode());
        System.out.println(sameRg.hashCode());
        System.out.println(notSameRg.hashCode());
        System.out.println(ana.hashCode());

        // Prop1 test:
        System.out.println(rg.hashCode() + " " + rg.hashCode());

        // Prop2 test:
        System.out.println(rg.hashCode() == sameRg.hashCode());

    }
}
