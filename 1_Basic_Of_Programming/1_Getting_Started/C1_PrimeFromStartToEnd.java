import java.util.Scanner;

public class C1_PrimeFromStartToEnd {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
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
