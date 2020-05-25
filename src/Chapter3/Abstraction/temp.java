package Chapter3.Abstraction;

class temp2 extends Method{
    @Override
    final void methodDemo() {
        System.out.println("I am Final");
    }
}
public class temp extends temp2 {
    public static void main(String[] args) {
        temp2 t = new temp2();
        t.methodDemo();
    }
    // Not possible
//    void methodDemo(){
//
//    }
}
