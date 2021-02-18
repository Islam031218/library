package newInterface;

public class Animal implements GetInfo {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void eating() {
        System.out.println(" I am "+id);
    }




}
