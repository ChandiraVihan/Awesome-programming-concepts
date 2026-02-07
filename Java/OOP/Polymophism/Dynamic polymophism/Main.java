import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("3.Yacht");
		System.out.print("Select your choice : ");

		Vehicle vehicle;
		int choice = input.nextInt();

		Car car = new Car("Ferrari laferrari", "Red", 2015);
		Bike bike = new Bike("Kawasaki Ninja H2R", "Black", 2021);
		Yacht yacht = new Yacht("Eve", "White", 2023);

		switch (choice){
			case 1: 
			vehicle = new Car();
			car.info();
			break;

			case 2:
			vehicle = new Bike();
			bike.info();
			break;

			case 3:
			vehicle = new Yacht();
			yacht.info();
			break;

			default:
			vehicle = new Vehicle();
			System.out.println("Invalid Choice");
		}
}
}