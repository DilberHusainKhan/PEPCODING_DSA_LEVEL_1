import java.util.Scanner;

public class C_MaxOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int result = maxOfAnArray(arr,0);
        System.out.println(result);
    }
    public static int maxOfAnArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = maxOfAnArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
