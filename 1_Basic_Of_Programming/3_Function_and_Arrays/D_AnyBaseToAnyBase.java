import java.util.Scanner;

public class D_AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sourceBase = sc.nextInt();
        int destBase = sc.nextInt();

        int result = getValueInDecimal(n, sourceBase,destBase);
        System.out.println(result);
    }
    public static int getValueInDecimal(int n, int s, int d){
        int rv =0;
        int p=1;
        while(n>0){
            int dig = n%10;
            n/=10;
            rv  += dig*p;
            p *= s; 
        }
        rv = getValueInDest(rv,d);
        return rv;
    }
    public static int getValueInDest(int n, int base){
        int rv =0;
        int p =1;
        while(n>0){
            int dig  = n%base;
            n /=base;
            rv+= dig*p;
            p*= 10;
        }
        return rv;
    }
}
