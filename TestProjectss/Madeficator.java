package TestProjectss;

public class Madeficator {
    public static void main(String[] args) {
        //public
//        private
//        protected
//        default// по умолчанию
//        static

        Man person =new Man();
        person.getName("sdg");
        person.setAge(15);


        person.getInfo();



    }
}
class Man {
    private String name;
    private int age;

    public String getName(String sdg) {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("error");
        } else {
            this.age = age;
        }
    }

    void getInfo() {
        System.out.println(" my name is: " + name + "and, i am " + age);
    }
}
