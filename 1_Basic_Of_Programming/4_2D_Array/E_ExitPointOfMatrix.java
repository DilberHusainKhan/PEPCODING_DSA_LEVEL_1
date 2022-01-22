import java.util.Scanner;

public class E_ExitPointOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr =new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int dir =0; //0->east, 1->south, 2->west, 3->north
        int i = 0;
        int j = 0;
        while(true){
            dir = (dir+arr[i][j])%4;

            if(dir == 0){
                j++; //east
            }else if(dir ==1){
                i++; //south
            }else if(dir == 2){
                j--; //west
            }else if(dir == 3){
                i--; //north
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
