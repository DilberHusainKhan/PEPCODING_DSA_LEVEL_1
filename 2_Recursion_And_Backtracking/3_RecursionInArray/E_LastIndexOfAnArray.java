import java.util.Scanner;

public class E_LastIndexOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int result = lastIndex(arr, 0,data);
        System.out.println(result);
    }   
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastIndex(arr, idx+1, x);
        if(liisa == -1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
}
