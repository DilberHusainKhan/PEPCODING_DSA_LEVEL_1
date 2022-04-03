import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int n2 = sc.nextInt();
        primeNumber(n,n2); 
    }

    public static void primeNumber(int low, int high){
        for(int i=low;i<=high;i++){
            int div = 2;
            boolean isPrime = true;
            while(div*div <=i){
                if(i%div == 0){
                    isPrime=false;
                    break;
                }
                div++;
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
