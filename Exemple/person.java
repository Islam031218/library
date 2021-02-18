package Exemple;

public class person {
    public void sleep() {
        System.out.println(" sleeping  ");
    }

}

class Animal extends person{
    String animal="animal";
    public  void eating(){

        System.out.println(animal+"eating");
    }
    @Override
    public  void sleep(){
        System.out.println(animal+"sleeping");

    }

}

class  Human extends person{
    String human="human";
    public  void speaking(){

        System.out.println(human+"speaking");
    }
    @Override
    public  void sleep(){
        System.out.println(human+" sleeping");
    }
}
