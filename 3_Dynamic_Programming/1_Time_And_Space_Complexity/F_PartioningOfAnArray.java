import java.util.Scanner;

public class F_PartioningOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        partioningAnArray(arr,p);
        print(arr);
    }
    public static void partioningAnArray(int[] arr, int pivot){
        // 0 to j-1 for <= pivot
        // j to i-1 for > pivot
        // 0 to end unknown
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        System.out.println("swaping  value "+arr[i]+" and "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
