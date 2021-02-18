package LibraryProject;


import java.io.Serializable;

public class Student extends Reader implements Serializable {
    public Student(int id, String name, String login, String password) {
        super(id, name, login, password);
    }
}
