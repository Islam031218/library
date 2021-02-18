package LibraryProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainInLibrary implements Serializable {

    public static List<Book> list = new ArrayList<>();
    public static List<Reader> ListReader = new ArrayList<>();
    public static List<Reader> Listreader = new ArrayList<>();
    public static List<Reader> ListPerson = new ArrayList<>();


    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileInputStream inputStream = new FileInputStream("reader");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Listreader = (ArrayList<Reader>) objectInputStream.readObject();

            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }

        //читает файла
        try {
            FileInputStream inputStream = new FileInputStream("book");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            list = (ArrayList<Book>) objectInputStream.readObject();

            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        System.out.println("Добро пожаловать в нашу библиотеку.");
        auth(bufferedReader);
    }

    //Вход в проект
    public static void auth(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {

        boolean answer = true;
        while (answer) {
            System.out.println("1. Вход в проект");
            System.out.println("2. Добавить книг");
            System.out.println("3. Доступные книги");
            System.out.println("4. Зарегистрироватся");
            System.out.println("9. Выйти из проекта");
            int s ;
            try {
                s = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цифры\n");
                continue;
            }
            if (s == 1) {
                int num = 3;
                for (int i = 0; i < 3; i++) {
                    num--;
                    System.out.println("Пожалуйто введите ваш логин ");
                    String login = bufferedReader.readLine();

                    System.out.println("Введите ваш пароль ");
                    String password = bufferedReader.readLine();
                    for (Reader reader : Listreader) {
                        if (login.equals(reader.getLogin()) && password.equals(reader.getPassword())) {
                            if (reader instanceof Teacher) {
                                ListPerson.add(new Teacher(reader.getId(), reader.getName(), reader.getLogin(),
                                        reader.getPassword()));
                            } else if (reader instanceof Student) {
                                ListPerson.add(new Student(reader.getId(), reader.getName(), reader.getLogin(),
                                        reader.getPassword()));
                            }
                            MenuSection(bufferedReader);
                        } else {
                            continue;
                        }
                    }
                    if (ListPerson.size() == 0) {
                        if (num == 0) {
                            System.out.println("Вы не явлайтесь читателем");
                            answer = false;
                        }
                        System.out.println("Не правильный пароль побробуйте ещё раз. У вас: " + num + " попытки");
                        continue;
                    }
                }

            } else if (s == 2) {
                addNewBook(bufferedReader);
            } else if (s == 3) {
                availablebooks(bufferedReader);
            }else if (s == 4){
                studentOrTeacher(bufferedReader);
            } else if (s == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые есть!!!");
                continue;
            }
        }


    }

    // Меню
    public static void MenuSection(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {

        while (true) {
            System.out.println("\nПожалуйсто выберите раздел.");
            System.out.println("1. Поиск книг");
            System.out.println("2. Просмотр доступных книг");
            System.out.println("3. Просмотр пользователей");
            System.out.println("4. Просмотр взятых книг");
            System.out.println("5. Взять книгу");
            System.out.println("6. Вернуть книгу");
            System.out.println("7. Регистрация нового читателя");
            System.out.println("8. Добавить книгу");
            System.out.println("9. Посмотреть все книги");
            System.out.println("10. Выйти из проекта");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цифры");
                continue;
            }
            if (num > 10) {
                System.out.println("Введите числы которые здесь есть");
                continue;
            }
            switch (num) {
                case 1 -> searchbooks(bufferedReader);
                case 2 -> availablebooks(bufferedReader);
                case 3 -> listUsers(bufferedReader);
                case 4 -> notavailablebooks(bufferedReader);
                case 5 -> takeBook(bufferedReader);
                case 6 -> returnbook(bufferedReader);
                case 7 -> studentOrTeacher(bufferedReader);
                case 8 -> addNewBook(bufferedReader);
                case 9 -> allBook(bufferedReader);
                case 10 -> outInSystem(bufferedReader);
            }
        }
    }

    //выйти из приложения
    public static void outInSystem(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {
        System.out.println("Вы точно хотите выйти из приложения");
        while (true) {
            System.out.println("1. Да\n2. Отмена");
            int num;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Пожалусто введите только цифру");
                continue;
            }

            if (num == 1) {
                System.exit(0);
            } else if (num == 2) {
                MenuSection(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }

    }

    // все книги
    public static void allBook(BufferedReader bufferedReader) throws InterruptedException, IOException, ClassNotFoundException {
        for (Book book : list) {
            System.out.println("Имя книга: " + book.getName() + " | Автор: " + book.getAuthor()
                    + " | ID: " + book.getId());

        }

        //вернутся или взять книгу
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("2. Взять книгу");
            System.out.println("9. Выйти из программ");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 2) {
                takeBook(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                ;
            }
        }

    }

    // поиск книг
    public static void searchbooks(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        int a = 0;
        System.out.println("Введите имя книг который вы ищете!");

        String name = bufferedReader.readLine();
        for (Book book : list) {
            if (book.getName().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)")) {
                System.out.println(book.getName());
                a++;
            }
        }
        if (a < 1) {
            System.out.println("К сожилению у нас нет такого книга");
        }

        //вернутся или взять книгу
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("2. Взять книгу");
            System.out.println("9. Выйти из программ");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 2) {
                takeBook(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                ;
            }
        }
    }

    //Доступные книги
    public static void availablebooks(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {

        System.out.println("\nДоступные книги: ");
        for (Book book : list) {
            if (book.getInStock()) {
                System.out.println("Имя книга: " + book.getName() + " | Автор: " + book.getAuthor()
                        + " | ID: " + book.getId());
            }
        }
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("2. Взять книгу");
            System.out.println("9. Выйти из программ");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 2) {
                takeBook(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                ;
            }
        }
    }

    //посмотреть пользователей
    public static void listUsers(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        for (Reader reader : Listreader) {
            if (reader instanceof Teacher) {
                System.out.println("Имя учителя: " + reader.getName() + " | Логин: " + reader.getLogin()
                        + " | ID: " + reader.getId() + " | пароль: " + reader.getPassword() + " |");
            } else if (reader instanceof Student) {
                System.out.println("Имя ученика: " + reader.getName() + " | Логин: " + reader.getLogin()
                        + " | ID: " + reader.getId() + " | пароль: " + reader.getPassword() + " |");
            }
        }
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }
    }

    //Недоступные книги
    public static void notavailablebooks(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        System.out.print("\nВзятых книги: ");
        int sum = 0;
        for (Book book : list) {
            Book book1 = (Book) book;
            if (book1.getInStock() == false) {
                sum++;
                System.out.println("Имя книга: " + book1.getName() + " | Автор: " + book1.getAuthor()
                        + " | ID: " + book1.getId() + " | Взял: " + book1.getUser().getName());
            }
        }
        if (sum == 0) {
            System.out.print("нет");
        }
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");

            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }
    }


    //Взять книгу
    public static void takeBook(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        for (Reader reader : ListPerson) {
            System.out.println("\nПожалуйсто введите имя или автор книгу который вы хотите взять");
            String name = bufferedReader.readLine();
            int sum = 0;
            System.out.println("Какого из них вы хотите взять?");
            for (Book book1 : list) {
                if (book1.getName().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)") ||
                        book1.getAuthor().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)")) {
                    sum++;
                    System.out.println(sum + ". " + book1.getName()
                            + " | Автор: " + book1.getAuthor() + " | ID: " + book1.getId());

                }
            }
            if (sum > 0) {
                System.out.println("\nПожалуйсто введите Id книгу который вы выбрали");
                int name1;
                while (true) {
                    try {
                        name1 = Integer.parseInt(bufferedReader.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Введите только цифры!!!");
                        continue;
                    }

                }


                for (Book book : list) {
                    if (name1 == book.getId()) {

                        if (book.getInStock() == true) {
                            System.out.println("Вы точно хотите взять эту книгу?");

                            int a = 0;

                            // вайл для проверка правильность  a
                            while (true) {
                                System.out.println("1. Да\n2. Нет");

                                try {
                                    a = Integer.parseInt(bufferedReader.readLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Введите только цифры");
                                    continue;
                                }

                                if (a == 1 || a == 2) {
                                    break;
                                } else {
                                    System.out.println("Введите цифры которые есть здесь");
                                    continue;
                                }

                            }

                            if (a == 1) {

                                System.out.println("Вы взяли книгу: " + book.getName()
                                        + " | Автор: " + book.getAuthor() + " | ID: " + book.getId());

                                book.setInStock(false);
                                if (reader.getName().equals(reader.getName())) {
                                    book.setUser(reader);
                                }
                                serializable(bufferedReader);
                                break;

                            } else {
                                MenuSection(bufferedReader);
                            }
                        } else {
                            System.out.println("К сожилению данный время у нас нет это книга");
                            // вернутся на главный меню
                            while (true) {
                                System.out.println("\n1. Выйти на главный меню");
                                System.out.println("9. Выйти из программ");

                                int num1 = 0;
                                try {
                                    num1 = Integer.parseInt(bufferedReader.readLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Введите только цыфры пожалуйсто");
                                    continue;
                                }

                                if (num1 == 1) {
                                    MenuSection(bufferedReader);
                                } else if (num1 == 9) {
                                    outInSystem(bufferedReader);
                                } else {
                                    System.out.println("Введите цифры которые здесь есть");
                                    ;
                                }
                            }
                        }
                    }
                    System.out.println("У нас нет такого книга");
                }
            }else {
                System.out.println("У нас нет такого книгу");
                // вернутся на главный меню
                while (true) {
                    System.out.println("\n1. Выйти на главный меню");
                    System.out.println("9. Выйти из программ");

                    int num1 = 0;
                    try {
                        num1 = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите только цыфры пожалуйсто");
                        continue;
                    }

                    if (num1 == 1) {
                        MenuSection(bufferedReader);
                    } else if (num1 == 9) {
                        outInSystem(bufferedReader);
                    } else {
                        System.out.println("Введите цифры которые здесь есть");
                        ;
                    }
                }
            }


        }

        // вернутся на главный меню
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");

            int num1 = 0;
            try {
                num1 = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num1 == 1) {
                MenuSection(bufferedReader);
            } else if (num1 == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
                ;
            }
        }


    }


    //Вернуть книгу
    public static void returnbook(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        for (Reader reader : ListPerson) {

            System.out.println("\nПожалуйсто введите имя или автор книгу который вы хотите вернуть");
            String name = bufferedReader.readLine();
            int sum = 0;
            for (Book book1 : list) {
                if (book1.getName().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)") ||
                        book1.getAuthor().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)")) {
                    sum++;
                    System.out.println(sum + ". " + book1.getName()
                            + " | Автор: " + book1.getAuthor() + " | ID: " + book1.getId());

                }
            }
            if (sum>0) {
                System.out.println("\nПожалуйсто введите Id книгу который вы выбрали");
                int name1 = Integer.parseInt(bufferedReader.readLine());

                for (Book book : list) {
                    if (name1 == book.getId()) {
                        if (book.getUser().getName().equals(reader.getName())) {

                            if (book.getInStock() == false) {
                                System.out.println("Вы точно хотите вернуть эту книгу?");

                                int a = 0;


                                // вайл для проверка правильность  a
                                while (true) {
                                    System.out.println("1. Да\n2. Нет");

                                    try {
                                        a = Integer.parseInt(bufferedReader.readLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println("Введите только цифры");
                                        continue;
                                    }

                                    if (a == 1 || a == 2) {
                                        break;
                                    } else {
                                        System.out.println("Введите цифры которые есть здесь");
                                        continue;
                                    }

                                }

                                if (a == 1) {

                                    System.out.println("Вы вернули книгу: " + book.getName()
                                            + " | Автор: " + book.getAuthor() + " | ID: " + book.getId());

                                    book.setInStock(true);
                                    book.setUser(null);

                                    serializable(bufferedReader);

                                    break;

                                } else {
                                    MenuSection(bufferedReader);
                                }
                            } else {
                                System.out.println("Это не то книга который вы взяли");
                                // вернутся на главный меню
                                while (true) {
                                    System.out.println("\n1. Выйти на главный меню");
                                    System.out.println("9. Выйти из программ");

                                    int num1 = 0;
                                    try {
                                        num1 = Integer.parseInt(bufferedReader.readLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println("Введите только цыфры пожалуйсто");
                                        continue;
                                    }

                                    if (num1 == 1) {
                                        MenuSection(bufferedReader);
                                    } else if (num1 == 9) {
                                        outInSystem(bufferedReader);
                                    } else {
                                        System.out.println("Введите цифры которые здесь есть");
                                        ;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Эту книгу забрал: " + book.getUser().getName());

                            // вернуть на главный меню
                            while (true) {
                                System.out.println("\n1. Выйти на главный меню");
                                System.out.println("9. Выйти из программ");
                                int num = 0;
                                try {
                                    num = Integer.parseInt(bufferedReader.readLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Введите только цыфры пожалуйсто");
                                    continue;
                                }

                                if (num == 1) {
                                    MenuSection(bufferedReader);
                                } else if (num == 9) {
                                    outInSystem(bufferedReader);
                                } else {
                                    System.out.println("Введите цифры которые здесь есть");
                                }
                            }
                        }
                    } else {
                        System.out.println("Нет такого книга");
                    }
                }
            }else {
                System.out.println("У нас нет такого книга");
                // вернуть на главный меню
                while (true) {
                    System.out.println("\n1. Выйти на главный меню");
                    System.out.println("9. Выйти из программ");
                    int num = 0;
                    try {
                        num = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите только цыфры пожалуйсто");
                        continue;
                    }

                    if (num == 1) {
                        MenuSection(bufferedReader);
                    } else if (num == 9) {
                        outInSystem(bufferedReader);
                    } else {
                        System.out.println("Введите цифры которые здесь есть");
                    }
                }
            }
        }

        // вернуть на главный меню
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }
    }

    //Добавить книгу
    public static void addNewBook(BufferedReader bufferedReader) throws IOException, InterruptedException,
            ClassNotFoundException, NullPointerException {
        System.out.println("Вы точно хотите добавить книгу?");
        System.out.println("1. да\n2. нет");
        int num = Integer.parseInt(bufferedReader.readLine());
        if (num == 1) {
            System.out.println("Пожалуйсто введите имя книг");
            String name = bufferedReader.readLine();

            System.out.println("Введите автор книг");
            String author = bufferedReader.readLine();
            list.add(new Book(generateID(), name, author, true));

            serializable(bufferedReader);


        } else {
            MenuSection(bufferedReader);
        }

        // вернуть в главный меню
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num1 = 0;
            try {
                num1 = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num1 == 1) {
                MenuSection(bufferedReader);
            } else if (num1 == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }
    }

    //Учиник или учитель
    public static void studentOrTeacher(BufferedReader bufferedReader) throws IOException, InterruptedException, ClassNotFoundException {
        while (true) {
            System.out.println("Вы хотите добавить\n1. Учиника\n2. Учителя");
            int num;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Вы не ввели цифру");
                continue;
            }

            if (num == 1) {
                addNewStudent(bufferedReader);
            } else if (num == 2) {
                addNewTeacher(bufferedReader);
            } else {
                System.out.println("Ввы ввели другую цифру!!");
                continue;
            }

        }
    }

    //Добавить ученика
    public static void addNewStudent(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {
        System.out.println("Добавления ученика\n");
        System.out.println("Пожалуйсто введите имя нового студента");
        String name = bufferedReader.readLine();

        System.out.println("Введите логин нового студента ");
        String login = bufferedReader.readLine();

        System.out.println("Придумайте пароль для нового студента");
        String password = bufferedReader.readLine();

        Listreader.add(new Student(generateID(), name, login, password));

        serializableReader(bufferedReader);


        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }


    }

    //Добавить учителя
    public static void addNewTeacher(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {
        System.out.println("Добавления учителя\n");
        System.out.println("Пожалуйсто введите имя нового учителя");
        String name = bufferedReader.readLine();

        System.out.println("Введите логин нового учителя ");
        String login = bufferedReader.readLine();

        System.out.println("Придумайте пароль для нового учителя");
        String password = bufferedReader.readLine();

        Listreader.add(new Student(generateID(), name, login, password));
        serializableReader(bufferedReader);


        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num = 0;
            try {
                num = Integer.parseInt(bufferedReader.readLine());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num == 1) {
                MenuSection(bufferedReader);
            } else if (num == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }
    }


    //Сериализайия
    public static void serializable(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {

        FileOutputStream outputStream = new FileOutputStream("book");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(list);
        objectOutputStream.close();

        // вернуть в главный меню
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num1 = 0;
            try {
                num1 = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num1 == 1) {
                MenuSection(bufferedReader);
            } else if (num1 == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }

    }


    //сериализация читателя
    public static void serializableReader(BufferedReader bufferedReader) throws IOException, ClassNotFoundException, InterruptedException {
        FileOutputStream outputStream = new FileOutputStream("reader");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(Listreader);
        objectOutputStream.close();

        System.out.println("Успешно добавлена читатель");

        // вернуть в главный меню
        while (true) {
            System.out.println("\n1. Выйти на главный меню");
            System.out.println("9. Выйти из программ");
            int num1 = 0;
            try {
                num1 = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите только цыфры пожалуйсто");
                continue;
            }

            if (num1 == 1) {
                MenuSection(bufferedReader);
            } else if (num1 == 9) {
                outInSystem(bufferedReader);
            } else {
                System.out.println("Введите цифры которые здесь есть");
            }
        }

    }

    //Генерирует индивидуальную ID
    public static int generateID() {
        int c = 0;
        while (true) {
            c++;

            int id = (int) (Math.random() * 899) + 100;

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
        for (Reader reader : ListReader) {
            if (id == reader.getId()) {
                return false;
            }
        }
        return true;
    }
}
