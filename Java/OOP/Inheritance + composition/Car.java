// Superclass
class Vehicle {
    protected String brand;
    protected int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayVehicle() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

// "Part" Class
class Engine {
    private String engineType;
    public Engine(String engineType) { this.engineType = engineType; }
    public void display() { System.out.println("Engine Type: " + engineType); }
}

public class Car extends Vehicle { // Inheritance
    private String model;
    private Engine engine; // Composition

    public Car(String brand, int speed, String model, String engType) {
    
        // Call the superclass constructor
        super(brand, speed); 
        // Initialize the subclass attribute
        this.model = model;
        // Create the "part" object
        this.engine = new Engine(engType);
    }

    public void displayCarDetails() {
        super.displayVehicle(); // Call superclass method
        System.out.println("Model: " + model);
        engine.display(); // Display the "part"
    }
}
