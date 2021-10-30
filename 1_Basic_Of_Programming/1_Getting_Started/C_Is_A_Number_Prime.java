import java.util.Scanner;

public class C_Is_A_Number_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            boolean isPrime = true;
            int div = 2;
            while (div * div <= num) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
