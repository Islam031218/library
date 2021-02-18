package SсhoolProject;

import SсhoolProject.Employee.*;

import javax.lang.model.element.Name;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    //Лист для содрудников:
    public static ArrayList<Employee> ListEmployee;
    private static ArrayList<Pupil> ListPupil;
    public static School school = new School();

    //Метод (main):
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Добавление сотрудников
        ListEmployee = new ArrayList<>();


        //бухгалтер
        ListEmployee.add(new Accountant("Инна", "Петровна", 555, "Бухгалтер",
                "4", generateID()));
        ListEmployee.add(new Accountant("Aman", "Amanov", 555, "бухгалтер", "5", generateID()));

        //учитель
        ListEmployee.add(new Teachers("Иван", "Иванов", 999, "Учитель",
                "10", "Информатика", generateID()));

        // повар
        Cook cook = new Cook("Cook", "cook", 500, "cook", "5",
                generateID());
        ListEmployee.add(cook);

        //техничка
        ListEmployee.add(new Cleaner("клара", "кларова", 555, "уборщик",
                "5", generateID()));

        //охранник
        ListEmployee.add(new Guard("Антон", "Антонов", 888, "Охраник",
                "9", generateID()));




        // студенты
        ListPupil = new ArrayList<>();
        ListPupil.add(new Pupil("Тимур", "Курмушиев", "11A", 5555, generateID()));
        ListPupil.add(new Pupil("Алекс", "Попов", "10B", 3333, generateID()));
        ListPupil.add(new Pupil("Аня", "Громова", "8A", 777, generateID()));
        authEmployee(bufferedReader);
    }


                         //Приветсвенное меню запускается при открытии программмы:
    public static void auth(BufferedReader bufferedReader) throws IOException {
        while (true) {
            System.out.println("-----------МЕНЮ------------");
            System.out.println("1. Информация о сотрудниках");
            System.out.println("2. Информация о учениках");
            System.out.println("3. Информация о школе");
            System.out.println("4. Бухгалтерский учет");
            System.out.println("5. Добавить");
            System.out.println("9. Выход");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }


            switch (num) {
                case 1 -> auth1(bufferedReader);
                case 2 -> getInfoPupil(bufferedReader);
                case 3 -> getInfoSchool(bufferedReader);
                case 4-> AccountingMethod(bufferedReader);
                case 5-> newAddPerson(bufferedReader);
                case 9 -> System.exit(0);
            }
        }
    }

                             // выбор добавления ученика и сотрудника
    public static void newAddPerson(BufferedReader bufferedReader) throws IOException {
        System.out.println("1. Добавить ученика");
        System.out.println("2. Добавить сотрудника");
        int answer=Integer.parseInt(bufferedReader.readLine());

        switch (answer){
            case 1-> addNewStudent(bufferedReader);
            case 2-> EmployeeAddNew(bufferedReader);
        }
    }

                             //выбор добавления сотрудника
    public  static void EmployeeAddNew(BufferedReader bufferedReader) throws IOException {

        while (true) {

            System.out.println("Выберите должность нового сотрудника");
            System.out.println("\n1. Учитель ");
            System.out.println("2. Бухгалтер ");
            System.out.println("3. Повар ");
            System.out.println("4. Дворник ");
            System.out.println("5. Охранник");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException | IOException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }

            if (num == 1) {
                addNewTeacher(bufferedReader);
            } else if (num == 2) {
               addNewAccaunt(bufferedReader);
            } else if (num == 3) {
                addNewCook(bufferedReader);
            }else if (num == 4) {
                addNewCleaner(bufferedReader);
            }else if (num==5){
                addNewGuard(bufferedReader);
            }else {
                System.out.println("Правильно введите цифру пожалуйста!!!");
                continue;
            }
        }
    }

    //добавления учитель
    public  static void addNewTeacher(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите имя учителя");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилию учителя");
        String LastName=bufferedReader.readLine();

        System.out.println("Введите зарплату учителя");
        int salary=Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите стаж учителя");
        String experience=bufferedReader.readLine();

        System.out.println("Введите предмет");
        String subject=bufferedReader.readLine();

        ListEmployee.add(new Teachers(Name,LastName,salary,"учитель",experience,subject,generateID()));

        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }

    }

    //добавления бухгалтера
    public static void  addNewAccaunt(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите имя бухгалтера");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилию бухгалтера");
        String LastName=bufferedReader.readLine();

        System.out.println("Введите зарплату бухгалтера");
        int salary=Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите стаж бухгалтера");
        String experience=bufferedReader.readLine();

        ListEmployee.add(new Accountant(Name,LastName,salary,"бухгалтер",experience,generateID()));
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }
    }

    //Добавления Повара
    public static void addNewCook(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите имя повара");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилию повара");
        String LastName=bufferedReader.readLine();

        System.out.println("Введите зарплату повара");
        int salary=Integer.parseInt(bufferedReader.readLine());


        System.out.println("Введите стаж повара");
        String experience=bufferedReader.readLine();

        ListEmployee.add(new Cook(Name,LastName,salary,"повар",experience,generateID()));

        while (true) {
        System.out.println();
        System.out.println("1: На главный меню");
        System.out.println("9: выход из проекта");

        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("вы ввели не цифру");
            System.out.println();
            continue;
        }
        if (num == 1) {
            auth(bufferedReader);
        } else if (num == 9) {
            System.exit(0);
        } else {
            System.out.println("правильно введите цифру!!");
            continue;
        }
    }
    }

    //Добавления охранника
    public  static void addNewGuard(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите имя охранника");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилию охранника");
        String LastName=bufferedReader.readLine();

        System.out.println("Введите зарплату охранника");
        int salary=Integer.parseInt(bufferedReader.readLine());


        System.out.println("Введите стаж охранника");
        String experience=bufferedReader.readLine();

        ListEmployee.add(new Guard(Name,LastName,salary,"охранник",experience,generateID()));


        while (true) {
        System.out.println();
        System.out.println("1: На главный меню");
        System.out.println("9: выход из проекта");

        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("вы ввели не цифру");
            System.out.println();
            continue;
        }
        if (num == 1) {
            auth(bufferedReader);
        } else if (num == 9) {
            System.exit(0);
        } else {
            System.out.println("правильно введите цифру!!");
            continue;
        }
    }
    }

    //Добавления дворника
    public  static void addNewCleaner(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите имя дворника");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилию дворника");
        String LastName=bufferedReader.readLine();

        System.out.println("Введите зарплату дворника");
        int salary=Integer.parseInt(bufferedReader.readLine());


        System.out.println("Введите стаж дворника");
        String experience=bufferedReader.readLine();

        ListEmployee.add(new Cleaner(Name,LastName,salary,"дворник",experience,generateID()));


        while (true) {
        System.out.println();
        System.out.println("1: На главный меню");
        System.out.println("9: выход из проекта");

        int num = 0;
        try {
            num = Integer.parseInt(bufferedReader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("вы ввели не цифру");
            System.out.println();
            continue;
        }
        if (num == 1) {
            auth(bufferedReader);
        } else if (num == 9) {
            System.exit(0);
        } else {
            System.out.println("правильно введите цифру!!");
            continue;
        }
    }
    }



    //добавления ученика
    public static void addNewStudent(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите имя");
        String Name=bufferedReader.readLine();

        System.out.println("Введите фамилия");
        String LastName=bufferedReader.readLine();

        System.out.println("Выберите номер класса");
        String numberClass=bufferedReader.readLine();

        System.out.println("Введите контракт");
        int contract=Integer.parseInt(bufferedReader.readLine());

        ListPupil.add(new Pupil(Name,LastName,numberClass,contract,generateID()));
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }
    }



    // выбор сотрудника
    public static void auth1(BufferedReader bufferedReader) throws IOException {

        while (true) {


            System.out.println("-----------МЕНЮ------------");
            System.out.println("1. Информация о учитель ");
            System.out.println("2. Информация о повар");
            System.out.println("3. Информация о охранник");
            System.out.println("4. Информация о бухгалтер");
            System.out.println("5. Информация о техничка");
            System.out.println("9. Выход");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }


            switch (num) {
                case 1 -> infoteachers(bufferedReader);
                case 2 -> infoCook(bufferedReader);
                case 3 -> infoGuard(bufferedReader);
                case 4 -> infoAccountant(bufferedReader);
                case 5 -> infoCleaner(bufferedReader);
                case 9 -> System.exit(0);
            }
        }


    }


                        //Для ввывода ЛОГИНА и ПАРОЛЯ сотрудников:
    public static void authEmployee(BufferedReader bufferedReader) throws IOException {
        System.out.println("Приветсвуем вас в школе Агахан");
        System.out.println("Пожалуйста авторизуйтесь");
        String login;
        String password;
        int count = 2;
        for (int i = 3; i >= 1; i--) {
            System.out.println("Введите пожалуйста логин:");
            login = bufferedReader.readLine();
            System.out.println("Введите пожалуста пароль:");
            password = bufferedReader.readLine();
            //Авторизация
            for (Employee employee : ListEmployee) {
                //Авторизация бухгалтера
                if (employee instanceof Accountant) {
                    Accountant accountant = (Accountant) employee;
                    if (login.equals(accountant.getLOGIN()) && password.equals(accountant.getPASSWORD())) {
                        System.out.println("Здравствуйте " + accountant.getName() + " " + accountant.getLastName()
                                + "\n");
                        auth(bufferedReader);
                    }
                }
                //Авторизация учителя
                if (employee instanceof Teachers) {
                    Teachers teachers = (Teachers) employee;
                    if (login.equals(teachers.getLOGIN()) && password.equals(teachers.getPASSWORD())) {
                        System.out.println("Здравствуйте " + teachers.getName() + " " + teachers.getLastName() + "\n");
                        auth(bufferedReader);
                    } else {
                        System.out.println("Введен неверный ЛОГИН или ПАРОЛЬ! " + (count--));
                    }
                }
            }
        }
    }


                               // Бухгалтерский учет
    public  static void AccountingMethod(BufferedReader bufferedReader)throws  IOException{
        System.out.println("1-Оплатить контракт");
        System.out.println("2- Зачислить ЗП");

        int num=Integer.parseInt(bufferedReader.readLine());
        switch (num){
            case 1->payStudentContract(bufferedReader);
            case 2->transferSalaryMethod(bufferedReader);
        }
    }
                               // контракт учиников
    public  static void payStudentContract(BufferedReader bufferedReader)throws  IOException{
        System.out.println("Введите имя студента");

        boolean answer=true;
        String name="";
        while (answer){
           name= bufferedReader.readLine();

            for (Pupil pupil:ListPupil) {
                if (name.equals(pupil.getName())){
                    System.out.println(" Ученик: " + pupil.getName() + " " + pupil.getLastName()
                            + " | Класс: " + pupil.getNumberClass()
                            + " | ID: " + pupil.getId()
                            + " | Конракт:" + pupil.getContract()
                            +" | Задолжность: "+pupil.getContractDebt());

                    System.out.println("У "+pupil.getName()+" задолжность "+pupil.getContractDebt()+" $.");
                    Date date=new Date();
                    date.getTime();

                    System.out.println("Введите оплату");
                    int money=Integer.parseInt(bufferedReader.readLine());

                    if (money<=0){
                        System.out.println("Вы ввели меньши нуля");
                    }else {
                        System.out.println("вы оплатили: "+money+"$");
                        System.out.println("----------Оплата произведна----------");


                        pupil.setContractDebt(pupil.getContractDebt()-money);
                        System.out.println(" Ученик: " + pupil.getName() + " " + pupil.getLastName()
                                + " | Класс: " + pupil.getNumberClass()
                                + " | ID: " + pupil.getId()
                                + " | Конракт:" + pupil.getContract()
                                +" | Задолжность: "+pupil.getContractDebt());

                        school.getMonyFromStudrnts(ListPupil,money);
                    }
                }
            }
            //на главный меню
            while (true) {
                System.out.println();
                System.out.println("1: На главный меню");
                System.out.println("9: выход из проекта");

                int num = 0;
                try {
                    num = Integer.parseInt(bufferedReader.readLine());

                } catch (NumberFormatException e) {
                    System.out.println("вы ввели не цифру");
                    System.out.println();
                    continue;
                }
                if (num == 1) {
                    auth(bufferedReader);
                } else if (num == 9) {
                    System.exit(0);
                } else {
                    System.out.println("правильно введите цифру!!");
                    continue;
                }

            }

        }
    }
                                //зарплата сотрудников
    public  static void transferSalaryMethod(BufferedReader bufferedReader) throws IOException {
        if (school.getAllMoney()<=0){
            System.out.println("пока нет денег в бюджете. Скоро будет");
        }else {
            boolean answer=true;
            while (answer) {
                System.out.println("Введите имя сотрудника");
                String nameEmployee = bufferedReader.readLine();

                for (Employee employee : ListEmployee) {
                    if (nameEmployee.equals(employee.getName())) {
                        if (employee instanceof Teachers) {
                            Teachers teachers = (Teachers) employee;
                            System.out.println("Сотрудник: " + teachers.getName() + " " + teachers.getLastName()
                                    + " | Заработная плата: " + teachers.getSalary()
                                    + "$ | Должность:" + teachers.getPosition()
                                    + " | Стаж:" + teachers.getExperience()
                                    + " | ID:" + teachers.getId() + " | Предмет: " + teachers.getSubject());

                            System.out.println("\nВведите ЗП");
                            int summ = Integer.parseInt(bufferedReader.readLine());
                            if (summ>teachers.getSalary()){
                                System.out.println("у вас зарплата"+teachers.getSalary());
                            }else {
                                school.setAllMoney(school.getAllMoney() - summ);
                                teachers.getMonyFromEmployee(summ);

                                while (true) {
                                    System.out.println("\nВернуться в главное меню?" + "\n1.ДА \n9.Выйти из проекта ");
                                    int a = 0;
                                    try {
                                        a = Integer.parseInt(bufferedReader.readLine());

                                    } catch (NumberFormatException d) {
                                        System.out.println("введите цифру!!!");
                                        continue;
                                    }
                                    if (a == 1) {
                                        auth(bufferedReader);
                                    } else if (a == 9) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("Не правильно ввели цифру");
                                        continue;
                                    }
                                }
                            }

                        }
                    }
                }
            }


        }

    }

    // информация о бухгалтер
    public static void infoAccountant(BufferedReader bufferedReader) throws IOException {
        int counter = 0;
        for (Employee employee : ListEmployee) {
            counter++;
            if (employee instanceof Accountant) {
                Accountant accountant = (Accountant) employee;
                System.out.println(counter + ". Сотрудник: " + accountant.getName() + " " + accountant.getLastName()
                        + " | Заработная плата: " + accountant.getSalary()
                        + " | Должность:" + accountant.getPosition()
                        + " | Стаж:" + accountant.getExperience()
                        + " | ID:" + accountant.getId() +
                        " | Бюджет: "+accountant.getMonyEmployee());
            }
        }
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }

        }

    }

    //  информация о учителя
    public static void infoteachers(BufferedReader bufferedReader) throws IOException {
        int counter = 0;
        for (Object employee : ListEmployee) {
            counter++;
            if (employee instanceof Teachers) {
                Teachers teachers = (Teachers) employee;
                System.out.println(counter + ". Сотрудник: " + teachers.getName() + " " + teachers.getLastName()
                        + " | Заработная плата: " + teachers.getSalary()
                        + "$ | Должность:" + teachers.getPosition()
                        + " | Стаж:" + teachers.getExperience()
                        + " | ID:" + teachers.getId() +
                        " | Предмет: " + teachers.getSubject()
                        + " | Бюджет: " + teachers.getMonyEmployee());
            }
        }
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println(" Правильно введите цифру!!! ");
                continue;
            }

        }
    }

    // информация о повра
    public static void infoCook(BufferedReader bufferedReader) throws IOException {
        int counter = 0;
        for (Object employee : ListEmployee) {
            counter++;
            if (employee instanceof Cook) {
                Cook cook = (Cook) employee;
                System.out.println(counter + ". Сотрудник: " + cook.getName() + " " + cook.getLastName()
                        + " | Заработная плата: " + cook.getSalary()
                        + " | Должность:" + cook.getPosition()
                        + " | Стаж:" + cook.getExperience()
                        + " | ID:" + cook.getId() + " |");
            }
        }
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }
    }

    //информация о охранника
    public static void infoGuard(BufferedReader bufferedReader) throws IOException {
        int counter=0;
        for (Object employee : ListEmployee) {
            counter++;
            if (employee instanceof Guard) {
                Guard guard = (Guard) employee;
                System.out.println(counter+". Сотрудник: " + guard.getName() + " " + guard.getLastName()
                        + " | Заработная плата: " + guard.getSalary()
                        + " | Должность:" + guard.getPosition()
                        + " | Стаж:" + guard.getExperience()
                        + " | ID:" + guard.getId() + " |");
            }
        }

        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }

            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }
    }

    // информация о техничка
    public static void infoCleaner(BufferedReader bufferedReader) throws IOException {
        int counter=0;
        for (Object employee : ListEmployee) {
            counter++;
            if (employee instanceof Cleaner) {
                Cleaner cleaner = (Cleaner) employee;
                System.out.println(counter+". Сотрудник: " + cleaner.getName() + " " + cleaner.getLastName()
                        + " | Заработная плата: " + cleaner.getSalary()
                        + " | Должность:" + cleaner.getPosition()
                        + " | Стаж:" + cleaner.getExperience()
                        + " | ID:" + cleaner.getId() + " |");

            }
        }
        while (true) {
            System.out.println();
            System.out.println("1: На главный меню");
            System.out.println("9: выход из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException e) {
                System.out.println("вы ввели не цифру");
                System.out.println();
                continue;
            }
            if (num == 1) {
                auth(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("правильно введите цифру!!");
                continue;
            }
        }
    }


                            //Ввывод информации учеников:
    public static void getInfoPupil(BufferedReader bufferedReader) throws IOException {
        System.out.println("\nСписок студентов:");
        int counter = 0;
        for (Pupil pupil : ListPupil) {
            counter++;
            System.out.println(counter + ". Ученик: " + pupil.getName() + " " + pupil.getLastName()
                    + " | Класс: " + pupil.getNumberClass()
                    + " | ID: " + pupil.getId()
                    + " | Конракт:" + pupil.getContract()
                    +" $ | Задолжность: "+pupil.getContractDebt()+" $");
        }


        while (true) {
            System.out.println("\nВернуться в главное меню?" + "\n1.ДА \n9.Выйти из проекта ");
            int a = 0;
            try {
                a = Integer.parseInt(bufferedReader.readLine());

            } catch (NumberFormatException d) {
                System.out.println("введите цифру!!!");
                continue;
            }
            if (a == 1) {
                auth(bufferedReader);
            } else if (a == 9) {
                System.exit(0);
            } else {
                System.out.println("Не правильно ввели цифру");
                continue;
            }
        }
    }


                            //Ввывод информации о школе:
    public static void getInfoSchool(BufferedReader bufferedReader) throws IOException {
        int quantityEmployee = 0;
        int quantityPupil = 0;
        for (Employee employee : ListEmployee) {
            quantityEmployee++;
        }
        for (Pupil pupil : ListPupil) {
            quantityPupil++;
        }
        System.out.println("\nНазвание школы:" + school.getNAME()
                + "\nГод основание:" + school.getYEAR()
                + "\nКоличество учеников:" + quantityPupil
                + "\nКоличество сотрудников:" + quantityEmployee
                + "\nБюджет школы: "+school.getAllMoney());
        System.out.println("\nВернуться в главное меню?" + "\n1.ДА");
        int a = Integer.parseInt(bufferedReader.readLine());
        if (a == 1) {
            auth(bufferedReader);
        }
    }


                             //Генерирует индивидуальную ID
    public static int generateID() {
        int id = (int) (Math.random() * 899) + 100;
        boolean answer = checkID(id);
        if (answer) {
            return id;
        } else {
            return generateID();
        }
    }

                               //Проверка на индивидульность ID
    public static boolean checkID(int id) {
        for (Employee employee : ListEmployee) {
            if (id == employee.getId()) {
                return false;
            }
        }
        return true;
    }

}


