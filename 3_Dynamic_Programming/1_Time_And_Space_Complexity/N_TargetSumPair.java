import java.util.Arrays;
import java.util.Scanner;

public class N_TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        targetSumPair(arr,target);
    }

    public static void targetSumPair(int[] arr,int target){
        // 1:- sort an array
        Arrays.sort(arr);
        // main code
        int li =0;
        int ri = arr.length-1;
        while(li<ri){
            if(arr[li]+arr[ri]<target){
                li++;
            }else if(arr[li]+arr[ri]> target){
                ri--;
            }else{
                System.out.println(arr[li]+", "+arr[ri]+" = "+target);
                li++;
                ri--;
            }
        }
    }
}
