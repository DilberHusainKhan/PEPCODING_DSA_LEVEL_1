import java.util.Scanner;

public class D_Fibonacci_Till_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int init = 0;
        int sec = 1;
        for (int i = 1; i <= N; i++) {
            System.out.println(init);
            int temp = sec + init;
            init = sec;
            sec = temp;
        }
    }
}
