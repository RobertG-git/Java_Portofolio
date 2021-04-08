package src.C27_Seturi_Proprietati_Utilizare.ClassEx1;

import java.util.HashSet;

public class SecurityCheck {

    /*
    Ne propunem sa definim un modul de securitate, care tine evidenta persoanelor (autorizate) aflate la orice moment in cladire.
    Aceste statistici pot fi realizate deoarece fiecare persoana autorizata are o legitimatie electronica de acces,
    care este validata (i.e. o singura data) la intrarea si respectiv iesirea din cladire. Sistemul va semnala orice abatere de la regulile stricte de securitate, precum:

    1. o persoana paraseste cladirea fara ca aceasta sa fi fost in cladire anterior (i.e. fara sa fi validat legitimatia la intrare)
    2. o persoana intra in cladire desi figureaza deja ca fiind in cladire (i.e. o legitimatie este folosita de 2 ori pentru accesul in cladire)
     */

    private final HashSet<String> personsIn = new HashSet<>(100, 0.5f);

    public boolean goesIn(String person) {
        if(personsIn.contains(person)) {
            System.out.println("Security alert! Person already in! [" + person + "]");
            return false;
        }
        personsIn.add(person);
        return true;
    }

    public boolean goesOut(String person) {
        if (!personsIn.contains(person)) {
            System.out.println("Security alert! Person was not in! [" + person + "]");
            return false;
        }
        personsIn.remove(person);
        return true;
     }
}
