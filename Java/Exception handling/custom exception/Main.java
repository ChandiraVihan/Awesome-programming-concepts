import java.util.Scanner;

public class Main{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter your age : ");
	int age = input.nextInt();

	try {
		checkAge(age);
	}
	catch (Exception e){
		System.out.println("ERROR!! "+e);
	}
	}

	 static void checkAge(int age) throws AgeException{
		if (age < 10){
			throw new AgeException("\n"+ " You must be 18+ to sign up !");
		}
		else
		System.out.println("You Sighned Up Successfully !");
	}

}