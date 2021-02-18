package SсhoolProject.Employee;

public class Accountant extends Employee {
    private final String LOGIN = "1";
    private final String PASSWORD = "1";

    public Accountant(String name, String lastName, int salary, String position, String experience, int id) {
        super(name, lastName, salary, position, experience, id);
    }

    @Override
    public void getMonyFromEmployee(int mony) {
        monyEmployee+=mony;
    }


    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getLOGIN() {
        return LOGIN;
    }
}
