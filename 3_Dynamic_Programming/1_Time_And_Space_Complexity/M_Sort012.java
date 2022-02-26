import java.util.Scanner;

public class M_Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 
        sort012(arr);
        print(arr);
    }
    public static void sort012(int[] arr){
        int i=0;
        int j =0;
        int k = arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(arr,i,k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
    public static void print(int[]  arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
