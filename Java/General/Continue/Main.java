public class Main {
        public static void main(String[] args) {
                for (int i = 0; i < 10; i++) {
                    if (i%2==0) //without Continue
                    System.out.print(i);
                    
                }
        System.out.println();
                for (int j = 0; j < 10; j++) {
                    if (j%2 ==0)
                    continue; //With continue print happens only when condition is false
                    System.out.print(j);

                }
        }
}
