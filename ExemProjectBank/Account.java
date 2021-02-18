package ExemProjectBank;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
    private int id;
    private double balance;
    private String name;
    private User accountHolder;
    private List<Transaction>transactions;

    public Account(int id, double balance, String name, User accountHolder) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
