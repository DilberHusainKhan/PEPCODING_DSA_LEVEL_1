import java.util.Scanner;

public class G_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
    public static void quickSort(int[] arr,int lo,int hi){
        if(lo>= hi){
            return;
        }

        int pivot = arr[hi];
        int pi = partioningAnArray(arr,pivot,lo,hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi+1, hi);
    }
    public static int partioningAnArray(int[] arr,int pivot,int lo,int hi){
        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        System.out.println("pivot index -->"+(j-1));
        return j-1;
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
