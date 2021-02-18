package Exemple;

import java.io.*;
import java.util.Scanner;

public class AbstractMain {
//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eating();
//        System.out.println();
//        animal.sleep();
//        System.out.println();
//        Human human = new Human();
//        human.speaking();
//        System.out.println();
//        human.sleep();

//        Doctor doctor=new Doctor();
//
//
//        Cat lion=new Lion();
//        lion.name="льва";
//
//        Cat tiger=new Tiger();
//        tiger.name="тигра";
//
//        Cat jaguar=new Jaguar();
//        jaguar.name=" ягуара";
//
//        doctor.healCat(lion);
//        doctor.healCat(tiger);
//        doctor.healCat(jaguar);


//       практичетский задании
//        задания №1


        //Переопредели метод setName в классе Cat так, чтобы программа выдавала на
        //экран надпись «Я - кот».

//        Pet pet=new Cat();
//        System.out.println(pet.getName());
//
//
//    }             //main метод
//    public static class Pet{
//        public String getName(){
//            return "Я- пушистик";
//        }
//    }
//    public  static class Cat extends Pet{
//        public String getName(){
//            return "Я-кот";
//        }
//    }

//        задания №2

        //Переопредели метод setName в классе Cat так, чтобы программа выдавала на
        //экран надпись «Я - кот».

//        Pet pet=new Cat();
//        pet.setName("Я-пушистик");
//
//        System.out.println(pet.getName());
//
//
//    }              // 2-main метод
//    public  static class  Pet{
//        protected  String  name;
//
//        public Pet(){
//
//        }
//        public String getName(){
//            return  name;
//        }
//
//        public void  setName(String name) {
//            this.name = name;
//        }
//    }
//    public static  class Cat extends Pet{
//        public  String  getName(){
//            return  name="я-кот";
//        }
//     @Override
//        public void  setName(String name) {
//            this.name = name;
//        }
//    }

        //Добавь один метод в класс Cat так, чтобы
        // программа ничего не выводила на экран.

//        Pet pet=new Cat();
//        pet.setName("Я-пушистик");
//
//        System.out.println(pet.getName());
//
//
//    }              // 3-main метод
//    public  static class  Pet{
//        protected  String  name;
//
//        public Pet(){
//
//        }
//        public String getName(){
//            return  name;
//        }
//
//        public void  setName(String name) {
//            this.name = name;
//        }
//    }
//    public static  class Cat extends Pet {
//       public String getName(){
//           return null;
//       }
//
//    }


        //задания №4
        //Напиши метод, который определяет, какой объект передали в него.
        //Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев»,
        //«Бык», «Животное».

//        Cat cat=new Cat();
//
//        System.out.println(getObjectType(new Cat()));
//        System.out.println(getObjectType(new Tiger()));
//        System.out.println(getObjectType(new Lion()));
//        System.out.println(getObjectType(new Bull()));
//        System.out.println(getObjectType(new Pig()));
//
//    }              //4-метод main
//
//    public static String getObjectType(Object o) {
//        if (o.getClass()==Cat.class){
//            return "кот";
//        }else  if (o.getClass()==Tiger.class){
//            return "тигр";
//        }else if (o.getClass()==Lion.class){
//            return "лев";
//        }else if (o.getClass()==Bull.class){
//            return "бык";
//        }else {
//            return "жывотные";
//        }
//    }
//
//
//    public static class Cat {
//    }
//
//    public static class Tiger  {
//    }
//
//    public static class Lion  {
//    }
//
//    public static class Bull {
//    }
//    public  static class Pig{
//
//    }

        //задания №5
        //Напиши метод, который определяет, какой объект в него передали.
        //Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев»,
        //«Бык», «Корова», «Животное».
//        System.out.println(getObjectType(new Cat()));
//        System.out.println(getObjectType(new Tiger()));
//        System.out.println(getObjectType(new  Lion()));
//        System.out.println(getObjectType(new Bull()));
//        System.out.println(getObjectType(new Cow()));
//        System.out.println(getObjectType(new Animal()));
//
//    }                        //5-метод main
//    public  static String getObjectType(Object o){
//        if (o.getClass()==Cat.class){
//            return "Кот";
//        }else if (o.getClass()==Tiger.class){
//            return "тигр";
//
//        }else if (o.getClass()==Lion.class){
//
//            return "лев";
//        }else if (o.getClass()==Bull.class){
//            return "бык";
//
//        }else if (o.getClass()==Cow.class){
//            return "корова";
//
//        }else{
//            return "жывотные";
//        }
//
//    }
//    public  static  class Cat extends Animal{
//
//    }
//    public static  class Tiger extends Cat{
//
//    }
//    public static  class Lion extends Cat{
//
//    }
//    public  static  class Bull extends Animal{
//
//    }
//    public   static  class Cow extends Animal{
//
//    }
//    public  static  class Animal{
//
//    }

