import java.util.Scanner;

public class I_SaddlePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int [n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // main code for problem
        for(int i=0;i<arr.length;i++){
            int svj =0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){          //to find minimum value of j in the column.
                    svj =j;
                }
            }
            boolean flag =true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][svj]>arr[i][svj]){        //to find the maximum number of value in the row. 
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
