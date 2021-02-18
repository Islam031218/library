package LibraryProject;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private  String name;
    private  boolean inStock;
    private Reader user;
    private String author;

    public Book(int id, String name, String author , boolean inStock) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.inStock = inStock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    public Reader getUser() {
        return user;
    }

    public void setUser(Reader user) {
        this.user = user;
    }
}
