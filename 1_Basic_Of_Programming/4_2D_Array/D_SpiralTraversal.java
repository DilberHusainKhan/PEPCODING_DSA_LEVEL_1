import java.util.Scanner;

public class D_SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int minr =0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;

        int tnc = row*col;
        int cnt =0;

        while(cnt< tnc){
            //left wall 
            for(int i = minr, j=minc; i<=maxr && cnt<tnc;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall 
            for(int i=maxr,j=minc;j<=maxc && cnt<tnc;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // right wall
            for(int i=maxr,j=maxc;i>=minr && cnt<tnc;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall
            for(int i = minr,j= maxc; j>=minc && cnt<tnc;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        } 
    }
}
