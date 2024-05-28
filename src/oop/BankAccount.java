package oop;

public class BankAccount {
    // fields/properties/attributes
    String accountHolder;
    String iban;
    double balance = 0;
    boolean active = false;
    private int pin = 7777;
    int attempts = 0;

    // constructor
    public BankAccount(String accountHolder, String iban) {
        this.accountHolder = accountHolder;
        this.iban = iban;
    }

    // methods
    public void balanceInquiry() {
        System.out.println("Holder: " + this.accountHolder);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Active: " + this.active);
        System.out.println("Balance: " + this.balance);
        System.out.println("Number of wrong attempts: " + this.attempts);
        System.out.println("-----------------------------------");
    }

    public void activateAccount(int userPin) {
        this.greeting();
        // changes active in true only if the pin is correct
        if (userPin == this.pin) {
            this.active = true;
            System.out.println("Card successfully activated");
        } else {
            System.out.println("Wrong PIN!");
            this.attempts++;
        }
    }

    public void feedAccount(double amountDeposited) {
        this.balance += amountDeposited;
        this.greeting();
        System.out.println("Successful deposit. You have in your account the amount of " + this.balance);
    }

    public void withdrawalAccount(double amountWithdrawn) {
        this.greeting();
        if (amountWithdrawn <= this.balance) {
            this.balance -= amountWithdrawn;
            System.out.println("Successful withdrawal. You have in your account the amount of " + this.balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void greeting() {
        System.out.println("Hello " + this.accountHolder);
    }
}
