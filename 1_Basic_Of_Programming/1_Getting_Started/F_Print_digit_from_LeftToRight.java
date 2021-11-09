import java.util.Scanner;

public class F_Print_digit_from_LeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // find count digit
        int dig = N;
        int count = 0;
        while (dig > 0) {
            dig /= 10;
            count++;
        }

        // print number
        int mult = 1;
        for (int i = 1; i < count; i++) {
            mult *= 10;
        }
        dig = N;
        int rem;
        while (mult >= 1) {
            rem = dig % mult;
            dig /= mult;
            mult /= 10;
            System.out.println(dig);
            dig = rem;
        }
    }
}
