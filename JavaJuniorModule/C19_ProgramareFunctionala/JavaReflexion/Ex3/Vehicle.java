package src.C19_ProgramareFunctionala.JavaReflexion.Ex3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Vehicle {

    /*
    1. Pornind de la Apelarea unei metode private, scrie un program similar care sa apeleze toate metodele private ale
    clasei Vehicle de mai jos astfel incat:

        a) Sa se afiseze seria masinii si parola calculatorului de bord (i.e. prin apelul metodei corespunzatoare)
        b) Sa se inlocuiasca numarul de persoane maxim la o valoare dubla (i.e. prin apelul metodei private si citirea
        in prealabil a valorii curente)
     */

    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons, String name) {
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public Vehicle(String serialNumber, int noPersons) {
        this(serialNumber, noPersons, "");
    }

    private void displaySerialNumberAndPassword() {
        System.out.println("Method hacked: " + serialNumber);
        System.out.println("Password is: " + "dsf98fsd98!{dev}hack!345m");
    }

    private boolean changeNoPersons(int no) {
        this.noPersons = no;
        return true;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Vehicle rgVehicle = new Vehicle("dsf98fsd98!{dev}hack!345m", 2);

        // accessing first private method
        Method hackedDisplaySerialNumberAndPassword = rgVehicle.getClass().getDeclaredMethod("displaySerialNumberAndPassword");
        hackedDisplaySerialNumberAndPassword.invoke(rgVehicle);
        System.out.println();

        // accessing private field
        Field hackedNoPersons = rgVehicle.getClass().getDeclaredField("noPersons");
        Object value = hackedNoPersons.get(rgVehicle);
        System.out.println("Initial noPersons: " + value);

        // accessing second private method
        String methodName = "changeNoPersons";
        Method hackedChangeNoPersons  = rgVehicle.getClass().getDeclaredMethod(methodName, int.class);
        System.out.println("noPersons was updated? R: " + hackedChangeNoPersons.invoke(rgVehicle,4));

        Field hackedNoPersonsAfterChange = rgVehicle.getClass().getDeclaredField("noPersons");
        Object value2 = hackedNoPersonsAfterChange.get(rgVehicle);
        System.out.println("Final noPersons: " + value2);

    }
}
