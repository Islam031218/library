package TRANSLATE;

import Polimorfizm.Man;
import Polimorfizm.Person;
import domashki.Whale;

import java.io.*;
import java.util.Scanner;

public class translate {
//    public static void main(String[] args) throws IOException {
//        InputStream
//        OutpetStream
//
//        InputStream inputStream = new FileInputStream("D:/hello1.txt");
//        OutputStream outputStream = new FileOutputStream("D:/hello2.txt");
//
//        while (inputStream.available() > 0) {
//            int data = inputStream.read();
//            String st = Integer.toBinaryString(data);
//            System.out.print(data + " ");
//            System.out.println(st + " ");
//            outputStream.write(data);
//        }
//        inputStream.close();
//        outputStream.close();


    //instanceof
//        Object a = new Integer(3);
//        boolean answer = a instanceof Integer;
//        System.out.println(answer);
//
//        Object b = new String("5");
//        boolean c = b instanceof Integer;
//        System.out.println(c);
//
//        Object b1 = new String("5");
//        boolean c1 = b1 instanceof String;
//        System.out.println(c1);

//        Object w =new Women();
//        boolean answer = w instanceof Women;// правильно
//        System.out.println(answer);
//
//
//        boolean answer2 = w instanceof Man;// это ошибка
//        System.out.println(answer2);
//
//
//        boolean answer3 = w instanceof People; // правильно
//        System.out.println(answer3);
//
//        boolean answer4=w instanceof sleep;
//        System.out.println(answer4);   // не будеть правильно


//        Object obj =new Wolf();
//
//        Animal animal= (Animal)obj;
//
//        Dog dog=(Dog)obj;
//
//        Wolf wolf=(Wolf) animal;
//
//        Wolf wolf1 =(Wolf) dog;
//
//        if ( obj instanceof  Dog){
//            Dog dog1=(Dog) obj;
//            dog1.speakDog();
//        }
//
//        if ( obj instanceof  Wolf){
//            Wolf wolf2=(Wolf)obj;
//            wolf2.speakWolf();
//        }
//        if ( obj instanceof  Animal){
//            Animal animal1=(Animal)obj;
//            animal.speak();
//        }


//    }

//}

//interface  sleep{}
//
//class  People{}
//
//class  Man implements sleep{}
//
//class Women extends People{}// если это был бы этот класс таким : "impements sleep"  или "extends Man" тогда
//// answer4 был бы правильном


//class Animal{
//    public  void  speak(){
//        System.out.println("----");
//    }
//}
//
//class Dog extends Animal{
//    public  void  speakDog(){
//        System.out.println("gav-gav");
//    }
//}
//
//class Wolf extends  Dog{
//    public void speakWolf(){
//        System.out.println("auuuuuu");
//    }
//}


    //1-задания повторения
    //Исправь строчку 'Object animal = new Pet();' в методе main() так, чтобы программа
    //вывела "Bingo!".

//    public static void main(String[] args) {
//        Object animal = new Tiger();
//        boolean isCat = animal instanceof Cat;
//        boolean isTiger = animal instanceof Tiger;
//        boolean isPet = animal instanceof Pet;
//        printResults(isCat, isTiger, isPet);
//    }
//    private static void printResults(boolean cat, boolean tiger, boolean
//            pet) {
//        if (cat && tiger && pet) System.out.println("Bingo!");
//    }
//    static class Pet {
//    }
//    static class Cat extends Pet {
//    }
//    static class Tiger extends Cat {
//    }


    //2-задания
    //Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".

//    public static void main(String[] args) {
//        Cat cat = new TomCat();
//        boolean isCat = cat instanceof Cat;
//        boolean isMovable = cat instanceof CanMove;
//        boolean isTom = cat instanceof TomCat;
//        if (isCat && isMovable && isTom) System.out.println("Bingo!");
//    }
//    interface CanMove {
//    }
//    static class Cat implements CanMove {
//    }
//    static class TomCat extends Cat {
//    }


    //2-пакет задачи

    //1-задания

    //В этой задаче тебе нужно:
    //Правильно расставить наследование между Building (здание) и School (здание
    //школы).
    //Подумать, объект какого класса должны возвращать методы getSchool и
    //getBuilding.
    //Изменить null на объект класса Building или School.
    //Сигнатуры методов getSchool() и getBuilding() не меняй.

//    public static void main(String[] args) {
//        Building school = getSchool();
//        Building shop = getBuilding();
//        System.out.println(school);
//        System.out.println(shop);
//    }
//
//    public static Building getSchool() {
//
//        return new School();
//    }
//
//    public static Building getBuilding() {
//        return new Building();
//    }
//
//    static class School extends Building /*Добавьте сюда ваш код*/ {
//        @Override
//        public String toString() {
//            return "School";
//        }
//    }
//
//    static class Building /*Добавьте сюда ваш код*/ {
//        @Override
//
//        public String toString() {
//            return "Building";
//        }
//    }


    //2-задания

