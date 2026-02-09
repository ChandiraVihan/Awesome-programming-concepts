
//import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num;

//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter a number between 1 and 10: ");
//             num = input.nextInt();

//             if (num >= 1 && num <= 10) {
//                 System.out.println(num + " is between 1 and 10");
//             } else {
//                 System.out.println(num + " is not between 1 and 10");
//             }
//         }
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        for (int i = 0; i < 10; i++) {
            number = input.nextInt();
            System.out.println(number + " is between 1 and 10");
        }
    }
}
