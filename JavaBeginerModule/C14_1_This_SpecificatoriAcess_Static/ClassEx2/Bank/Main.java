package C14_1_This_SpecificatoriAcess_Static.ClassEx2.Bank;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        BankAccount userRobert = new BankAccount();
        userRobert.initializeBankAccount("Robert", "Girbea", 200);

        userRobert.creditAccount(100);

        System.out.println(userRobert.getAccountBalance());

        userRobert.blockAccountBalance();

        System.out.println(userRobert.getAccountBalance());

        BankAccount.setBankSWIFT("INRG");
        System.out.println(BankAccount.getBankSWIFT());

        System.out.println(userRobert.getBankSWIFT());
    }
}
