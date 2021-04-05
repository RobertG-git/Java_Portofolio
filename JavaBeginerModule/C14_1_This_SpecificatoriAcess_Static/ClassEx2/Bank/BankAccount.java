package C14_1_This_SpecificatoriAcess_Static.ClassEx2.Bank;

import com.sun.source.tree.ReturnTree;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountBalance;
    private static String bankSWIFT = "ING";

    public void initializeBankAccount(String firstName , String lastName, int accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFullName(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean creditAccount(int amount) {
        if (accountBalance > amount) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public void debitAccount(int amount) {
        accountBalance += amount;
    }

    protected void blockAccountBalance (){
        accountBalance = -1;
    }

    public static String getBankSWIFT() {
        return bankSWIFT;
    }

    public static void setBankSWIFT(String bankSWIFT) {
        BankAccount.bankSWIFT = bankSWIFT;
    }


}