    //Давай напишем программу, которая будет давать имена всем котикам,
    //выпускаемым на нашей котофабрике.
    //Для этого нужно:
    //Считывать строки (параметры) с консоли, пока пользователь не введет пустую
    //строку (Enter).
    //Для каждого параметра (имени кота):
    //создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
    //вывести на экран cat.toString().

//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String name1;
//        while (true) {
//            name1 = bufferedReader.readLine();
//            if (name1.isEmpty()) {
//                break;
//            } else {
//
//                Cat cat5 = CatFactory.getCatByKey(name1);
//                System.out.println(cat5.toString());
//
//            }
//
//
//        }
//
//
//    }
//
//
//    static class CatFactory {
//        static Cat getCatByKey(String key) {
//            Cat cat = null;
//            if ("vaska".equals(key)) {
//                cat = new MaleCat("Василий");
//            } else if ("murka".equals(key)) {
//                cat = new FemaleCat("Мурочка");
//            } else if ("kiska".equals(key)) {
//                cat = new FemaleCat("Кисюлька");
//            } else {
//                cat = new Cat(key);
//            }
//            return cat;
//        }
//    }
//
//    static class Cat {
//        private String name;
//
//        protected Cat(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        @Override
//        public String toString() {
//            return "Я уличный кот " + getName();
//        }
//    }
//
//    static class MaleCat extends Cat {
//        MaleCat(String name) {
//            super(name);
//        }
//
//        public String toString() {
//            return "Я - солидный кошак по имени " +
//
//                    getName();
//        }
//    }
//
//    static class FemaleCat extends Cat {
//        FemaleCat(String name) {
//            super(name);
//        }
//
//        public String toString() {
//            return "Я - милая кошечка по имени " +
//
//                    getName();
//        }
//    }


    //3-задания

    //Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
    //Для этого нужно:
    //Реализовать интерфейс Selectable в классе Food.
    //Метод onSelect() должен выводить на экран фразу "The food was selected".
    //Подумай, какие методы можно вызвать для переменной food, а какие для —
    //selectable.
    //В методе foodMethods вызови методы onSelect, onEat, если это возможно.
    //В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
    //Не используй явное приведение типов.


//        public static void main(String[] args) {
//            Food food = new Food();
//            Selectable selectable = new Food();
//            Food newFood = (Food) selectable;
//            foodMethods(food);
//            selectableMethods(selectable);
//        }
//        public static void foodMethods(Food food) {
//            food.onSelect();
//            food.onEat();
//        }
//        public static void selectableMethods(Selectable selectable) {
//
//            selectable.onSelect();
//        }
//        interface Selectable {
//            void onSelect();
//        }
//        static class Food implements Selectable {
//
//            public void onEat() {
//                System.out.println("The food was eaten");
//            }
//
//
//            @Override
//            public void onSelect() {
//                System.out.println(" The food was selected");
//            }
//        }


    //4-задания

    //Давай напишем программу, которая создает мышонка.
    //Для этого инициализируй объект obj таким классом, чтобы метод main()
    //выполнился без ошибок.
    //Требования:
    //1. Класс GrayMouse должен наследоваться от класса Mouse.
    //2. Класс Jerry должен наследоваться от класса GrayMouse.
    //3. В переменной obj должен храниться объект, который будет одновременно
    //являться и Mouse, и GrayMouse, и Jerry.
    //4. Метод main должен вызывать метод printClasses.


//    public static void main(String[] args) {
//        Object obj = new Jerry();
//        Mouse mouse = (Mouse) obj;
//        GrayMouse grayMouse = (GrayMouse) mouse;
//        Jerry jerry = (Jerry) grayMouse;
//        printClasses(obj, mouse, grayMouse, jerry);
//
//    }
//
//    public static void printClasses(Object obj, Mouse mouse, GrayMouse
//            grayMouse, Jerry jerry) {
//        System.out.println(jerry.getClass().getSimpleName());
//        System.out.println(grayMouse.getClass().getSimpleName());
//        System.out.println(mouse.getClass().getSimpleName());
//        System.out.println(obj.getClass().getSimpleName());
//    }
//
//    static class Mouse {
//    }
//
//    static class GrayMouse extends Mouse {
//    }
//
//    static class Jerry extends GrayMouse {
//    }



    //ПРАКТИКА 5
    //Посмотри, что делает эта программа.
    //Затем измени haveFun так, чтобы он вызывал метод:
    //play(), если person имеет тип Player.
    //dance(), если person имеет тип Dancer.

    //Требования:
    //1. Класс Player должен реализовывать интерфейс Person.
    //2. Класс Dancer должен реализовывать интерфейс Person.
    //3. Метод haveFun() должен вызывать метод play(), если переданный ему объект
    //является игроком (Player).
    //4. Метод haveFun() должен вызывать метод dance(), если переданный ему
    //объект является танцором (Dancer).
    //5. Метод main() должен считывать данные с клавиатуры.
    //6. Метод main() должен прекращать считывать данные с клавиатуры, если
    //введенная строка равна "exit".

//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Person person = null;
//        String key;
//        while (!(key = reader.readLine()).equals("exit")) {
//            key=reader.readLine();
//            if (key.equals("exit")){
//                break;
//            }
//            if ("player".equals(key)) {
//                person = new Player();
//                haveFun(person);
//            } else if ("dancer".equals(key)) {
//                person = new Dancer();
//                haveFun(person);
//            }
//            haveFun(person);
//        }
//    }
//    public static void haveFun(Person person) {
//        if (person.equals("dancer")) {
//            Dancer dancer = new Dancer();
//            dancer.dance();
//        }else if (person.equals("playing")){
//            Player player=new Player();
//            player.play();
//        }
//    }
//    interface Person {
//    }
//    static class Player implements Person {
//        void play() {
//            System.out.println("playing");
//        }
//    }
//    static class Dancer implements Person {
//        void dance() {
//            System.out.println("dancing");
//        }
//    }

}



