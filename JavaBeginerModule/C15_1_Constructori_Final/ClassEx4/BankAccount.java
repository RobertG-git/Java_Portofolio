package C15_1_Constructori_Final.ClassEx4;


public class BankAccount {

    /*
    1. Sa ne amintim clasa definita anterior, BankAccount si sa analizam initializarea starii obiectelor de acest tip.
    In continuare, defineste cel putin 3 constructori, pentru diverse moduri de creare a obiectelor.
    Foloseste urmatoarele valori default in constructori, astfel incat sa initializezi fiecare camp in cazul in care nu se da o valoare de initializare ca parametru:
        Camp	Valoare default
        firstName	UNKNOWN_FIRST_NAME
        lastName	UNKNOWN_LAST_NAME
        accountBalance	0
     Evita duplicarea implementarii constructorilor utilizand keyword-ul this.
     */

    private String firstName;
    private String lastName;
    private int accountBalance;

    private final static String bankSWIFT ="IGBRU";
    private final String personCNP;

    public BankAccount(String firstName, String personCNP) {
        this.firstName = firstName;
        this.personCNP = personCNP;
    }

    public BankAccount(String firstName, String lastName , String personCNP) {
        this(firstName, personCNP);
        this.lastName = lastName;
    }

    public BankAccount(String firstName, String lastName, int accountBalance, String personCNP){
        this(firstName, lastName, personCNP);
        this.accountBalance = accountBalance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String personFirstName, String personLastName) {
        firstName = personFirstName;
        lastName = personLastName;
    }

    public boolean debitAccount(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public void creditAccount(int amount) {
        accountBalance += amount;
    }

    protected void adminBlockAccount() {
        accountBalance = -1;
    }

    public static String getBankSWIFT() {
        return bankSWIFT;
    }

    public String getPersonCNP() {
        return personCNP;
    }


}
