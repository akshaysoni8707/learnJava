package Chapter3.Polymorphism;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name ;
    }
}

class Employee extends Person {
    double salary;

    @Override
    public String toString() {
        return super.toString() +
                " salary=" + salary ;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Employee e = new Employee("Akshay",12000);
        System.out.println(e.toString());
    }
}
