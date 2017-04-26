package com.andrzej;

/**
 * Created by andrzej on 19.04.17.
 *///ćwiczenie z Udemy - sekcja 7, lekcja 39

public class Account {
    private int accountNumber;
    private int accountBalance;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountHolderPhone;

    //poniżej metoda konstruktora - czyli efektywniejsze nadawanie zmiennym wartości i parametrow
    public Account(int accountNumber, int accountBalance, String accountHolderName, String accountHolderEmail, String accountHolderPhone) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountHolderEmail = accountHolderEmail;
        this.accountHolderPhone = accountHolderPhone;
    }

    //metoda dodająca środki do accountBalance z pomocą zmienne depositAmount

    public void Deposit(int depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Current ammount balance is "+ this.accountBalance);
        //operator += oznacza wykonanie działania accountbalance = (accountBalance + depositamount)
    }

    //poniżej metoda odejmująca środki z konta i sprawdzająca (w pętli if, czy zabraknie środków na koncie)

    public void Withdrawal(int withdrawalAmount) {
        if((this.accountBalance - withdrawalAmount) <= 0) {
            System.out.println("Only " + this.accountBalance + "available. Withdrawal not possible");
        }else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Pozostało na koncie " + this.accountBalance);
        }
    }


    //poniżej settery wygenerowane automatycznie przez Code->Generate-> Setter

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public void setAccountHolderPhone(String accountHolderPhone) {
        this.accountHolderPhone = accountHolderPhone;
    }

    //poniżej gettery wygenerowane automatycznie przez Code -> Generate

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public String getAccountHolderPhone() {
        return accountHolderPhone;
    }
}
