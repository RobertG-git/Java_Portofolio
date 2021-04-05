package Exam;

public class Solution {

    // |.
    private final String cnp;
    private String nume;
    private String email;
    private String prenume;
    private int salariu;
    private static final String angajator = "RTR";

    // ||.
        //1. done upside
        //2. done upside

        //3.
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }

        //4.
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

        //5.
    public Solution (String cnp,String nume, String prenume, String email ) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
    }
    public Solution(String cnp,String nume, String prenume) {
        this(cnp, nume, prenume, "Unknown");
    }

    // |||.
        //a.
    public void maresteSalriu(int bonus) {
        this.salariu += bonus;
    }

        //b.

    public boolean valideazaCNP(){
        return (esteNumarulDeCifreValid() && suntToateNumereleCifre() && estePrimaCifraDiferitaDe0() &&
                esteLunaDinCNPValida() && esteZiuaDinCNPValida());
    }

    private boolean esteNumarulDeCifreValid() {
        return this.cnp.length() == 13;
    }
    private boolean suntToateNumereleCifre() {
        boolean aux = true;
        for (int i = 0; i < this.cnp.length(); i++) {
            if (!Character.isDigit(this.cnp.charAt(i))) {
                aux = false;
                break;
            }
        }
        return aux;
    }
    private boolean estePrimaCifraDiferitaDe0() {
        return this.cnp.charAt(0) == '0';
    }
    private boolean esteLunaDinCNPValida() {
        int firstdigit = Integer.parseInt(String.valueOf(this.cnp.charAt(3)));
        int secondDigit = Integer.parseInt(String.valueOf(this.cnp.charAt(4)));
        int luna = firstdigit * 10 + secondDigit;
        return (luna > 0 && luna < 13);
    }
    private boolean esteZiuaDinCNPValida() {
        int ziua = Integer.parseInt(this.cnp.substring(5, 6));
        return (ziua > 1 && ziua < 32);
    }

        //c.
    public String toString() {
        String info = "Angajatul " + this.nume + " " + this.prenume + " CNP " + this.cnp + " are salariul de "
                + this.salariu + " RON/luna si lucreaza la " + this.angajator + ".";

        return info;
    }

        //d.
    public int calculeazaBonusAnual() {
        int counterNumar5 = 0;
        int counterNumar9 = 0;
        int salariuCurrent = this.salariu;
        int bonus = 1;
        while (salariuCurrent != 0) {
            int lastDigit = salariuCurrent % 10;
            if (lastDigit == 5) {
                counterNumar5++;
            }
            if (lastDigit == 9) {
                counterNumar9++;
            }
            salariuCurrent /= 10;
        }

        if (counterNumar5 > counterNumar9) {
            for (int i = 0; i < counterNumar5; i++) {
                bonus *= 10;
            }
        } else {
            for (int i = 0; i < counterNumar9 * 2; i++) {
                bonus *= 10;
            }
        }
        return bonus;
    }
}
