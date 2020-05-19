package Chapter3.OopsJava;

class Student {
    int id;
    String name;
}

public class OutsideMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 21;
        s1.name = "Akshay";
        System.out.println("ID : " + s1.id + " Name : " + s1.name);

    }
}
