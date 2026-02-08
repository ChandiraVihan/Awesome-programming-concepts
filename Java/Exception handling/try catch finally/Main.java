import  java.util.Scanner;

public class Main{
	public static void main(String[] args){

    Scanner input = new Scanner(System.in);

	try{
	System.out.print("Enter a number : ");
	int x = input.nextInt();

	System.out.print("Enter a number : ");
	int y = input.nextInt();

	System.out.println("result = "+ (x / y));
	}
	catch (Exception e){
		System.out.println("Cannot divide by zero");
	}
	finally{
		System.out.println("This finally block will run no matter what");
	}
}
}