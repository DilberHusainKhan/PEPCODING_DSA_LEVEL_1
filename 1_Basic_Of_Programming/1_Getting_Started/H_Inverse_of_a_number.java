import java.util.Scanner;

public class H_Inverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int inv = 0;
        while (n > 0) {
            int r = n % 10;
            int q = n / 10;
            n = q;
            inv = inv + p * (int) Math.pow(10, r - 1);
            p++;
        }
        System.out.println(inv);
    }
}
