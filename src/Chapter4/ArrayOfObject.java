package Chapter4;

class user{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age + "\n";
    }

    public void allSet(String name, int age){
//        this.name = name;
//        this.age = age;
        setAge(age);
        setName(name);
    }
}


public class ArrayOfObject {
    public static void main(String[] args) {
        user[] u = new user[3];
        for (int i = 0; i < u.length ; i++) {
            u[i] = new user();
        }
        u[0].allSet("Akshay",25);
        u[1].allSet("Sumit",26);
        u[2].allSet("Soni",27);
//        for (int i = 0; i < u.length; i++) {
//            System.out.println(u[i].getName() + "  " + u[i].getAge());
//        }
        for (int i = 0; i < u.length; i++) {
            System.out.println(u[i].toString());
        }
    }
}
