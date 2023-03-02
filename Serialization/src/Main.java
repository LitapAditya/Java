import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("SPAM", 100);

        File file = new File("Object Storage.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        fileOutputStream.close();
        objectOutputStream.close();

//        File file = new File("Object Storage.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1);
        fileInputStream.close();
        objectInputStream.close();
    }
}