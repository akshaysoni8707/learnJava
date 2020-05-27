package Chapter3.Packages;

/*
 * Access Specifier    within class      within package      outside package by subclass/ child       outside package
 *     Private              Y                  N                           N                               N
 *     Default              Y                  Y                           N                               N
 *     Protected            Y                  Y                           Y                               N
 *     Public               Y                  Y                           Y                               Y
 **/

public class first {
    protected int b;
    private int a;

    public static void main(String[] args) {
        first f = new first();
        f.a = 20;
        f.b = 10;
        f.methodPublic();
        f.methodProtected();
        f.methodPrivate();
    }

    public void methodPublic() {
        methodPrivate();
        System.out.println("I am Public in " + getClass().getSimpleName());
    }

    final protected void methodProtected() {
        System.out.println("I am Protected in " + getClass().getSimpleName());
    }

    private void methodPrivate() {
        System.out.println("I am Private in " + getClass().getSimpleName());
    }

}
