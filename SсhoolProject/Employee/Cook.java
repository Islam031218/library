package SсhoolProject.Employee;

public class Cook extends Employee {

    private String coocing;

    public Cook(String name, String lastName, int salary, String position, String experience, int id) {
        super(name, lastName, salary, position, experience, id);
    }
    @Override
    public void getMonyFromEmployee(int mony) {
        monyEmployee+=mony;
    }


    public String getCoocing() {
        return coocing;
    }

    public void setCoocing(String coocing) {
        coocing = coocing;
    }


    public void getNameCook(){
        System.out.println(getName() + " " + getLastName() + " " + getSalary());
    }

}
