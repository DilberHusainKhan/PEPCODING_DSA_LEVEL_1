import java.util.Scanner;

public class I_PrintAllPremutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        solution(st);
    }
    public static int fact(int val){
        int n=1;
        for(int i=2;i<=val;i++){
            n *=i;
        }
        return n;
    } 
    public static void solution(String str){
        int n = str.length();
        int f = fact(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div =n;div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
}
