import java.util.Scanner;

public class I_Rotate_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // find number of digit
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        // rotate the digit
        k %= nod;
        if (k < 0) {
            k += nod;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }
        int q = n / div;
        int r = n % div;
        int ans = r * mult + q; // rotated ans
        System.out.println(ans);
    }
}
