package classwork_17.bank_account;

import classwork_17.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount account001 = new BankAccount(101, "John Smith", "Bank#1", 1, 200);
        account001.display();

        //toString
        //System.out.println(account001.toString());

        BankAccount account002 = new BankAccount(102, "Pete Brosnan", "Bank#1", 1);
        account002.display();

        BankAccount account003 = new BankAccount(103, "Bank#1", 1, 300000);
        account003.display();// null - пустая ссылка и хранится в стеке никуда не ведет


        account001.deposit(500);
        account001.display();
        account002.deposit(300);
        account002.display();

        account001.withdraw(600);
        account001.display();

    }//end of main


}// end of Class
