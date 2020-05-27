package Chapter3.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add(12, 45);
        m.add(12.6, 15.4);
        m.add(12,45,98);
    }

    public void add(int a, int b) {
        System.out.println("Addition is " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Addition is " + (a + b));
    }

    public void add(int x,int y,int z){
        System.out.println("Addition is " + (x+y+z));
    }
}
