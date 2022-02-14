import java.util.Scanner;

public class B_TargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSubset(arr,0,"",0,tar);
    }
    public static void printTargetSumSubset(int[] arr, int idx, String asf, int sos, int tar){
        if(sos>tar){
            return;
        }
        if(idx == arr.length){
            if(sos==tar){
                System.out.println(asf+".");
            }
            return;
        }
        printTargetSumSubset(arr, idx+1, asf+arr[idx]+", ", sos+arr[idx], tar); //include data
        printTargetSumSubset(arr, idx+1, asf, sos, tar);  //exclude data

    }
}
