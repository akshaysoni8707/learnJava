package Chapter7;

import java.io.*;

class worker extends person {
    double salary;

    public worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public worker() {
    }

    @Override
    public String toString() {
        return "worker{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class FileObjectHandlingInheritance {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        worker w = new worker("Akshay", 25, 12345);
        File f = new File("demoInheritObj.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(w);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(f);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        worker w1 = ( worker ) objectInputStream.readObject();
        System.out.println(w1.toString());
        objectInputStream.close();
        fileInputStream.close();
    }
}
