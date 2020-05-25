package Chapter3.Abstraction;
interface mainHidden{
    void method1();
    void method2();
    void method3();
    void method4();
}
abstract class level1 implements mainHidden{
    @Override
    public void method1(){
        System.out.println("Hello I am in " + getClass().getSimpleName());
    }
}

abstract class level2 extends level1{
    @Override
    public void method2(){
        System.out.println("Hello I am in " + getClass().getSimpleName());
    }
}
abstract class level3 extends level2{
    @Override
    public void method3(){
        System.out.println("Hello I am in " + getClass().getSimpleName());
    }
}

public class FinalAbstraction extends level3 {
    public static void main(String[] args) {
        mainHidden m = new FinalAbstraction();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
    @Override
    public void method4() {
        System.out.println("Hello I am in " + getClass().getSimpleName());
    }
}
