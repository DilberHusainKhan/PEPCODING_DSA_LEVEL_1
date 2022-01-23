import java.util.Scanner;

public class G_RingRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        
        rotateShell(arr,s,r);
        display(arr);
    }
    // rotate
    public static void rotateShell(int[][] arr, int s, int r){
        int[] oned = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr, s,oned);
    }


    // fill 1D arr from shell
    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int sz = 2*((maxr-minr)+(maxc-minc));

        int[] oned = new int[sz];
        int idx =0;
        // left
        for(int i=minr, j=minc;i<=maxr;i++){
            oned[idx] = arr[i][j];
            idx++;
        }
        // bottom
        for(int i=maxr, j=minc+1;j<=maxc;j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        // right
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            oned[idx] = arr[i][j];
            idx++;
        }
        //top
        for(int i=minr, j=maxc-1;j>=minc+1;j--){
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }

    // rotate
    public static void rotate(int[] arr,int r){
        r = r%arr.length;
        if(r<0){
            r +=arr.length; 
        }
        reverse(arr, 0, arr.length -r-1);
        reverse(arr,arr.length -r,arr.length-1);
        reverse(arr, 0, arr.length -1);
    }
    // reverse
    public static void reverse(int[] oned , int li, int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }
    
    // fill shell  from 1D arr
    public static void fillShellFromOned(int[][] arr,int s, int[] oned){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int idx =0;
        // left
        for(int i=minr, j=minc;i<=maxr;i++){
            arr[i][j] = oned[idx];
            idx++;
        }
        // bottom
        for(int i=maxr, j=minc+1;j<=maxc;j++){
            arr[i][j] = oned[idx];
            idx++;
        }
        // right
        for(int i=maxr-1, j=maxc;i>=minr;i--){
            arr[i][j] = oned[idx];
            idx++;
        }
        //top
        for(int i=minr, j=maxc-1;j>=minc+1;j--){
            arr[i][j] = oned[idx];
            idx++;
        }
    }


    // display
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}