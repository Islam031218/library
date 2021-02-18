package LibraryProject;

import java.io.Serializable;

public class Teacher extends Reader implements Serializable {

    public Teacher(int id, String name, String login, String password) {
        super(id, name, login, password);
    }
}
