package SсhoolProject;

public class Pupil {
    private String name;
    private String lastName;
    private String numberClass;
    private int contract;
    private int id;
    private int contractDebt;

    public Pupil(String name, String lastName, String numberClass, int contract, int id) {
        this.name = name;
        this.lastName = lastName;
        this.numberClass = numberClass;
        this.contract = contract;
        this.id = id;
        this.contractDebt=contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumberClass() {
        return numberClass;
    }

    public int getId() {
        return id;
    }

    public int getContract() {
        return contract;
    }

    public int getContractDebt() {
        return contractDebt;
    }

    public void setContractDebt(int contractDebt) {
        this.contractDebt = contractDebt;
    }
}