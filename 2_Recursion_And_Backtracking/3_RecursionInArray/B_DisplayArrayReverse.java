import java.util.Scanner;

public class B_DisplayArrayReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        displayArrayReverse(arr,0);
    }
    public static void displayArrayReverse(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        displayArrayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
} 