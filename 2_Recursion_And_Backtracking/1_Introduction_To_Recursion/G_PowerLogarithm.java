import java.util.Scanner;

public class G_PowerLogarithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = poewerLogarithm(x, n);
        System.out.println(result);
    }
    public static int poewerLogarithm(int x, int n){
        if (n==0){
            return 1;
        }
        int xpbn2 = poewerLogarithm(x, n/2);
        int xn = xpbn2*xpbn2;
        if(n%2 ==1){
            xn = xn*x;
        }
        return xn;
    }
}
