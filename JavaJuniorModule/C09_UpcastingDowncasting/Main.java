package src.C9_UpcastingDowncasting;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Terrestrial teraCreature = new Terrestrial(false, 10, 100, "Reptiles", 0, 2);
//        teraCreature.move(10);
//        teraCreature.fight();
//        System.out.println();
//
//        // Case I - Upcasting:
//            // We can treat the object 'teraCreature' as an 'Animal', by referring the object using an 'Animal' reference
//        Animal animalRef = teraCreature;
//        animalRef.move(10);
//        // animalRef.fight(); --> error (Animal does not have 'fight' method).
//        System.out.println();
//
//
//        // Case II - Further Upcasting:
//        Object object = teraCreature;
//        Object object2 = animalRef;
//        // object.move(10); --> error (Object does not have 'move' method).
//        // object.fight();  --> error (Object does not have 'fight' method).

            //Comportament colectiv
        Zebra zebra = new Zebra(false, 25, 50, "Mountain Zebra", 4, 2);
        Tiger tiger = new Tiger(false, 25, 50, "Siberian Tiger", 4, 2);
        Tiger tiger2 = new Tiger(false, 25, 50, "Bengal Tiger", 4, 2);
        Rhino rhino = new Rhino(false, 25, 50, "Mountain Zebra", 4, 2);

        ArrayList<Terrestrial> zoo = new ArrayList<>();
        zoo.add(zebra);
        zoo.add(tiger);
        zoo.add(tiger2);
        zoo.add(rhino);
//
//        for (Terrestrial terrestrial : zoo) {
//            terrestrial.saySomething();
//        }
//          // Downcasting
//        Zebra theZebra = (Zebra) zoo.get(0);
//        Tiger theFirstTiger = (Tiger) zoo.get(1);
//        Tiger theSecondTiger = (Tiger) zoo.get(2);
//        Rhino theRhino = (Rhino) zoo.get(3);

            // instanceof
//        Terrestrial terrestrialRef = new Terrestrial(false, 25, 40, "Terestrial",4,2);
//        System.out.println(terrestrialRef instanceof Tiger);
//        System.out.println(terrestrialRef instanceof Zebra);
//        System.out.println(terrestrialRef instanceof Animal);
//        System.out.println(terrestrialRef instanceof Object);

//        for(Terrestrial terrestrial : zoo) {
//            if(terrestrial instanceof Rhino) {
//                Rhino rhinoRef = (Rhino) terrestrial;
//                rhinoRef.horn();
//            } else if (terrestrial instanceof Tiger) {
//                Tiger tigerRef = (Tiger) terrestrial;
//                tigerRef.agility();
//            } else if (terrestrial instanceof Zebra) {
//                Zebra zebraRef = (Zebra) terrestrial;
//                zebraRef.stripes();
//            } else {
//                System.out.println("Error: unknown kind of animal");
//            }
//        }
//
//        for (Terrestrial terrestrial : zoo) {
//            terrestrial.specialCaracteristic();
//        }

        // Metode Generice
//        ZooOperations.recordAnimal(zebra);
//        ZooOperations.recordAnimal(tiger);
//        ZooOperations.recordAnimal(teraCreature);

        //Static method example
//        rhino.subspeciesDescription();
//        zebra.subspeciesDescription();
//        Terrestrial terrestrial = zebra;
//        terrestrial.subspeciesDescription();
//        terrestrial = rhino;
//        terrestrial.subspeciesDescription();
//        System.out.println("Iterate through all the animals: ");
//        for(int i = 0; i < zoo.size(); i++) {
//            zoo.get(i).subspeciesDescription();
//        }
//        ((Tiger)zoo.get(1)).subspeciesDescription();

        // ToString example
//        System.out.println(zebra.toString());
//        System.out.println(rhino);
//        System.out.println("Iterate through all the animals");
//        for (Terrestrial terrestrial : zoo) {
//            System.out.println(terrestrial.toString());
//        }

        // Equals example
            // /!\ In Java, relatia de egalitate intre doua obiecte este implementata prin compararea referintelor catre cele doua obiecte.
                // Prin urmare, doua variabile-obiect sunt egale daca si numai daca acestea refera acelasi obiect.
        Tiger tiger3 = new Tiger(true, 40, 70,"Bengal Tiger", 4,2);
        Tiger tiger4 = tiger3;

//        System.out.println("tiger is equal to tiger2? answer: " + tiger.equals(tiger2));
//        System.out.println("tiger2 is equal to tiger3? answer: " + tiger2.equals(tiger3));
//        System.out.println("tiger3 is equal to tiger4? answer: " + tiger3.equals(tiger4));
//        System.out.println("tiger2 is equal to tiger4? answer: " + tiger2.equals(tiger4));
//
        String string = new String("Siberian tiger");
        String string2 = new String("Bengal tiger");
        String string3 = new String("Bengal tiger");
        String string4 = string3;

//        System.out.println("string is equal to string2? Answer: " + string.equals(string2));
//        System.out.println("string2 is equal to string3? Answer: " + string2.equals(string3));
//        System.out.println("string3 is equal to string4? Answer: " + string3.equals(string4));
//        System.out.println("string2 is equal to string4? Answer: " + string2.equals(string4));

        // hasCode() example
        // /!\ In Java, implementarea default a metodei hashCode() converteste adresa interna de memorie unde
        // se afla obiectul (i.e. valoarea referintei) intr-o valoare intreaga.
        System.out.println("tiger hasCode: " + tiger.hashCode());
        System.out.println("tiger hasCode: " + tiger2.hashCode());
        System.out.println("tiger hasCode: " + tiger3.hashCode());
        System.out.println("tiger hasCode: " + tiger4.hashCode());

        System.out.println("string hasCode: " + string.hashCode());
        System.out.println("string2 hasCode: " + string2.hashCode());
        System.out.println("string3 hasCode: " + string3.hashCode());
        System.out.println("string4 hasCode: " + string4.hashCode());
    }
}
