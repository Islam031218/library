package TestProjectss;

public class newStackTrace {
//    public static void main(String[] args) {
//        //Stack / StackTrace / Exeption / try///cetch//finally
//        method1();
//
//    }
////
//    public static void method1() {
//        method2();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//
//    }
////
//    public static void method2() {
//        method3();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//
//    }
////
//    public static void method3() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getClassLoaderName());
//        }
////        System.out.println();
//    }






//    Задача 1
//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать свой StackTrace.

//    public static void main(String[] args) {
//        //Stack / StackTrace / Exeption / try///cetch//finally
//        method1();
//
//
//
//    }
//
//    public static StackTraceElement[] method1() {
//        method2();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    }
//
//    public static StackTraceElement[] method2() {
//        method3();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    }
//
//    public static StackTraceElement[] method3() {
//        method4();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    }
//    public static StackTraceElement[] method4() {
//        method5();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    } public static StackTraceElement[] method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    }



//    Задача 2
//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью
//StackTrace.

//    public static void main(String[] args) {
//        //Stack / StackTrace / Exeption / try///cetch//finally
//        method1();
//
//
//
//    }
//
//    public static StackTraceElement[] method1() {
//        method2();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        String name=stackTraceElements[2].getMethodName();
//        String name2=stackTraceElements[1].getMethodName();
//        int name3=stackTraceElements[1].getLineNumber();
//        System.out.println(name2+": "+name3);
//        System.out.println(name2+" "+name);
//        return stackTraceElements;
//
//    }
//
//    public static StackTraceElement[] method2() {
//        method3();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        String name=stackTraceElements[2].getMethodName();
//        String name2=stackTraceElements[1].getMethodName();
//        int name3=stackTraceElements[1].getLineNumber();
//        System.out.println(name2+": "+name3);
//        System.out.println(name2+" "+name);
//        return stackTraceElements;
//
//    }
//
//    public static StackTraceElement[] method3() {
//        method4();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        String name=stackTraceElements[2].getMethodName();
//        String name2=stackTraceElements[1].getMethodName();
//        int name3=stackTraceElements[1].getLineNumber();
//        System.out.println(name2+": "+name3);
//        System.out.println(name2+" "+name);
//        return stackTraceElements;
//
//    }
//    public static StackTraceElement[] method4() {
//        method5();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        String name=stackTraceElements[2].getMethodName();
//        String name2=stackTraceElements[1].getMethodName();
//        int name3=stackTraceElements[1].getLineNumber();
//        System.out.println(name2+": "+name3);
//        System.out.println(name2+" "+name);
//        return stackTraceElements;
//
//    } public static StackTraceElement[] method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        String name=stackTraceElements[2].getMethodName();
//        String name2=stackTraceElements[1].getMethodName();
//        int name3=stackTraceElements[1].getLineNumber();
//        System.out.println(name2+": "+name3);
//        System.out.println(name2+" "+name);
//        return stackTraceElements;
//
//    }


//    Задача 3
//Написать пять методов, которые вызывают друг друга.
//Метод должен вернуть номер строки кода, из которого вызвали этот метод.
//Воспользуйся функцией: element.getLineNumber().


        public static void main(String[] args) {
        //Stack / StackTrace / Exeption / try///cetch//finally
        method1();



    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println();
        String name=stackTraceElements[2].getMethodName();
        String name2=stackTraceElements[1].getMethodName();
        int name3=stackTraceElements[1].getLineNumber();
        System.out.println(name2+": "+name3);
        System.out.println(name2+" "+name);
        return stackTraceElements;

    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println();
        String name=stackTraceElements[2].getMethodName();
        String name2=stackTraceElements[1].getMethodName();
        int name3=stackTraceElements[1].getLineNumber();
        System.out.println(name2+": "+name3);
        System.out.println(name2+" "+name);
        return stackTraceElements;

    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println();
        String name=stackTraceElements[2].getMethodName();
        String name2=stackTraceElements[1].getMethodName();
        int name3=stackTraceElements[1].getLineNumber();
        System.out.println(name2+": "+name3);
        System.out.println(name2+" "+name);
        return stackTraceElements;

    }
    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println();
        String name=stackTraceElements[2].getMethodName();
        String name2=stackTraceElements[1].getMethodName();
        int name3=stackTraceElements[1].getLineNumber();
        System.out.println(name2+": "+name3);
        System.out.println(name2+" "+name);
        return stackTraceElements;

    } public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        System.out.println();
        String name=stackTraceElements[2].getMethodName();
        String name2=stackTraceElements[1].getMethodName();
        int name3=stackTraceElements[1].getLineNumber();
        System.out.println(name2+": "+name3);
        System.out.println(name2+" "+name);
        return stackTraceElements;

    }
}
