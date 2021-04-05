package C15_1_Constructori_Final.ClassEx4;

import javax.print.attribute.standard.JobName;

public class Main {
    public static void main(String[] args) {

        System.out.println(BankAccount.getBankSWIFT());

        BankAccount mikeAccount = new BankAccount("Mike" , "Dower" , "1239874138");
        BankAccount daisyAccount = new BankAccount("Daisy", "Williams", "878787");

        System.out.println(mikeAccount.getPersonCNP());
        System.out.println(daisyAccount.getPersonCNP());

        System.out.println(BankAccount.getBankSWIFT());
    }
}
