package newInterface;

public class Person implements GetInfo {
    public static String name;

    public Person(String name) {
        this.name = name;
    }
    public static void  sayHello(){
        System.out.println(" Hello, my name is "+name);
    }



}
