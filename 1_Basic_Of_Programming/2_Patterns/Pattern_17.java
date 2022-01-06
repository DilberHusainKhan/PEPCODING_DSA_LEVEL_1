import java.util.Scanner;

class Pattern_17{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n= sc .nextInt();
        int nsp =n/2;
        int nstr = 1;
        for(int i = 1;i<=n;i++){
            if(i<=n/2){
                for(int j=0;j<nsp;j++){
                    System.out.print("\t");
                }
                for(int j=0;j<nstr;j++){
                    System.out.print("*\t");
                }

                nstr++;
            }
            else if(i==(n/2+1)){
                for(int j=0;j<n/2;j++){
                    System.out.print("*\t");
                }
                for(int j=0;j<nstr;j++){
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=0;j<nsp;j++){
                    System.out.print("\t");
                }
                for(int j=nstr;j>1;j--){
                    System.out.print("*\t");
                }
                nstr--;
            }
            System.out.println();
        }
    }
}