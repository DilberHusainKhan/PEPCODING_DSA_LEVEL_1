import java.util.Scanner;

public class D_FirstIndexOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int result = firstIndex(arr,0,data);
        System.out.println(result); 
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            int fiisa = firstIndex(arr, idx+1, x);
            return fiisa;
        }
    }
}
