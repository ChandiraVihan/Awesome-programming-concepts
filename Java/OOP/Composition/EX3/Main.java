import java.util.Scanner;


class Battery {
    private int capacity;
    public Battery(int capacity) { this.capacity = capacity; }
    public void display() { System.out.println("Battery Capacity: " + capacity + "mAh"); }
}

class Processor {
    private String model;
    public Processor(String model) { this.model = model; }
    public void display() { System.out.println("Processor Model: " + model); }
}


class Smartphone{
	private String brand;
	private Battery battery;
	private Processor processor;


 public Smartphone(String brand, int capacity, String processor){
 	this.brand = brand;
	this.battery = new Battery(capacity); 
	//this is a part of the while phone so the object battery will be created inside object smartphone

	this.processor = new Processor(processor); //same here 

	}

public void displayDetails (){
	System.out.println("Smartphone Brand: " + brand);
	battery.display();
	processor.display();
	}
}


public class Main{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your smartphone model");
	String brand = input.nextLine();

        System.out.print("Enter Battery Capacity (mAh): ");
        int capacity = input.nextInt();
        input.nextLine(); // Consume the remaining newline character after reading int

        System.out.print("Enter Processor Model: ");
        String processor = input.nextLine(); // Read processor model as a string

        // --- Create Smartphone Object ---
        Smartphone mySmartphone = new Smartphone(brand, capacity, processor);

        // --- Display Details ---
        System.out.println("\n--- Your Smartphone Details ---");
        mySmartphone.displayDetails();

        // --- Close the scanner ---
        input.close();
    }
}
