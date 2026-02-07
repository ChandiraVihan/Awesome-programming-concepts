import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SayHI();
        Scanner input = new Scanner(System.in);
        String ur_name = input.nextLine();
        SayHI(ur_name);
        String name = input.next();
        SayHII(name);
    }

    public static void SayHI(){
        System.out.println("Hi can you spell your name??");
    }

    public static void SayHI(String x){
        System.out.println("How u doing " + x);
    }

    public static String SayHII(String y){
        return "I hope you are doing great" + y; // by return as a string we can store name and manipulate it
    }
}