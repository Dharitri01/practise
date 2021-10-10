package dharitri;

public class Student {
    int id;
    String name;
    Address address;
    Student(int id, String name, Address address)
    {
        this.id= id;
        this.name=name;
        this.address=address;

    }

    void display()
    {
        System.out.println("Name of the Student: "+name);
        System.out.println("ID of the student: "+id);
        System.out.println("House number  of the student is: "+address.houseNumber);
        System.out.println("City: "+address.city);
    }
}
