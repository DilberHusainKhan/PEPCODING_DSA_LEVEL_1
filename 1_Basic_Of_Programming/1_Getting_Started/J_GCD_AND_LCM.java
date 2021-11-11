import java.util.Scanner;

public class J_GCD_AND_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int tn1, tn2;
        tn1 = n1;
        tn2 = n2;
        while (tn1 % tn2 != 0) {
            int r = tn1 % tn2;
            // agla divide kon karega ,
            tn1 = tn2;
            tn2 = r;
        }
        int gcd = tn2;
        int lcm = (n1 * n2) / gcd;
        // print lcm and gcd
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
