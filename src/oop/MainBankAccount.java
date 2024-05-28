package oop;

public class MainBankAccount {
    public static void main(String[] args) {
        // we initialize objects of type BankAccount
        // instances of BankAccount class
        BankAccount account1 = new BankAccount("Bogdan Sandu", "RO20RNCB01231234");
        BankAccount account2 = new BankAccount("Ion Ionel", "RO80RNCB45671234");

        // we call the balanceInquiry method
        account1.balanceInquiry();
        account2.balanceInquiry();

        // we activate the accounts
        account1.activateAccount(7777);
        account2.activateAccount(1234);
        account2.activateAccount(5555);
        account2.activateAccount(7777);

        // we top up the accounts
        account1.feedAccount(199.5);
        account2.feedAccount(750);
        account1.feedAccount(315);

        // we withdraw money from the account
        account1.withdrawalAccount(780);
        account2.withdrawalAccount(415);
        account2.withdrawalAccount(210.30);

        // we check the accounts activation
        account1.balanceInquiry();
        account2.balanceInquiry();
    }
}
