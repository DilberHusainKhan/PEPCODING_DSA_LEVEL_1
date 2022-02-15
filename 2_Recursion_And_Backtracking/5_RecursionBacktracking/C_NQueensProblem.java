import java.util.Scanner;

public class C_NQueensProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        // for(int i=0;i<chess.length;i++){
        //     for(int j=0;j<chess[0].length;j++){
        //         chess[i][j]=sc.nextInt();
        //     }
        // }
        printNQueen(chess,"", 0);
    }
    public static void printNQueen(int[][] chess, String asf, int row){
        if(row == chess.length){
            System.out.println(asf+".");
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(isItsSafeForQueen(chess,row,col) == true){
                chess[row][col] = 1;
                printNQueen(chess, asf+row+"-"+col+", ", row+1);  
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isItsSafeForQueen(int[][] chess, int row, int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){         //for top 
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j] ==1){
                return false;
            }
        }
        return true;
    }
}