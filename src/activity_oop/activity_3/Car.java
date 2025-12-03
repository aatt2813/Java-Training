package activity_oop.activity_3;

public class Car {

    // 1 & 2. Attributes
    String brand;
    String model;
    int year;
    
    // 5–7. main: instantiate, assign values, call method
    public static void main(String[] args) {

        // Create Car using No-Args Constructor
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Vios";
        car1.year = 2020;

        // Create Car using Parameterized Constructor
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call method
        car1.displayInfo();
        car2.displayInfo();
    }

    // 4. No-Args Constructor
    Car() {
        // empty constructor
    }

    // 4. Parameterized Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 3. Method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("-----------------------");
    }
    
}
