import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int p1 = 1;
        int p2 = 1;
        int sum =0;

        for (int i = 0; i < num-2; i++) {
            sum = p1 + p2;
            p1 = p2;
            p2 = sum;   
        }
        System.out.println("SUM = "+(sum == 0 ? 1 : sum));
    }
}
