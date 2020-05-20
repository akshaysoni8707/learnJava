package Chapter3.Inheritance.Aggregation;

class Address {
    String city, state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}


public class Person {
    String firstName, lastName;
    Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

}
