import java.util.Scanner;

public class C_AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int result = getValueInDecimal(n,b);
        System.out.println(result);
    }
    public static int getValueInDecimal(int n, int b){
        int rv = 0;
        int p =1;
        while(n>0){
            int dig = n%10;
            n/=10;
            rv += dig*p;
            p = p*b;
        }
        return rv;
    }
}
