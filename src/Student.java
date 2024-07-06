import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String ad;
    private int yas;
    private List<String> kursalar;

    public Student(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
        this.kursalar = new ArrayList<>();
    }

    public void addkurs(String kurs) {
        this.kursalar.add(kurs);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", kursalar=" + kursalar +
                '}';
    }
}


