package C15_1_Constructori_Final.Ex1;


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

    private static String bankSWIFT;

    public BankAccount(String firstName) {
        this.firstName = firstName;
    }

    public BankAccount(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public BankAccount(String firstName, String lastName, int accountBalance){
        this(firstName, lastName);
        this.accountBalance = accountBalance;
    }

    public BankAccount() {
       this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME" , 0);
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

    public static void setBankSWIFT(String newBankSWIFT) {
        bankSWIFT = newBankSWIFT;
    }
}
