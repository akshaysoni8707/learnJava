package Chapter5;

import java.util.Scanner;

class user {
    private String name;
    private int age;

    public user() {

    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ScanUser {
    public static void main(String[] args) {
        user u = new user();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        u.setAge(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        u.setName(sc.nextLine());
        System.out.println(u.toString());

        System.out.println("Enter name and age ");
        user q = new user(sc.nextLine(),sc.nextInt());
        System.out.println(q.toString());
    }
}
