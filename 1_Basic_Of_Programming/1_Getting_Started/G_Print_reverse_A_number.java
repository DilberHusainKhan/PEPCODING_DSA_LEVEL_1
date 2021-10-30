import java.util.Scanner;

public class G_Print_reverse_A_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dig = N;
        while (dig > 0) {
            int rem = dig % 10;
            System.out.println(rem);
            dig /= 10;
        }
    }
}
