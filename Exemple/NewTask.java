package Exemple;

public class NewTask {
    public static void main(String[] args) {

        Catt catt=new Catt("fs","fd",5);
    }
}
//class ParentAnimal{
//    static int ParentAnimal = 10; // 1
//    String name = "123"; // 3
//    public ParentAnimal()  // 4
//    {
//        System.out.println("Конструктор класса ParentAnimal");
//        System.out.println(ParentAnimal);
//        System.out.println(name);
//    }


//}
//class Catt extends ParentAnimal{
//    static int Catt = 15; // 2
//    String name2 = "123123"; // 5
//    public Catt() // 6
//    {
//        System.out.println("Конструктор класса Catt");
//        System.out.println(Catt);
//        System.out.println(name2);
//    }
//  }


class ParentAnimal{

}


class Catt extends ParentAnimal{


    static   String name;
    static   String poroda;
   static int age;

    static {// блок инициализации
        if (2<4){
            System.out.println("HELLO!");
        }
        name="Murka";
        poroda="obychny";
        age=3;
        System.out.println(" hello in {}");
        System.out.println(name);
    }

    public Catt(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }
}
