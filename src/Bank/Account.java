package Bank;

import java.util.HashMap;

public interface Account {
    void withdraw(double money);
    void generateInterest();
    HashMap<String, Integer> recentTransactions();
}
