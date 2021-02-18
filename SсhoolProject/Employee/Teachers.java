package SсhoolProject.Employee;

import javax.swing.text.Style;

import static SсhoolProject.Main.ListEmployee;

public class Teachers extends Employee{
    private final String LOGIN = "teachers";
    private final String PASSWORD = "1111";
    private String subject;
    public Teachers(String name, String lastName, int salary, String position, String experience, String subject,int id) {
        super(name, lastName, salary, position, experience,id);
        this.subject = subject;
    }




    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getLOGIN() {
        return LOGIN;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }

    @Override
    public void getMonyFromEmployee(int money) {
        monyEmployee+=money;
    }
}

