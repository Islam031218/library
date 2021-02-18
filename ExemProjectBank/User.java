package ExemProjectBank;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private  int id;
    private String  firstName;
    private  String lastName;
    private List<Account> accountList;
    private String login;
    private  String password;
    private  int rubl;
    private  int dollar;


    public User(int id, String firstName, String last, String login,
                String password) {
        this.id = id;
        this.firstName = firstName;
        lastName = last;

        this.login = login;
        this.password = password;

    }

    public int getRubl() {
        return rubl;
    }

    public void setRubl(int rubl) {
        this.rubl = rubl;
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountList(String name, int summ, int id, User user) {

    }
}
