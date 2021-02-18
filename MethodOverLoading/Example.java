package MethodOverLoading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
//    public static void main(String[] args) {

//        Cat cat= new Cat();
//        System.out.println(cat.getName());
//
//        Tiger tiger =new Tiger();
//        System.out.println(tiger.getName());
//
//        Cat cat= new Cat();
//
//        Cat cat1=new Cat();
//        cat1.setMyPerent(cat);
//
//        Cat cat2=cat1.getMyPerent();
//
//        Tiger tiger=new Tiger();
//
//        Tiger tiger1=new Tiger();
//        tiger1.setMyPerent(tiger);
//
//        Tiger tiger2=(Tiger) tiger1.getMyPerent();


//        print(1);
//        print ((byte) 2);
//        print("df");
//        print((Integer) null);

//    }
//    public  static  void print (int n){
//        System.out.println(n);
//    }
//    public  static  void print (Integer n){
//        System.out.println(n);
//    }
//    public  static  void print (String  n){
//        System.out.println(n);
//    }
//    public  static  void print (byte n){
//        System.out.println(n);
//    }
//}

//class Cat {
//
//    public  Cat perent;
//
//    public  Cat getMyPerent(){
//        return  this.perent;
//    }
//    public  void  setMyPerent(Cat cat){
//        this.perent=cat;
//    }
//
//
////     protected String getName() {
////         return "васька";
////     }
//}
//
////interface HasName {
////    String getName();
////
////    int getWeitht();
////}
////interface  HasWeight{
////    int getValue();
////}
////interface  HasSize{
////    int getValue();
////}
//
//class Tiger extends Cat  {// implements HasName,HasWeight,HasSize {
//
//    public  Cat getMyPerent(){
//        return (Tiger)getMyPerent();
//    }
//
//
//
////    @Override
////    public String getName() {
////        return "лео";
////    }
////
////    @Override
////    public int getWeitht() {
////        return 0;
////    }
////
////    @Override
////    public int getValue() {
////        return 0;
////    }
//}

// практический задании

//4-задания
//public static void main(String[] args) {
//    List<Book> books = new LinkedList<Book>();
//    books.add(new MarkTwainBook("Tom Sawyer"));
//    books.add(new AgathaChristieBook("Hercule Poirot"));
//    System.out.println(books);
//}
//public static class MarkTwainBook extends Book{
//    String title;
//    public MarkTwainBook(String title) {
//        super("Mark Twain");
//        this.title = title;
//    }
//    @Override
//    public MarkTwainBook getBook() {
//        return this;
//    }
//    @Override
//    public String getTitle() {
//        return this.title;
//    }
//}
//public static class AgathaChristieBook extends Book{
//    String title;
//    public AgathaChristieBook(String title) {
//        super("Agatha Christie");
//        this.title = title;
//    }
//    @Override
//    public AgathaChristieBook getBook() {
//        return this;
//    }
//    @Override
//    public String getTitle() {
//        return this.title;
//    }
//}
//abstract static class Book {
//    private String author;
//    public Book(String author) {
//        this.author = author;
//    }
//    public abstract Book getBook();
//    public abstract String getTitle();
//    private String getOutputByBookType() {
//        String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
//        String markTwainOutput = getBook().getTitle() + " was written by " + author;
//        String output = "Output";
//        if (author.equals("Agatha Christie")) {
//            output = agathaChristieOutput;
//        }else{
//            output = markTwainOutput;
//        }
////Add your code here
//        return output;
//    }
//    public String toString() {
//        return getOutputByBookType();
//    }
//}


    //1- praktika
//    public static void main(String[] args) {
//    }
//    public interface Movable {
//        boolean isMovable();
//    }
//    public interface Sellable {
//        Object getAllowedAction(String name);
//    }
//    public interface Discountable {
//        Object getAllowedAction();
//    }
//    public static class Clothes implements Movable,Sellable,Discountable {
//        @Override
//        public boolean isMovable() {
//            return false;
//        }
//
//        @Override
//        public Object getAllowedAction(String name) {
//            return null;
//        }
//
//        @Override
//        public Object getAllowedAction() {
//            return null;
//        }
//
//    }

    //2-praktika

