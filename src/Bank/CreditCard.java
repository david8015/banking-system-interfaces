package Bank;

import java.util.HashMap;

public class CreditCard extends LineOfCredit implements Account{
    private int accountNumber;
    private int balance;
    private final double interestRate = 1.20;
    private final int BALANCELIMIT = 10000;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void payCredit(double money){
          balance -= money;
    }

    public void withdraw(double money) {
        if((balance + money) < BALANCELIMIT) {
            balance += money;
        }

        else{
            System.out.println("You have reached your balance limit.");
        }
    }

    @Override
    public void generateInterest() {
        balance *= interestRate;

    }

    @Override
    public HashMap<String, Integer> recentTransactions() {
        return null;
    }
}
