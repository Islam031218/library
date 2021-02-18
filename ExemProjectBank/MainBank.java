package ExemProjectBank;


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainBank {

    public static List<User> ListUser = new ArrayList<>();
    public static List<User> listPerson = new ArrayList<>();
    public static List<Account> listAccaunt = new ArrayList<>();
    public static List<Transaction> listTransaction = new ArrayList<>();


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            FileInputStream fileInputStream = new FileInputStream("User");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ListUser = (ArrayList<User>) objectInputStream.readObject();
            objectInputStream.close();


        } catch (Exception e) {

        }


        Auth(bufferedReader);
    }

    // авторизация && регистрация
    public static void Auth(BufferedReader bufferedReader) throws IOException {
        System.out.println("Добро пожавать на наш онлайн банк");
        System.out.println("Выберите раздел: ");
        while (true) {
            System.out.println("1. Авторизация");
            System.out.println("2. Регистрация");

            int num = 0;

            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цифры");
                continue;
            }

            if (num > 2) {
                System.out.println(" Введите цифры которые здес есть");
                continue;
            }

            switch (num) {
                case 1 :  auth(bufferedReader);
                case 2 : register(bufferedReader);
            }
        }


    }

    // авторизация
    public static void auth(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите логин.");
        String login = bufferedReader.readLine();

        System.out.println("Введите пароль.");
        String password = bufferedReader.readLine();
        for (User user : ListUser) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                listPerson.add(new User(generateID(), user.getFirstName(), user.getLastName(),
                        login, password));
                Menu(bufferedReader);
            }
        }

    }

    //меню
    public static void Menu(BufferedReader bufferedReader) throws IOException {
        System.out.println("\nВыберите раздель\n");

        System.out.println("1. Пополнить счет");
        System.out.println("2. Перевод ");
        System.out.println("3. Забрать");
        System.out.println("4. Моя информация ");
        System.out.println("5. История перевода");
        System.out.println("6. Информация о пользователей");
        System.out.println("7. Инфо о банка");
        System.out.println("8. Редактировать");
        System.out.println("9. Выйти из приложеня");

        while (true) {

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите тоьлко цифры");
            }

            if (num == 1) {
                topUpBalance(bufferedReader);
            } else if (num == 2) {
                MoneyTransfer(bufferedReader);
            } else if (num == 3) {
                TakeMoney(bufferedReader);
            } else if (num == 4) {
                InfoMe(bufferedReader);
            } else if (num == 5) {
                paymenthistory(bufferedReader);
            } else if (num == 6) {
                InfoUsers(bufferedReader);
            } else if (num == 7) {
                InfoBank(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            }else if (num == 8){
                editing(bufferedReader);
            }else {
                System.out.println("Введите те  цифры которые здесь есть !!! ");
                continue;
            }
        }

    }

    // перевести деньги
    public static void paymenthistory(BufferedReader bufferedReader) throws IOException {
        for (Transaction transaction : listTransaction) {
            System.out.println("Вы перевели " + transaction.getUser() + " " + transaction.getAmount() + ". в" + transaction.getTimeStamp());
            while (true) {
                System.out.println("1. На главный меню");
                System.out.println("9. Выйти из программа");
                int num = 0;
                try {
                    num = Integer.parseInt(bufferedReader.readLine());
                } catch (NumberFormatException | IOException e) {
                    System.out.println("Введите только цифры");
                    continue;
                }

                if (num == 1) {
                    Menu(bufferedReader);
                } else if (num == 9) {
                    System.exit(0);
                } else {
                    System.out.println("Введите цифры которые здесь есть");
                    continue;
                }
            }
        }

    }

    // информация о банке
    public static void InfoBank(BufferedReader bufferedReader) throws IOException {
        Bank bank = new Bank("Банк", ListUser, listAccaunt);
        System.out.println("Добро пожаловать на наш банк");
        System.out.println("Имя банка: " + bank + ". |Все пользовители: " + ListUser.size() + ". |Все аккаунты: " + listAccaunt.size());

        while (true) {
            System.out.println("1. На главный меню");
            System.out.println("9. Выйти из программа");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Введите только цифры");
                continue;
            }

            if (num == 1) {
                Menu(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                continue;
            }
        }
    }

    //Взять деньги
    public static void TakeMoney(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите логин");
        String login = bufferedReader.readLine();

        System.out.println("Введите пароль");
        String password = bufferedReader.readLine();

        for (User user : ListUser) {
            if (password.equals(user.getPassword()) && login.equals(user.getLogin())) {

                while (true) {
                    System.out.println("В каком счето вы хотите взят");
                    System.out.println("1. рубль\n2. доллар");
                    int num = 0;
                    try {
                        num = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите только цифры");
                        continue;
                    }


                    if (num == 1) {
                        while (true) {
                            System.out.println("Скоько вы хотите взять");
                            int num2 = 0;

                            try {
                                num2 = Integer.parseInt(bufferedReader.readLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Введите только деньги");
                                continue;
                            }
                            if (user.getRubl() > 0) {
                                if (user.getRubl() > num2) {
                                    user.setRubl(user.getRubl() - num2);
                                    System.out.println("Успешно взято деньги");
                                    serializableReader(bufferedReader);
                                } else {
                                    System.out.println("у вас деньги меньше чем вы думайте");
                                    //на главный меню
                                    while (true) {
                                        System.out.println("1. На главный меню");
                                        System.out.println("9. Выйти из программа");
                                        int num1 = 0;
                                        try {
                                            num1 = Integer.parseInt(bufferedReader.readLine());
                                        } catch (NumberFormatException e) {
                                            System.out.println("Введите только цифры");
                                            continue;
                                        }

                                        if (num1 == 1) {
                                            Menu(bufferedReader);
                                        } else if (num1 == 9) {
                                            System.exit(0);
                                        } else {
                                            System.out.println("Введите цифры которые здесь есть");
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("У вас сумма меньше нулья");
                                while (true) {
                                    System.out.println("1. На главный меню");
                                    System.out.println("9. Выйти из программа");
                                    int num1 = 0;
                                    try {
                                        num1 = Integer.parseInt(bufferedReader.readLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println("Введите только цифры");
                                        continue;
                                    }

                                    if (num1 == 1) {
                                        Menu(bufferedReader);
                                    } else if (num1 == 9) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("Введите цифры которые здесь есть");
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (num == 2) {
                        while (true) {
                            System.out.println("Скоько вы хотите взять");
                            int num2 = 0;

                            try {
                                num2 = Integer.parseInt(bufferedReader.readLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Введите только цифры");
                                continue;
                            }
                            if (user.getDollar() > 0) {
                                if (user.getDollar() > num2) {
                                    user.setDollar(user.getDollar() - num2);
                                    System.out.println("Успешно взято деньги");
                                    serializableReader(bufferedReader);
                                } else {
                                    System.out.println("у вас деньги меньше чем вы думайте");
                                    //на главный меню
                                    while (true) {
                                        System.out.println("1. На главный меню");
                                        System.out.println("9. Выйти из программа");
                                        int num1 = 0;
                                        try {
                                            num1 = Integer.parseInt(bufferedReader.readLine());
                                        } catch (NumberFormatException e) {
                                            System.out.println("Введите только цифры");
                                            continue;
                                        }

                                        if (num1 == 1) {
                                            Menu(bufferedReader);
                                        } else if (num1 == 9) {
                                            System.exit(0);
                                        } else {
                                            System.out.println("Введите цифры которые здесь есть");
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("У вас сумма меньше нулья");
                                while (true) {
                                    System.out.println("1. На главный меню");
                                    System.out.println("9. Выйти из программа");
                                    int num1 = 0;
                                    try {
                                        num1 = Integer.parseInt(bufferedReader.readLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println("Введите только цифры");
                                        continue;
                                    }

                                    if (num1 == 1) {
                                        Menu(bufferedReader);
                                    } else if (num1 == 9) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("Введите цифры которые здесь есть");
                                        continue;
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("Введите те цифры который здесь есть");
                    }
                }
            }
        }

    }


    //перевод денегь
    public static void MoneyTransfer(BufferedReader bufferedReader) throws IOException {
        for (User user : listPerson) {
            for (User user1 : ListUser) {
                if (user.getId() == user1.getId() ||
                        user.getLogin().equals(user1.getLogin())
                                && user.getPassword().equals(user1.getPassword())) {
                    while (true) {


                        System.out.println("Введите Id пользователя который вы хотите перевести денегь");
                        int id = 0;
                        try {
                            id = Integer.parseInt(bufferedReader.readLine());
                        } catch (NumberFormatException t) {
                            System.out.println("Введите только цифры");
                            continue;
                        }
                        int w = 0;

                        for (User user2 : ListUser) {
                            if (user2.getId() == id) {
                                w++;
                                while (true) {
                                    System.out.println("Пользователь: " + user2.getFirstName());
                                    System.out.println("В каком курсе вы хотите перести");
                                    System.out.println("1. рубль\n2. доллар");
                                    int a = 0;
                                    try {
                                        a = Integer.parseInt(bufferedReader.readLine());
                                    } catch (NumberFormatException s) {
                                        System.out.println("Введите только цифры");
                                        continue;
                                    }
                                    if (a == 1) {

                                        while (true) {
                                            System.out.println("Сколько вы хотите перевести?");
                                            int summ = 0;
                                            try {
                                                summ = Integer.parseInt(bufferedReader.readLine());
                                            } catch (NumberFormatException g) {
                                                System.out.println("Введите только цифры\n");
                                                continue;
                                            }
                                            if (user1.getRubl() > summ) {
                                                user2.setRubl(user2.getRubl() + summ);
                                                user1.setRubl(user1.getRubl() - summ);
                                                Date date = new Date();
                                                listTransaction.add(new Transaction(summ, date, user2));
                                                System.out.println("Вы успешно перевели деньги");
                                                serializableReader(bufferedReader);
                                            } else {
                                                System.out.println("У вас не хватает денег");
                                                Menu(bufferedReader);
                                            }
                                        }


                                    }
                                    if (a == 2) {
                                        System.out.println("Сколько вы хотите перевести?");
                                        int summ = 0;
                                        try {
                                            summ = Integer.parseInt(bufferedReader.readLine());
                                        } catch (NumberFormatException g) {
                                            System.out.println("Введите только цифры\n");
                                            continue;
                                        }
                                        if (user1.getRubl()>summ) {
                                            user2.setDollar(user2.getDollar() + summ);
                                            user1.setDollar(user1.getDollar() - summ);
                                            Date date = new Date();
                                            listTransaction.add(new Transaction(summ, date, user2));
                                            System.out.println("Вы успешно перевели деньги");
                                            serializableReader(bufferedReader);
                                        }else {
                                            System.out.println("У вас не хватает денегь");
                                            Menu(bufferedReader);
                                        }
                                    }
                                }

                            } else {
                                continue;
                            }

                        }
                        if (w == 0) {
                            System.out.println("нет такого пользователя");
                            Menu(bufferedReader);
                        }

                    }
                } else {
                    continue;
                }

            }
        }
    }


    //информация о пользователей
    public static void InfoUsers(BufferedReader bufferedReader) throws IOException {
        for (User user : ListUser) {
            System.out.println("");
            System.out.println("Имя: " + user.getLastName() + ". Фамилия: " + user.getFirstName() + ". "
                    + "Логин: " + user.getLogin() + ". Пароль" + user.getPassword() + ". ID: " + user.getId() + ". Счет рубль: "
                    + user.getRubl() + ". Счет доллар: " + user.getDollar());

        }
        while (true) {
            System.out.println("1. На главный меню");
            System.out.println("9. Выйти из программа");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Введите только цифры");
                continue;
            }

            if (num == 1) {
                Menu(bufferedReader);
            } else if (num == 9) {
                System.exit(0);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                continue;
            }
        }

    }

    // информация про меня
    public static void InfoMe(BufferedReader bufferedReader) throws IOException {
        for (User user1 : listPerson) {
            for (User user : ListUser) {
                if (user1.getLogin().equals(user.getLogin())) {
                    System.out.println("Имя: " + user.getLastName() + ". Фамилия: " + user.getFirstName() + ". "
                            + "Логин: " + user.getLogin() + ". Пароль: " + user.getPassword() + ". ID: " + user.getId()
                            + ". Счет рубль "
                            + user.getRubl() + ". Счет доллар: " + user.getDollar());

                    //на главный меню
                    while (true) {
                        System.out.println("1. На главный меню");
                        System.out.println("9. Выйти из программа");
                        int num = 0;
                        try {
                            num = Integer.parseInt(bufferedReader.readLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Введите только цифры");
                            continue;
                        }

                        if (num == 1) {
                            Menu(bufferedReader);
                        } else if (num == 9) {
                            System.exit(0);
                        } else {
                            System.out.println("Введите цифры которые здесь есть");
                            continue;
                        }
                    }
                }
            }
        }
    }


    //пополнить баланс
    public static void topUpBalance(BufferedReader bufferedReader) throws IOException {

        System.out.println("Введите логин ");
        String login = bufferedReader.readLine();

        System.out.println(" Введите пароль");
        String password = bufferedReader.readLine();
        for (User user1 : ListUser) {
            if (user1.getLogin().equals(login) && user1.getPassword().equals(password)) {

                while (true) {
                    System.out.println("В каком курсе вы хотите попольнить баланс");
                    System.out.println("1. рубль\n2. доллар");
                    int valyuta = Integer.parseInt(bufferedReader.readLine());

                    if (valyuta == 1) {
                        while (true) {
                            System.out.println("Введите сумму");
                            int sum = 0;
                            try {
                                sum = Integer.parseInt(bufferedReader.readLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Введите только цифры");
                                continue;
                            }
                            user1.setRubl(user1.getRubl() + sum);
                            listAccaunt.add(new Account(user1.getId(), user1.getRubl(), "рубль", user1));

                            System.out.println("Успешна пополнено баланс");

                            serializableReader(bufferedReader);
                        }
                    } else if (valyuta == 2) {
                        while (true) {
                            System.out.println("Введите сумму");
                            int sum = 0;

                            try {
                                sum = Integer.parseInt(bufferedReader.readLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Введите только цифры");
                                continue;
                            }

                            user1.setDollar(user1.getDollar() + sum);
                            Date date = new Date();

                            System.out.println("Успешна пополнено баланс");

                            serializableReader(bufferedReader);
                        }
                    } else {
                        System.out.println("Введите те цифры который здес есть");
                    }

                }
            }
        }


    }

    // регистрация
    public static void register(BufferedReader bufferedReader) throws IOException {
        while (true) {
            System.out.println("Введите имя.");
            String firstName = bufferedReader.readLine();

            System.out.println("Введите фамилию.");
            String lastName = bufferedReader.readLine();

            System.out.println("Введите логин.");
            String login = bufferedReader.readLine();

            System.out.println("Введите пароль.");
            String password = bufferedReader.readLine();

            if (firstName.equals("") || firstName.equals(" ") || lastName.equals("") || lastName.equals(" ") ||
                    login.equals("") || login.equals(" ") || password.equals("") || password.equals(" ")) {
                System.out.println("Не введите пустую строку");
                continue;
            }


            ListUser.add(new User(generateID(), firstName, lastName, login, password));

            for (User user : ListUser) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password))
                    listPerson.add(new User(user.getId(), user.getFirstName(), user.getLastName(), user.getLogin(),
                            user.getPassword()));
            }

            serializableReader(bufferedReader);
        }

    }

    //сериализация
    public static void serializableReader(BufferedReader bufferedReader) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("User");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(ListUser);
        objectOutputStream.close();

        Menu(bufferedReader);
    }

    // редактирования
    public  static  void editing(BufferedReader bufferedReader ) throws IOException {
        System.out.println("Вы точно хотите редактировать ...");
        while (true) {
            System.out.println("1. да\n2. нет. Выйти на главный меню");
            int a =0;
            try {
                a = Integer .parseInt(bufferedReader.readLine());
            }catch (NumberFormatException e){
                System.out.println("Введите только цифры");
                continue;
            }

            if (a == 1){

                System.out.println("Введите имя.");
                String firstName = bufferedReader.readLine();

                System.out.println("Введите фамилию.");
                String lastName = bufferedReader.readLine();

                System.out.println("Введите логин.");
                String login = bufferedReader.readLine();

                System.out.println("Введите пароль.");
                String password = bufferedReader.readLine();
                if (firstName.equals("") || firstName.equals(" ") || lastName.equals("") || lastName.equals(" ") ||
                        login.equals("") || login.equals(" ") || password.equals("") || password.equals(" ")) {
                    System.out.println("Не введите пустую строку");
                    continue;
                }
                System.out.println("Успешно редактировано!!!");
                serializableReader(bufferedReader);

            }else  if (a == 2){
                Menu(bufferedReader);
            }else {
                System.out.println("Введите только те цыфры которые здесь есть !!! ");
                continue;
            }


        }



    }


    //Генерирует индивидуальную ID
    public static int generateID() {
        int c = 0;
        while (true) {
            c++;

            int id = (int) (Math.random() * 89999) + 100000;

            boolean answer = checkID(id);
            if (answer) {
                return id;
            } else {
                return generateID();
            }
        }

    }

    //Проверка на индивидульность ID
    public static boolean checkID(int id) {
        for (User user : ListUser) {
            if (id == user.getId()) {
                return false;
            }
        }
        return true;
    }
}
