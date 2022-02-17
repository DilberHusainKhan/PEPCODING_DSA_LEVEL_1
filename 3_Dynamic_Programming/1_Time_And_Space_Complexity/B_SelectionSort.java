import java.util.Scanner;

public class B_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        display(arr);
    }
    public static void selectionSort(int[]  arr){
        for(int i=0;i<arr.length-1;i++){
            int mi = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mi] > arr[j]){
                    mi = j;
                }
            }
            swap(arr, i, mi);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
