import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sps = n - 1; sps >= i; sps--) {
                System.out.print("\t");
            }
            for (int str = 1; str <= i; str++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
