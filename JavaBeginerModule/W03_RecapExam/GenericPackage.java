package W03_RecapExam;

public class GenericPackage {

    /*
    4.
    [2p] Implementeaza o clasa GenericPackage, folosita de un sistem de curierat, conform urmatoarelor detalii de implementare:
        [0.5p] Starea interna este reprezentata astfel:
                uniqueID: cod unic de identificare a pachetului, format numai din cifre, de tipul String
                weight: greutatea coletului, de tipul double
                packageName: numele pachetului, de tipul String
                courierName: numele firmei de curierat, tipul String
        [0.5p] Clasa GenericPackage trebuie sa respecte urmatoarele criterii:
                [0.1p] deoarece clasa va fi folosita de un singur curier, toate obiectele clasei GenericPackage vor avea acelasi courierName.
                [0.1p] campul uniqueID, unic pentru fiecare obiect GenericPackage, trebuie sa nu poata fi modificat (i.e. dupa initializarea acestuia)
                [0.1p] transforma campul courierName, acelasi pentru toate obiectele din clasa, intr-o proprietate a obiectelor, care poate fi atat citita cat si actualizata
                [0.1p] transforma campul packageName intr-o proprietate read-only (i.e. poate fi citita, dar nu poate fi actualizata).
                [0.1p] defineste 2 constructori diferiti ai clasei, la alegere.
                 Hint: tine cont de criteriile anterioare in definirea corecta a constructorilor.
        [1p] Defineste urmatoarele metode:
                [0.25p] addItem(double itemWeight): actualizeaza greutatea pachetului prin adaugarea greutatii noului obiect (i.e. itemWeight) la greutatea actuala a coletului.
                [0.5p] checkID(): metoda verifica daca numarul pachetului este valid. Codul unic de identificare este valid daca sunt indeplinite toate conditiile urmatoare:
                        codul este alcatuit doar din cifre (i.e. toate caracterele sunt cifre)
                        numarul de cifre impare este multiplu de 3
                        suma tuturor cifrelor formeaza un numar divizibil cu 4
                        diferenta dintre oricare 2 cifre consecutive din cod este mai mica decat 5
                        lungimea totala a codului este cuprinsa intre 10 si 12 caractere (inclusiv)
                [0.25p] computeDetails() metoda returneaza un obiect String, care contine detaliile obiectului, sub urmatorul format:
                        Pachetul <packageName> avand codul <uniqueID> si greutatea <weight> apartine curierului <courierName>.
                        Exemplu: Pachetul LaptopDustPRO avand codul 213142341425 si greutatea 4.2 apartine curierului DevCarry.
      */

    // 1.
    private final String uniqueId;
    private double weight;
    private String packageName;
    private static String courierName;

    //2.

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }
    public String getCourierName() {
        return this.courierName;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GenericPackage(String uniqueId, double weight, String packageName) {
        this.uniqueId = uniqueId;
        this.weight = weight;
        this.packageName = packageName;
    }

    public GenericPackage(String uniqueId, double weight) {
        this(uniqueId,weight, "Unknown");
    }

    //3.
        //a
    public void addItem(double itemWeight) {
        this.weight += itemWeight;
    }

        //b
    public boolean checkID() {

        return (isNumberOnlyDigit() && isNumberOddDigitsDiv3() && isSumNumberDiv4()
         && isDifConsecutivDigitsMax5() && isNumberLength10to12());

    }

                // |
    public String getUniqueId() {
        return uniqueId;
    }
    private boolean isNumberOnlyDigit() {
        boolean aux = false;

        for (int i = 0; i < this.getUniqueId().length(); i++) {
            if (Character.isDigit(getUniqueId().charAt(i))) {
                aux = true;
            }
        }
        return aux;
    }

                // ||
    private boolean isNumberOddDigitsDiv3() {
        if(isNumberOnlyDigit()) {
            int n = Integer.parseInt(getUniqueId());
            int counter = 0;

            while (n != 0) {
                int lastDigit = n % 10;
                if (lastDigit % 2 == 1) {
                    counter++;
                }
                n /= 10;
            }

            return counter % 3 == 0;
        } else
            return false;
    }

                // |||
    private boolean isSumNumberDiv4() {
        if (isNumberOnlyDigit()) {
            int n = Integer.parseInt(getUniqueId());
            int sum = 0;

            while (n != 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }

            return sum % 4 == 0;
        } else {
            return false;
        }
    }

                // |V
    private boolean isDifConsecutivDigitsMax5() {
        if (isNumberOnlyDigit()) {
            int n = Integer.parseInt(getUniqueId());
            boolean aux = false;
            while (n != 0) {
                int lastDigit = n % 10;
                n /= 10;
                int anteLastDigit = n % 10;
                if (n > 0) {
                    if (anteLastDigit - lastDigit < 5) {
                        aux = true;
                        break;
                    }
                }
            }
            return aux;
        } else {
            return false;
        }
    }

                // V
    private boolean isNumberLength10to12() {
        if(isNumberOnlyDigit()) {
            int n = Integer.parseInt(getUniqueId());
            int counter = 0;

            while (n != 0) {
                int lastDigit = n % 10;
                counter++;
                n /= 10;
            }

            return counter >= 10 && counter <= 12;
        } else {
            return false;
        }
    }

        //c
    public String computeDetails() {
        String str = "Pachetul " + this.packageName + " avand codul" + this.uniqueId + " si greutatea" +
                + this.weight + "apartine curierului" + this.courierName;

        return str;
    }

}
