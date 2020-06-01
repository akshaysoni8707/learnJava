package Chapter5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = 0;
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input enter age");
        }
        sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
//      String name = sc.next();
        String name = sc.nextLine();
        System.out.println(" My name is " + name + ". I am " + age + " year old.");
    }
}
