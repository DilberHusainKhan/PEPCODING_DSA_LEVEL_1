import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.println("*\t");
                    break;
                } else {
                    System.out.print("\t");
                }
            }
        }
    }
}