        //6-задания
        //Вот что тебе нужно сделать в этой задаче:
        //Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом
        //void fly().
        //Внутри класса Solution создай интерфейс public interface CanClimb (лазить по
        //деревьям) с методом void climb().
        //Внутри класса Solution создай интерфейс public interface CanRun (бегать) с
        //методом void run().
        //Подумай логически, какие именно интерфейсы нужно добавить для каждого
        //класса.
        //Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).

//        Cat cat=new Cat();
//        cat.Climb();
//
//        Cat tigr=new Tiger();
//        tigr.Climb();
//
//        Dog dog=new Dog();
//        dog.run();
//        Duck duck=new Duck();
//        duck.Fly();
//
//    }
//
//    public  interface CanFly{
//        void Fly();
//    } public  interface CanClimb{
//        void Climb();
//    } public  interface CanRun{
//        void run();
//    }
//    public  static class Cat implements CanClimb{
//
//        @Override
//        public void Climb() {
//            System.out.println(" кошка лезит по деревям");
//        }
//    }
//    public static class Dog implements CanRun{
//
//        @Override
//        public void run() {
//            System.out.println(" собака бежит");
//        }
//    }
//    public static  class Tiger extends  Cat{
//        public  void Climb(){
//            System.out.println(" тигр лезит по деревям");
//        }
//
//    }
//    public  static  class Duck implements CanFly{
//
//        @Override
//        public void Fly() {
//            System.out.println(" утка литит");
//        }
//    }


        //7- задания
        //Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
        //Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)

//        Duck duck=new Duck();
//        duck.fly();
//        duck.swim();
//
//        Penguin penguin=new Penguin();
//        penguin.run();
//        penguin.swim();
//
//        Toad toad=new Toad();
//        toad.swim();
//
//    }
//
//    public interface CanFly {
//        public void fly();
//    }
//
//    public interface CanRun {
//        public void run();
//    }
//
//    public interface CanSwim {
//        public void swim();
//    }
//
//    public static class  Duck implements CanFly ,CanSwim{
//        @Override
//        public  void fly(){
//            System.out.println(" утка летит");
//        }
//
//        @Override
//        public void swim() {
//            System.out.println(" утка плавает");
//        }
//    }
//
//    public static class Penguin implements  CanRun,CanSwim{
//
//        @Override
//        public void run() {
//            System.out.println(" пингвин бежит");
//        }
//
//        @Override
//        public void swim() {
//            System.out.println("пенгивин плавает");
//        }
//    }
//    public static   class Toad implements  CanSwim{
//
//        @Override
//        public void swim() {
//            System.out.println("  жаба плавает");
//        }
//    }

        //8- задание

        //Добавь как можно больше интерфейсов к классу Human, но так, чтобы он не стал
        //абстрактным классом.
        //Добавлять методы в класс Human запрещается.
//      Human human=new Human();
//      human.WorkHard();
//      human.WorkLazy();
//      human.WorkVeryHard();
//
//
//    }
//    public  static  interface Worker{
//        public  void WorkLazy();
//    }
//    public  static  interface Businessman{
//        public  void WorkHard();
//    }
//    public  static  interface Secretary{
//        public  void WorkLazy();
//    }
//    public  static  interface Miner{
//        public  void WorkVeryHard();
//    }
//    public static class Persen implements Worker,Businessman,Secretary,Miner{
//
//        @Override
//        public void WorkLazy() {
//            System.out.println("WorkLazy");
//        }
//
//        @Override
//        public void WorkHard() {
//            System.out.println("WorkHard");
//        }
//
//        @Override
//        public void WorkVeryHard() {
//            System.out.println("WorkVeryHard");
//        }
//    }
//    public  static  class  Human extends Persen {
//
//
//    }

        //9- задания


//    }
//    public  static  interface  Businessman{
//        public  void  workHard();
//    }
//     public  static  class  CTORODITEL implements  Businessman{
//
//         @Override
//         public void workHard() {
//
//         }
//     }
//    public  static  class  CTO extends  CTORODITEL implements  Businessman{
//
//
//    }
//        10- задания

//        Integer i=5;
//        int x=TransformValue(i);
//        System.out.println(x);
//
//    }
//    public  static  int TransformValue(int i){
//
//        return fff(i);
//    }
//    public  static Integer fff(Integer i){
//        i = 5;
//
//        return i + i;
//    }

        //11-задания


//    }
//
//    public static interface CanFly {
//        public  void fly();
//    }
//
//    public static abstract class Horse {
//
//        public void run() {
//
//        }
//    }
//
//    public  static abstract class Pegasus extends  Horse implements  CanFly{
//
//        @Override
//        public void fly() {
//
//        }
//    }
//    public  static abstract   class SwimmiPegasus extends  Pegasus{
//        public  void  swim(){
//
//        }
//    }


        //12-задания

//        Pegasus pegasus =new Pegasus();
//        pegasus.fly();
//        pegasus.run();
//
//    }// 12- main  метод
//    public  static  interface  CanFly{
//        public  void  fly();
//    }
//    public  static  class  Horse{
//        public  void  run(){
//
//        }
//    }
//    public  static  class   Pegasus extends  Horse implements  CanFly{
//
//        @Override
//        public void fly() {
//            System.out.println("пегас может летать");
//        }
//        public void run(){
//            System.out.println("лошадь может бегать");
//        }
//    }


