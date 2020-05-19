package Chapter3.OopsJava;

//OOPs
//Class is a template
//Object is an instance of class
//
//Class
//Objects
//Properties , field
//Constructor
//methods
//Inheritance
//Encapsulation
//Abstraction
//Polymorphism

public class SimpleClass {
    int id;
    String name;

    public static void main(String[] args) {
        SimpleClass s1 = new SimpleClass();
        s1.id = 12;
        s1.name = "Akshay";
        System.out.println("ID : "+ s1.id + " Name : " + s1.name);
    }
}
