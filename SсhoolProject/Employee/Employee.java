package SсhoolProject.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Employee {
    private String name;
    private String lastName;
    private int salary;
    private String experience;
    private String position;
    private int id;
    protected   int monyEmployee;

    public Employee(String name, String lastName, int salary, String position, String experience, int id) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
        this.experience = experience;
        this.id = id;
    }
    public abstract void getMonyFromEmployee(int mony);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getMonyEmployee() {
        return monyEmployee;
    }

    public void setMonyEmployee(int monyEmployee) {
        this.monyEmployee = monyEmployee;
    }
}

