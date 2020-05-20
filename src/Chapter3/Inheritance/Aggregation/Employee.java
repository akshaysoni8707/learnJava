package Chapter3.Inheritance.Aggregation;

public class Employee {
    Person person;
    float salary;

    public Employee(Person person, float salary) {
        this.person = person;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Address a1 = new Address("Surat", "Gujarat");
        Address a2 = new Address("Navsari", "Gujarat");

        Person p1 = new Person("Akshay", "Soni", a1);
        Person p2 = new Person("Sumit", "More", a2);

        Employee e1 = new Employee(p1, 25000);
        Employee e2 = new Employee(p2, 30000);

        e1.display();
        e2.display();
    }

    void display() {
        System.out.println("First Name : " + this.person.firstName + " Last Name : " + this.person.lastName + " City Name : " + this.person.address.city + " State Name : " + this.person.address.state + " Salary : " + this.salary);
    }
}
