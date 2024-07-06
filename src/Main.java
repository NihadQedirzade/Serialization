import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("Nihat", 19);
        student1.addkurs("Java");

        Student student2 = new Student("Sabir", 22);
        student2.addkurs("Frontend");
        student2.addkurs("Data Science");




        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student1);
        objectOutputStream.writeObject(student2);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);


        Book book = new Book("Java","Nick",2000);
        Book book1 = new Book("Javva","Nicksg",2008);
        FileOutputStream fileOutputStream1 = new FileOutputStream("book.txt");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
        objectOutputStream1.writeObject(book);
        objectOutputStream1.writeObject(book1);
        objectOutputStream1.close();
        fileOutputStream1.close();

        FileInputStream fileInputStream1 = new FileInputStream("book.txt");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        Book book2 = (Book) objectInputStream1.readObject();
        System.out.println(book2);

        }}
