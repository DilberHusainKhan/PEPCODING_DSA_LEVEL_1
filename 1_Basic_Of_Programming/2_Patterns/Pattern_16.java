import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstar =1;
        int nspace = 2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nstar;j++){
                System.out.print(j+"\t");
            }
            for(int j=1;j<=nspace;j++){
                System.out.print("\t");
            }
            if(i==n){
                nstar--;
            }
            for(int j=nstar;j>=1;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
            nstar++;
            nspace -=2;
            
        }
    }
}
