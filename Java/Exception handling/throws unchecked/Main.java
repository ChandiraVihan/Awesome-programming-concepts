import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws ArithmeticException // in this case this does not works because this is an unchecked exception and it is a run time exception
	{
		Scanner input = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int x = input.nextInt();

	System.out.print("Enter a number : ");
	int y = input.nextInt();

	System.out.println("result = "+ (x / y));
	
	}
}