package Chapter1;

public class Variables {
    int data = 100; // instance variable
    static int count = 5;

    public static void main(String[] args) {
        int data = 200; // Local Variable
        Variables v = new Variables(); // Object declaration syntax -> new keyword
        System.out.println("Local variable data " + data);
        System.out.println("Instance variable data " + v.data);
        System.out.println("Static variable count" + count);
        count++;
        System.out.println("Static variable count" + v.count);
        System.out.println("Static variable count" + count);
    }
}
