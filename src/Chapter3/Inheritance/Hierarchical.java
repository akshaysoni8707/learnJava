package Chapter3.Inheritance;

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing....");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println("------- Cat -------");
        c.eat();
        c.meow();
    }
}
