import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){

                if(j==1 ||j==n||(i>=n/2+1 && (i==j||i+j==n+1))){
                    System.out.print("*\t");
                    // val--;
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
