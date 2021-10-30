import java.util.Scanner;

public class E_Count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int dig = N;
        int count =0;
        while(dig>0){
            dig /=10;
            count++;
        }
        System.out.println(count);
    }
}
