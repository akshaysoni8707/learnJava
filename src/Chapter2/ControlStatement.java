package Chapter2;

public class ControlStatement {
    public static void main(String[] args) {
        int marks = 51;
        if(marks>=80 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>=50 && marks<=79){
            System.out.println("Grade B");
        }
        else if(marks>=35 && marks<=49){
            System.out.println("Grade PASS");
        }
        else{
            System.out.println("Grade FAIL");
        }

        int day = 5;
        switch (day){
            case 1:
                System.out.println("SUNDAY");
                break;
                case 2:
                System.out.println("MONDAY");
                break;
                case 3:
                System.out.println("TUESDAY");
                break;
                case 4:
                System.out.println("WEDNESDAY");
                break;
                case 5:
                System.out.println("THURSDAY");
                break;
                case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;

        }
    }
}
