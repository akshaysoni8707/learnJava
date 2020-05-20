package Chapter3.Inheritance;

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping....");
    }
}


public class Multilevel {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        System.out.println("--------Baby Dog--------");
        b.eat();
        b.bark();
        b.weep();
    }
}
