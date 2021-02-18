package WorkingWiethFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WritenToFiles {
    public static void main(String[] args) {
        Employee employee=new Employee("Иван",500);
        Employee employee2=new Employee("Василий",400);
        Employee employee3=new Employee("Антон",800);

        try {
            FileOutputStream outputStream =new FileOutputStream("MyEmployee");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);


            objectOutputStream.writeObject(employee);
            objectOutputStream.writeObject(employee2);

            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
