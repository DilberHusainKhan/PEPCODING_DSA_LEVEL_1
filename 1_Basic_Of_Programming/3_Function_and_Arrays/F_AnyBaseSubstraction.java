import java.util.Scanner;

public class F_AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = getSubValue(b,n1,n2);
        System.out.println(result);
    }
    public static int getSubValue(int b,int n1, int n2){
        int rv = 0;  //return value
        int c = 0;  //carry means (-ve)borrow 
        int p = 1;  // power

        while(n1>0){
            int d1 = n1%10;
            n1 /= 10;
            int d2 = n2%10;
            n2 /=10;
            int d=0;
            d2 = d2 +c;
            
            // main code for sub
            if(d1>=d2){
                c = 0;
                d = d1 - d2;
            }else{
                c = -1;
                d = d1 + b - d2;
            }
            rv += d*p;
            p *=10;
        }
        return rv; 
    }
}
