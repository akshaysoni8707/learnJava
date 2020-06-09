package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class NameCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeCompare implements  Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class ComparatorComparableSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(2,"Vikas",24));
        employeeArrayList.add(new Employee(1,"Akshay",25));
        employeeArrayList.add(new Employee(3,"Sumit",23));

        for (Employee e : employeeArrayList) {
            System.out.println(e.toString());
        }

        Collections.sort(employeeArrayList);
        System.out.println("\n ------------- After Comparable Sorting -------------\n");

        for (Employee e : employeeArrayList) {
            System.out.println(e.toString());
        }

        NameCompare nameCompare = new NameCompare();
        Collections.sort(employeeArrayList,nameCompare);
        System.out.println("\n ------------- After name comparator Sorting -------------\n");

        for (Employee e : employeeArrayList) {
            System.out.println(e.toString());
        }

        AgeCompare ageCompare = new AgeCompare();
        Collections.sort(employeeArrayList,ageCompare);
        System.out.println("\n ------------- After age comparator Sorting -------------\n");

        for (Employee e : employeeArrayList) {
            System.out.println(e.toString());
        }
    }
}
