package Chapter3.Polymorphism;

class Animal{
    void eat(){
        System.out.println("I am eating.");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("I am eating meat.");
    }
    void bark(){
        System.out.println("I am barking");
    }
}


public class Bindings {
    public static void main(String[] args) {
        //static Binding
        Animal a = new Animal();
        a.eat();
        //Dynamic Binding
        Animal d = new Dog(); //UpCasting
        d.eat();
    }
}
