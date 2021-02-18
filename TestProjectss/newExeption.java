package TestProjectss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class newExeption {
//    public static void main(String[] args) {
//        исключения
//        ключивые слова try..catch
//        multi catch
//        класс Throwable
//        finally
//        throw, throws
//
//        try -поле для проверки исключения
//         catch->перехват
//
//        try {
//            int x = 5 / 0;
//        } catch (ArithmeticException r) {
//            System.out.println("на ноль делить нелъзя");
//        }
//        System.out.println("hello");
//
//
//        try {
//            demo.genExcertion();
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(" нет такой ячейка кароч!!!");
//        }
//
//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println(" я нашёл ошибку");
//        }
//        System.out.println("sdfh");
//
//
//        1 - задания
//        Перехватить исключение, возникающее при выполнении кода:
//        int a = 42 / 0;
//        Вывести на экран тип перехваченного исключения.
//
//
//        try {
//            int a = 42 / 0;
//        } catch (ArithmeticException a) {
//            System.out.println(" нельзя делить на ноль");
//        }
//
//
//        Задача 2
//        Перехватить исключение (и вывести его на экран),указав его тип, возникающее при выполнении кода:
//        String s = null;
//        String m = s.toLowerCase();
//
//        String s = null;
//        try {
//            String m = s.toLowerCase();
//        } catch (NullPointerException g) {
//            System.out.println(" нашёл метода ");
//        }
//
//        Задача 3
//        Перехватить исключение (и вывести его на экран),указав его тип, возникающее при выполнении кода:
//        int[] m = new int[2];
//        m[8] = 5;
//
//        int[] n = new int[2];
//        try {
//            n[8] = 5;
//        } catch (ArrayIndexOutOfBoundsException f) {
//            System.out.println(" 3- задания выполнена");
//        }
//
//
//        4 - задания
//        Перехватить исключение (и вывести его на экран, указав его тип),возникающее при выполнении кода:
//        ArrayList<String> list = new ArrayList<String>();
//        String s = list.get(18);
//
//        ArrayList<String> list = new ArrayList<>();
//        try {
//            String s = list.get(8);
//        } catch (IndexOutOfBoundsException s) {
//            System.out.println("4-задания выполнена");
//        }
//
//
//        Задача 5
//        Перехватить исключение (и вывести его на экран),указав его тип, возникающее при выполнении кода:
//        HashMap map = new HashMap(null);
//        map.put(null, null);
//        map.remove(null);
//
//
//        try {
//            HashMap map = new HashMap(null);
//            map.put(null, null);
//            map.remove(null);
//        } catch (NullPointerException d) {
//            System.out.println("5- задания выполнена");
//        }
//
//
//        6 - задания
//        Перехватить исключение (и вывести его на экран),указав его тип, возникающее при выполнении кода:
//        int num = Integer.parseInt("XYZ");
//        System.out.println(num);
//        try {
//            int num = Integer.parseInt("EFG");
//            System.out.println(num);
//        } catch (NumberFormatException f) {
//            System.out.println(" 6-задания выполнена");
//        }


//    }
//    public static void  readFile()throws FileNotFoundException{
//        File file=new File("bhjb");
//        Scanner scanner=new Scanner(file);
//    }


//class demo {
//    static void genExcertion() {
//       int[] number=new int[4];
//        System.out.println(number[10]);
//        int[] num1 = {4, 8, 16, 32, 64, 128, 615, 6156};
//        int[] num2 = {2, 0, 4, 4, 0, 8};
//        int i = 0;
//        for (int a : num1) {
//            try {
//                System.out.println(num1[i] + "/" + num2[i] + "=" + (num1[i] / num2[i]));
//            } catch (ArithmeticException w) {
//                System.out.println(" невозможный деления");
//            } catch (ArrayIndexOutOfBoundsException d) {
//                System.out.println("нет такой ячайк кароч!!!");
//            }catch (Throwable e){
//                System.out.println(" error!!!");
//            }
//
//            i++;
//        }
//
//    }
//}


    public static void main(String[] args) throws URISyntaxException {
//        Throw-> создание ошибки
        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        while (true) {
//
//            int x = scanner.nextInt();
//            if (x == 0) {
//                try {
//                    throw new ScannerException("пользовитель ввел ноль");
//                } catch (ScannerException e) {
//                    System.out.println(e.getMessage());
//                }
//
//            }
//
//
//        }
//        for (int i = 0; i < 3; i++) {
//            UseFinally.genExeptijn(i);
//        }


        //задании по multi catch
        //1-задания

//        try {
//            method1();
//        } catch (FileNotFoundException e) {
//            System.out.println("нашел FileNotFoundExeption");
//
//        } catch (NullPointerException e) {
//            System.out.println("нашел NullPointerExeption");
//        }
//
//    }
//    public  static  void  method1()throws NullPointerException, ArithmeticException,
//            FileNotFoundException, URISyntaxException{
//        int i=(int)(Math.random()*4);
//        System.out.print(i+" ");
//        if (i==0){
//            throw new NullPointerException();
//        }else if (i==1){
//            throw new ArithmeticException();
//        }else if (i==2){
//            throw new FileNotFoundException();
//        }else  if (i==3){
//            throw new URISyntaxException("","");
//        }
    }
}

// class UseFinally {
//    public static void genExeptijn(int num) {
//        int temp;
//        int[] numbers = new int[2];
//        System.out.println("получено: " + num);
//        try {
//            switch (num) {
//                case 0:
//                    temp = 10 / 0;
//                case 1:
//                    numbers[4] = 10;
//                case 2:
//                    return;
//
//
//            }
//        } catch (ArithmeticException e) {
//            System.out.println(" попытка деления на ноль");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за приделам массива");
//        } finally {
//            System.out.println(" поле finally");
//        }
//    }
// }

