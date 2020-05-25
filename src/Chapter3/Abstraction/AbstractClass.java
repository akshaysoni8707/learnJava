package Chapter3.Abstraction;

abstract class Method {
    //No-body method
    abstract void methodDemo();

    void add(int a, int b) {
        System.out.println(" Add " + (a + b));
    }
}


public class AbstractClass extends Method {
    public static void main(String[] args) {
        Method m = new AbstractClass();
        m.methodDemo();
        m.add(12,3);
    }

    @Override
    final void methodDemo() {
        System.out.println(" I am in " + getClass().getSimpleName());
    }
}
