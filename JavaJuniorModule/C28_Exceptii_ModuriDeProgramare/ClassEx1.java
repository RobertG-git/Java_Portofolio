package src.C28_Exceptii_ModuriDeProgramare;

import java.util.List;

public class ClassEx1 {

    // LBYL (eng: Look Before You Leap)
    public static String getElementLBYL(List<String> collection, int index) {
        if (index >= 0 && index < collection.size()) {
            return collection.get(index);
        }
        return null;
    }

    // EAFP example (eng: Easier to Ask for Forgiveness than Permission)
    public static String getElementEAFP(List<String> collection, int index) {
        try {
            return collection.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}
