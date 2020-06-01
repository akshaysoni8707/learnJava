package Chapter5;

class ExceptionCall {
    int data = 0;
    Integer[] arrayInt = new Integer[5];

    int div(int a, int b) {
        int c = 1;
        try {
            c = a / b;
        } catch (Exception e) {
            c = 0;
            System.out.println("Cant divide by zero " + e);
        }
        finally {
            System.out.println("I will always run");
        }
        return c;
    }

    String NullPointerEx() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }

    int NumberFormatEx(String txt) {

        try {
            this.data = Integer.parseInt(txt);
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.data;
    }

    void ArrayEx() {
        arrayInt[0] = 20;
        arrayInt[3] = 31;
        for (int i = 0; i <= arrayInt.length; i++) {
            try {
                System.out.println(arrayInt[i] + 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    void ThrowAgeEx(){
        int age = 17;
        try {
            if(age>=18){
                System.out.println("You are eligible");
            }
            else{
                throw new AgeValidator("Not eligible");
            }
        }catch (AgeValidator a){
            System.out.println(a.getMessage());
        }
    }
}

class AgeValidator extends Exception{
    public AgeValidator(String msg){
        super(msg);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionCall ex = new ExceptionCall();
        System.out.println(ex.div(2, 0));
        System.out.println(ex.NullPointerEx());
        System.out.println(ex.NumberFormatEx("123A"));
        ex.ArrayEx();
        System.out.println("Hello");
        ex.ThrowAgeEx();
    }
}
