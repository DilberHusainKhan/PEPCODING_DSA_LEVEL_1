import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n / 2;
        int nstr = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= (n / 2)) {
                nsp--;
                nstr += 2;
            } else {
                nsp++;
                nstr -= 2;
            }
        }
    }
}
