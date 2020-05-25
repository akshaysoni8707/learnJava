package Chapter3.Abstraction;

interface PureAbstract1 {
    void method1();

    int subtract(int a, int b);
}

interface PureAbstract2 {
    void method1();

    int subtract(int a, int b);
}

public class InterfaceClass implements PureAbstract1, PureAbstract2 {
    public static void main(String[] args) {
        PureAbstract1 p1 = new InterfaceClass();
        p1.method1();
        System.out.println(p1.subtract(6, 3));
        PureAbstract2 p2 = new InterfaceClass();
        p2.method1();
        System.out.println(p2.subtract(7, 2));
    }
    @Override
    public void method1() {
        System.out.println(" I am in " + getClass().getSimpleName());
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