        // практическии задачи в классе
        //1- задания
        //Удали все некорректные строки в интерфейсе Button.

//        System.out.println(SimpleObject.NAME);
//        System.out.println(Button.NAME);
//
//    }
//    interface  SimpleObject{
//        String NAME ="SimpleObject";
//        public void  onPress();
//
//    }
//    interface  Button extends  SimpleObject{
//        final String  NAME="Submit";
//
//    }


        //2-задания

        //Реализуй в классе Today интерфейс Weather.
        //Подумай, как связан параметр type с методом getWeatherType().
        //Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в
        //отдельных файлах.






//    }
//public static void main(String[] args) {
//    System.out.println(new Today(WeatherType.CLOUDY));
//    System.out.println(new Today(WeatherType.FREEZING));
//    System.out.println(new Today(WeatherType.FOGGY));
//
//
//}
//public   interface  Weather{
//    public String getWeatherType();
//}
//public  interface WeatherType{
//    final String CLOUDY = "облачно";
//    final  String FOGGY="туманный";
//    final  String  FREEZING="холодна";
//}
//
//    static  class  Today implements Weather,WeatherType{
//        private  String type;
//
//
//        Today(String type){
//            this.type=type;
//        }
//
//        @Override
//        public  String toString(){
//            return String.format("Today it will be %s", this.getWeatherType());
//        }
//
//        @Override
//        public String getWeatherType() {
//            return this.type;
//        }
//
//
//
//    }
//

    //3- задании

    //В этой задаче тебе нужно:
    //Считать с консоли имя файла.
    //Вывести в консоли (на экран) содержимое файла.
    //Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

//    public static void main(String[] args) throws IOException {
//
//        Scanner scanner=new Scanner(System.in);
//        String  name =scanner.nextLine();
//
//        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:/hello/"+name+".txt"));
////        System.out.println(bufferedReader.readLine());
//        while (true){
//            String  answer=bufferedReader.readLine();
//            if (answer==null){
//                break;
//            }
//            System.out.println(answer);
//        }
//
//
//    }
    //практика 4
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/hell0o/Hello.txt"));
//        while (true){
//            String temp = scanner.nextLine();
//            writer.write(temp);
//            writer.newLine();
//            if (temp.equals("exit")){
//                break;
//            }
//        }
//        writer.close();
//    }
    //практика 5
//    public static void main(String[] args) {
//        System.out.println(Matrix.NEO);
//    }
//    public static class Matrix{
//        public static String NEO = new User().initializiIdAndName(1,"Neo");
//    }
//    public interface DBObject{
//      public String initializiIdAndName(long id , String name);
//    }
//    static class User implements DBObject{
//        long id;
//        String name;
//
//        @Override
//        public String toString(){
//            return String.format("The user's name is %s, id %d", name,id);
//        }
//
//        @Override
//        public String initializiIdAndName(long id, String name) {
//            return String.format("The user's name is %s, id %d", name,id);
//        }
//    }
    //практика 6
//    public static void main(String[] args) {
//        System.out.println(Dream.HOBBY.toString());
//        System.out.println(new Hobby().INDEX);
//    }
//    interface Deiser{
//
//    }
//    interface Dream extends Deiser {
//         Hobby HOBBY = new Hobby();
//    }
//    static public class Hobby implements Deiser,Dream{
//        static int INDEX = 1;
//        @Override
//        public String toString() {
//            INDEX++;
//            return "" + INDEX;
//        }
//    }
    //практика 7
//    public static void main(String[] args) {
//        Screen screen = new Screen();
//        screen.OnSelect();
//        screen.refresh();
//    }
//    interface Selectable{
//        void OnSelect();
//    }
//    interface Upbatable extends Selectable{
//        void refresh();
//    }
//    static class Screen implements Upbatable{
//
//        @Override
//        public void OnSelect() {
//            System.out.println("привет");
//        }
//
//        @Override
//        public void refresh() {
//            System.out.println("как дела?");
//        }
//    }
    //практика 8
//    public static void main(String[] args) {
//        Fox fox = new Fox();
//        System.out.println(fox.getName());
//    }
//    interface Animal{
//        static void getColor(){
//
//        }
//        static Integer getAge() {
//            return null;
//        }
//    }
//    static class Fox implements Animal{
//        public String getName(){
//            return "Fox";
//        }
//    }
    //практика 9
//    public static void main(String[] args) {
//        Fox BigFox =  new BigFox();
//        System.out.println(BigFox.getName());
//        System.out.println(BigFox.getColor());
//
//    }
//
//    interface Animal{
//        String getColor();
//    }
//
//    abstract static class Fox implements Animal{
//        public String getName(){
//            return "Fox";
//        }
//    }
//     static class BigFox extends Fox{
//
//         public String getColor() {
//             return "black";
//         }
//         @Override
//         public String getName(){
//             return "Fox";
//         }
//     }




}
