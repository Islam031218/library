package SсhoolProject;

import java.io.BufferedReader;
import java.util.ArrayList;

public class School {
    private final String NAME = "Агахан";
    private final String YEAR = "2005";
    private int allMoney=1000000;
    private int quantityEmployee = 150;
    private int quantityStudens = 3000;

    public void getInfoSchool() {
        System.out.println("Имя школы: " + NAME + ". ");
        System.out.println("Год основания: " + YEAR + ".");
        System.out.println("Количество студентов: " + quantityStudens);
        System.out.println("Количество студентов: " + quantityEmployee);
        System.out.println("Бюджет школы: "+allMoney);
    }
    public  void getMonyFromStudrnts( ArrayList<Pupil>arrayList,int mony){
        allMoney+=mony;
    }

    public String getNAME() {
        return NAME;
    }

    public String getYEAR() {
        return YEAR;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(int quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }

    public int getQuantityStudens() {
        return quantityStudens;
    }

    public void setQuantityStudens(int quantityStudens) {
        this.quantityStudens = quantityStudens;
    }
}
