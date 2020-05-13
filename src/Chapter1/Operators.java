package Chapter1;

public class Operators {
    int a = 6,b= 2;
//    Arithmetic     +  -  *  /  %  ++  --
//    Assignment     =  +=  -=  *=  /=  %=
//    Relational     ==  !=  >  <  >=  <=
//    Logical        &&  ||  !
//    Ternary        (cond.) ? true : false ;
    public static void main(String[] args) {
        Operators op = new Operators();
        int a = 9 ,b = 7;
        System.out.println("a + b " + (a+b));
        System.out.println("a - b " + (a-b));
        System.out.println("a * b " + a*b);
        System.out.println("a / b " + a/b);
        System.out.println("a % b " + a%b);
        System.out.println("--------------INSTANCE--------------");
        System.out.println("a + b " + (op.a+op.b));
        System.out.println("a - b " + (op.a-op.b));
        System.out.println("a * b " + op.a*op.b);
        System.out.println("a / b " + op.a/op.b);
        System.out.println("a % b " + op.a%op.b);
        System.out.println("--------------Assignment--------------");
        System.out.println("a + 5 " + (a+=5));
        System.out.println("a - 5 " + (a-=5));
        System.out.println("a * 5 " + (a*=5));
        System.out.println("a / 5 " + (a/=5));
        System.out.println("a % 5 " + (a%=5));
        System.out.println("--------------Relational--------------");
        System.out.println("a > b " + (a>b));
        System.out.println("a < b " + (a<b));
        System.out.println("a == b " + (a==b));
        System.out.println("a != b " + (a!=b));
        System.out.println("a >= b " + (a>=b));
        System.out.println("a <= b " + (a<=b));
        System.out.println("--------------Logical--------------");
        System.out.println("10 < 5 && 10 < 20  " + (10 < 5 && 10 < 20));
        System.out.println("10 < 5 || 10 < 20  " + (10 < 5 || 10 < 20));
        System.out.println("--------------Ternary--------------");
        int max;
        max = (a>b)? a : b;
        System.out.println("max value is " + max);
    }
}


