package ExemProjectBank;

import java.util.List;

public class Bank {
    private String bankName;
    private List<User> customers;
    private List<Account> accounts;

    public Bank(String bankName, List<User> customers, List<Account> accounts) {
        this.bankName = bankName;
        this.customers = customers;
        this.accounts = accounts;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public List<User> getCustomers() {
        return customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
