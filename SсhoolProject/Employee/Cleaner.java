package SсhoolProject.Employee;

public class Cleaner extends  Employee {


    @Override
    public void getMonyFromEmployee(int mony) {
        monyEmployee+=mony;
    }


    public Cleaner(String name, String lastName, int salary, String position, String experience, int id) {
        super(name, lastName, salary, position, experience, id);
    }
}
