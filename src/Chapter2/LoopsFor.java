package Chapter2;

public class LoopsFor {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            System.out.println("value " + i );
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==2 && j==2){
                    continue;
                }
                if(i==3 && j==1){
                    break;
                }
                System.out.println("Nested " + i +" " + j);
            }
        }
        int[] arr = {12,23,45,21};
        for (int i : arr) {
            System.out.println(" values " + i);
        }
    }
}
