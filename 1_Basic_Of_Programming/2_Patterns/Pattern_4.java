import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsps = 0;
        int nstr = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsps; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            nsps++;
            nstr--;
        }
    }
}
