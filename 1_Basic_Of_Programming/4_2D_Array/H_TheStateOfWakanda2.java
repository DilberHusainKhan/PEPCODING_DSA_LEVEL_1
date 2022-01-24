import java.util.Scanner;

public class H_TheStateOfWakanda2 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // since we have to take square matrix so we take only one length
        int[][] arr = new int[row][row];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        } 

        for(int g=0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
