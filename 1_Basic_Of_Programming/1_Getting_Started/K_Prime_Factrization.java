import java.util.Scanner;

public class K_Prime_Factrization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int f = 2; f * f <= n; f++) {
            while (n % f == 0) {
                System.out.print(f + "  ");
                n /= f;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}
