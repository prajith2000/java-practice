//class : class is blueprint of object in java, object : object is instance of a class, constructor is a special method used to initialize objects, and constructor name shoild me same as class name.     
class Car {
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();  // Output: Brand: Toyota, Model: Corolla, Year: 2020
    }
}

