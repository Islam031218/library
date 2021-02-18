package LibraryProject;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable {
    private List<Reader> readerList;
    private List<Book> readerBook;


    public Library(List<Reader> readerList, List<Book> readerBook) {
        this.readerList = readerList;
        this.readerBook = readerBook;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }

    public List<Book> getReaderBook() {
        return readerBook;
    }

    public void setReaderBook(List<Book> readerBook) {
        this.readerBook = readerBook;
    }
}
