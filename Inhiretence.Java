// Parent class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Child class inheriting from the Vehicle class
class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand); // Call the parent class constructor
        this.year = year;
    }

    public void displayCarInfo() {
        displayInfo(); // Call the parent class method
        System.out.println("Year: " + year);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.displayCarInfo();
    }
}