//    public static class Goose extends SmallAnimal {
//        String getSize(){
//            return " гусь маленький ";
//        }
//
//    }
//
//    public static class Dragon extends BigAnimal{
//        @Override
//        public  String getSize(){
//            return "дракон большой";
//        }
//    }
//
//    public static void main(String[] args) {
//        Dragon dragon=new Dragon();
//
//        Goose goose=new Goose();
//
//        SmallAnimal smallAnimal =new SmallAnimal();
//        System.out.println(smallAnimal.getSize()+goose.getSize());
//
//        BigAnimal bigAnimal=new BigAnimal();
//        System.out.println(bigAnimal.getSize()+dragon.getSize());
//
//    }
//
//    public static class BigAnimal {
//        protected String getSize() {
//            return "как динозавр";
//        }
//    }
//
//    public static class SmallAnimal {
//        String getSize() {
//            return "как кошка";
//        }
//    }

    //3- praktika
//    public static void main(String[] args) {
//        new LuxuriousCar().printlnDesire();
//        new CheapCar().printlnDesire();
//        new Ferrari().printlnDesire();
//        new Lanos().printlnDesire();
//    }
//
//    public static  class LuxuriousCar {
//        public void printlnDesire() {
//            System.out.println("Я хочу ездить на роскошной машине.");
//        }
//    }
//    public static class CheapCar{
//
//        public void printlnDesire() {
//            System.out.println("Яхочу ездить на дешевой машине.");
//        }
//    }
//
//    public static class Ferrari extends LuxuriousCar{
//        public void printlnDesire() {
//            System.out.println("Я хочу ездить на Феррари");
//        }
//
//    }
//    public static class Lanos extends CheapCar {
//        public void printlnDesire() {
//            System.out.println("Я хочу ездить на Ланосе.");
//        }
//
//    }
//    public static class Constants {
//        public static String WANT_STRING = "Я хочу ездить на";
//        public static String LUXURIOUS_CAR = "роскошной машине";
//        public static String CHEAP_CAR = "дешевой машине";
//        public static String FERRARI_NAME = "Феррари";
//        public static String LANOS_NAME = "Ланосе";
//    }


    //5-praktika

//    public static interface LivingPart {
//        boolean containsBones();
//    }
//
//    public static class BodyPart implements LivingPart {
//        private String name;
//
//        public BodyPart(String name) {
//            this.name = name;
//        }
//
//        public boolean containsBones() {
//            return true;
//        }
//
//        public String toString() {
//            return containsBones() ? name + " содержит кости " : name + " не содержит кости";
//        }
//    }
//
//    public static class Finger extends BodyPart {
//        private boolean isArtificial;
//
//        public Finger(String name, boolean isArtificial) {
//            super(name);
//            this.isArtificial = isArtificial;
//        }
//
//        public boolean containsBones() {
//            return super.containsBones() && !isArtificial;
//        }
//    }
//
//    public static void main(String[] args) {
//        printlnFingers();
//        printlnBodyParts();
//        printlnLivingParts();
//    }
//
//    private static void printlnLivingParts() {
//        System.out.println(new BodyPart("yes").name);
//    }
//
//    private static void printlnBodyParts() {
//        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
//        bodyParts.add(new BodyPart("Рука"));
//        bodyParts.add(new BodyPart("Нога"));
//        bodyParts.add(new BodyPart("Голова"));
//        bodyParts.add(new BodyPart("Тело"));
//        System.out.println(bodyParts.toString());
//    }
//
//    private static void printlnFingers() {
//        List<Finger> fingers = new ArrayList<Finger>(5);
//        fingers.add(new Finger("Большой", true));
//        fingers.add(new Finger("Указательный", false));
//        fingers.add(new Finger("Средний", false));
//        fingers.add(new Finger("Безымянный", false));
//        fingers.add(new Finger("Мизинец", false));
//        System.out.println(fingers.toString());
//    }

}





