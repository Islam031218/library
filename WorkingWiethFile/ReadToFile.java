package WorkingWiethFile;

import java.io.*;

public class ReadToFile {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream =new FileInputStream("MyEmployee");
            ObjectInputStream objectInputStream =new ObjectInputStream(inputStream);

            Employee employee=(Employee)objectInputStream.readObject();
            Employee employee2=(Employee)objectInputStream.readObject();

            System.out.println(employee);
            System.out.println(employee2);

            objectInputStream.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
