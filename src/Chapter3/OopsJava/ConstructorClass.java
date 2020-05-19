package Chapter3.OopsJava;

class Person {
    String name;
    int age;

    public Person() {
        this.age = 25;
        this.name = "Akshay";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name :" + this.name + " Age : " + this.age);
    }

}

public class ConstructorClass {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("Chinmay", 24);
//        System.out.println("Name : " + p.name + " Age : " + p.age);
//        System.out.println("Name : " + p1.name + " Age : " + p1.age);
        p.display();
        p1.display();
    }
}
