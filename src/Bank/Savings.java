package Bank;

import java.util.HashMap;

public class Savings implements Account{
    private int accountNumber;
    private int availableBalance;
    private final double INTEREST = 1.10;
    private int withdrawalLimit = 6;

    public Savings(int accountNumber, int availableBalance) {
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public int getAvailableBalance() {
        return availableBalance;
    }

    @Override
    public void generateInterest() {
        this.availableBalance *= INTEREST;
    }

    @Override
    public HashMap recentTransactions() {
        return null;
    }

    public void deposit(double money) {
        this.availableBalance += money;

    }

    @Override
    public void withdraw(double money) {
        if(withdrawalLimit > 0) {
            if (availableBalance > money) {
                this.availableBalance -= money;
                withdrawalLimit --;
            } else {
                System.out.println("Error, withdrawal is higher than available balance.");
            }
        }
        else{
            System.out.println("You have reached your withdrawal limit for this month.");
        }

    }

    @Override
    public String toString(){
        return "Savings account " + accountNumber + " has an available balance of " + availableBalance + ".";
    }
}
