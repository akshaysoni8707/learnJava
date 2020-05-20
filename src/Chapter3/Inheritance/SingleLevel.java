package Chapter3.Inheritance;


class Animal {
    void eat() {
        System.out.println("Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking....");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println("----------Animal----------");
        a.eat();
        System.out.println("----------Dog----------");
        d.bark();
        d.eat();
    }
}
