package Chapter3.Packages;


class HiddenData{
    private String name;
private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        HiddenData h = new HiddenData();
        h.setName("Akshay");
        h.setAge(24);
        System.out.println("Hello " + h.getName() + " Age " + h.getAge());
    }
}
