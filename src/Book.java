import java.io.Serializable;

public class Book implements Serializable {
    private String bookname;
    private String autor;
    private int year;

    public Book(String bookname, String autor, int year) {
        this.bookname = bookname;
        this.autor = autor;
        this.year = year;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                '}';
    }
}
