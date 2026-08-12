package oops_1;

public class Car {
    String model;
    String engineType;
    double topSpeed;
    public static void main()
    {
        Car car;
        car=new Car("s-class","petrol",122.22);
        car.displayspecs();

    }
    Car(String model,String engineType,double topSpeed)
    {
        this.model=model;
        this.engineType=engineType;
        this.topSpeed=topSpeed;

    }
    void displayspecs()
    {
        System.out.println(this.model);
        System.out.println(this.engineType);
        System.out.println(this.topSpeed);

    }
}
