//package Aggregation;
class Address{
    String Houseno;
    String city;
    String country;

    public Address(String Houseno, String city, String country){
        this.Houseno = Houseno;
        this.city = city;
        this.country = country;
    }
}

class Employee{
    String name;
    Address address;

    public Employee(String name, Address address){
        this.name = name;
        this.address = address;

    }
    public void display(){
        System.out.println(this.name);
        System.out.println(address.Houseno + " " + address.city + " " + address.country);

    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address a1 = new Address("123", "Kalyani", "IND");
        Employee e1 = new Employee("Apurva", a1);

        e1.display();
    }
}

// Output:
// Apurva
// 123 Kalyani IND
