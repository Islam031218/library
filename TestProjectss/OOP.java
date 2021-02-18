package TestProjectss;

import java.util.Scanner;

public class OOP {
//    public static void main(String[] args) {

//    }
    //1-задания

    //public class Schoolboy {

//    }public class book extends Schoolboy{
//
//    }public  class Worker extends book{
//
//    }public class Slave extends Worker{
//
//    }


    //2-задания

//    public class hous extends asset{
//
//    }    public class cat extends animal {
//
//    }    public class car  extends asset{
//
//    }    public class dog extends animal {
//
//    }    public class animal extends asset{
//
//    }    public class asset {
//
//    }


    //3-задания
//    public class pet  {
//
//    }    public class Hous {
//
//    }    public class cat extends pet {
//
//    }    public class dog extends pet{
//
//    }    public class airplane  {
//
//    }


    //4-задания
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        manager manager = new manager(employee.salary, employee.experiens);
       manager.counter();
        System.out.println("зарплата менеджера: "+employee.salary+". стажировка: "+employee.experiens);


        chief chief = new chief(employee.salary, employee.experiens);
        chief.counter();
        System.out.println("зарплата директор: "+employee.salary+". стажировка: "+employee.experiens);


        secretary secretary = new secretary(employee.salary, employee.experiens);
        secretary.counter();
        System.out.println("зарплата секретар: "+employee.salary+". стажировка: "+employee.experiens);



    }

    public static class employee {
        public  int counter ;
        static int salary;
        static int experiens;

        public employee(int salary, int experiens) {
            this.salary = salary;
            this.experiens = experiens;
        }
        public  int counter(){

            Scanner scanner = new Scanner(System.in);
            employee employee = new employee(scanner.nextInt(), scanner.nextInt());
            if (employee.experiens > 0 && employee.experiens < 3) {
                employee.salary += (employee.salary / 100) * 10;
            } else if (employee.experiens >= 3 && employee.experiens < 10) {
                employee.salary += (employee.salary / 100) * 20;
            } else if (employee.experiens >= 10) {
                employee.salary += (employee.salary / 100) * 25;
            }
            return employee.salary;

        }


    }


    public static class manager extends employee {

        public manager(int salary, int experiens) {
            super(salary, experiens);
        }

        void managerInfo() {
            System.out.println("зарплата менеджера: " + salary + ". стажировка: " + experiens);
        }
    }

    public static class chief extends employee {


        public chief(int salary, int experiens) {
            super(salary, experiens);
        }

        void chiefInfo() {
            System.out.println("зарплата директора : " + salary + "стажировка: " + experiens);
        }

    }


    public static class secretary extends employee {
        public secretary(int salary, int experiens) {
            super(salary, experiens);
        }

        void secretaryInfo() {
            System.out.println("зарплата секретара: "+salary + "стажировка : "+experiens);
        }

    }


    //2-пакет задач
    //1-задания
//    public static void main(String[] args) {
//
//    }public  class  horse {
//
//    }public  class pegasus extends horse{
//
//    }

    //2-задания

//    public static void main(String[] args) {
//
//    }public  class pet{
//
//    }public  class cat extends pet{
//
//    }public  class  dog extends pet{
//
//    }

    //3-задания

//    public static void main(String[] args) {
//
//    }public class Animal{
//
//    }public class cow extends Animal{
//
//    }public class pig extends Animal{
//
//    }public class sheep extends  Animal{
//
//    }public class bull extends  Animal{
//
//    }public class goat extends Animal{
//
//    }

    //4-задания
//    public static void main(String[] args) {
//
//    }public  class worker{
//
//    }public  class clerc extends worker{
//
//    }public  class  it extends worker{
//
//    }public  class programmer extends it{
//
//    }public  class projectManeger extends it{
//
//    }public  class cto extends it{
//
//    }public  class hr{
//
//    }public  class officeManager extends clerc{
//
//    }public  class cleaner extends clerc{
//
//    }



}
