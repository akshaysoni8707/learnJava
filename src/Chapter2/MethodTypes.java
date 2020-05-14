package Chapter2;

public class MethodTypes {
    // without param without return
    public static void add(){
        int a = 5, b = 6;
        System.out.println(" ADD " + (a+b));
    }
    // without param with return
    public static int sub(){
        int a = 6, b = 4;
        return a-b;
    }
    // with param without return
    public static void mul(int a,int b){
        System.out.println(" MUL " + (a*b));
    }
    // with param with return
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        add();
        System.out.println(" SUB " + sub());
        mul(3,4);
        System.out.println(" DIV " + div(8,2));
    }
}
