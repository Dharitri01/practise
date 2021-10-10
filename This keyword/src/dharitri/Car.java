package dharitri;

public class Car {
    int limit;
    String name;
    Car(int limit, String name)//Parameterized constructor
    {
       this. limit= limit;//Variable hiding
       this. name=name;
    }
    void display()
    {


        System.out.println("Speed limit: "+limit);
        System.out.println("Car brand name: "+name);
    }
}
