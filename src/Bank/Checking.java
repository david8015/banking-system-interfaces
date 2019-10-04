package Bank;

import java.util.HashMap;

public class Checking implements Account {
    private int accountNumber;
    private int availableBalance;
    private final double interest = 1.05;

    public Checking(int accountNumber, int availableBalance) {
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
         this.availableBalance *= interest;
    }

    @Override
    public HashMap<String, Integer> recentTransactions() {
        return null;
    }

    public void deposit(double money) {
        this.availableBalance += money;

    }

    @Override
    public void withdraw(double money) {
        if(availableBalance > money){
            this.availableBalance -= money;
        }

        else{
            System.out.println("Error, withdrawal is higher than available balance.");
        }
    }

    @Override
    public String toString(){
        return "Checking account " + accountNumber + " has an available balance of " + availableBalance + ".";
    }
}
