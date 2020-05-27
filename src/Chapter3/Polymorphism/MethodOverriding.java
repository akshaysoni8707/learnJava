package Chapter3.Polymorphism;

class Car {
    void speed() {
        System.out.println("I am fast. ");
    }
}

class BMW extends Car {
    @Override
    void speed() {
        super.speed();
        System.out.println("I am very fast. ");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.speed();
    }
}
