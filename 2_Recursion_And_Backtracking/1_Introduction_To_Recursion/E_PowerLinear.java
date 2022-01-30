import java.util.Scanner;

public class E_PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc .nextInt();
        int n = sc. nextInt();
        int result =  power(x,n);
        System.out.println(result);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;
        return (x*power(x,n-1));
    }
}
