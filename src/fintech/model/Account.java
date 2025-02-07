package fintech.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 12S23018_Early
 * @author 12S23032_Seprian
 */
public class Account {
    private String accountId;
    private String accountHolderName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountId() {return accountId;}

    public void setAccountId(String accountId) {this.accountId = accountId;}

    public String getAccountHolderName() {return accountHolderName;}

    public void setAccountHolderName(String accountHolderName) {this.accountHolderName = accountHolderName;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public List<Transaction> getTransactions() {return transactions;}

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        this.balance += transaction.getAmount(); 
    }

    @Override
    public String toString() {
        return "Account{" + "accountId='" + accountId + '\'' + ", accountHolderName='" + accountHolderName + '\'' + ", balance=" + balance + ", transactions=" + transactions + '}';
    }
}