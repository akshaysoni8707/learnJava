package Chapter7;

import java.io.*;

class person implements Serializable {
    public static final long serialVersionUID = 1L;
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class FileObjectHandling {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        person p1 = new person("Akshay", 25);
        person p2 = new person("Sumit", 26);
        File f = new File("demoObj.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(f);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(p1);
//        objectOutputStream.writeObject(p2);
//        objectOutputStream.close();
//        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(f);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        person p3 = ( person ) objectInputStream.readObject();
        person p4 = ( person ) objectInputStream.readObject();
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        objectInputStream.close();
        fileInputStream.close();
    }
}
