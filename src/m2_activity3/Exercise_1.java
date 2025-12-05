package m2_activity3;

public class Exercise_1 {

    public static void main(String[] args) {

        // No-Args Constructor
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setColor("Silver");
        car1.setTransmission("Automatic");

        // Parameterized Constructor
        Car car2 = new Car("Subaru", "Forester", "White", "Automatic");

        // Call showCarInfo method
        car1.showCarInfo();
        car2.showCarInfo();
        
    }
	
}
