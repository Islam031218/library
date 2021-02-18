package ExemProjectBank;

import java.util.Date;

public class Transaction {
    private double amount;
    private Date timeStamp;
    private  User user;

    public Transaction(double amount, Date timeStamp, User user) {
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.user = user;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }
}
