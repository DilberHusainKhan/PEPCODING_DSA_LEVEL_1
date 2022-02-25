import java.util.Scanner;

public class L_Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }  
        sort01(arr);
        print(arr);
    }
    public static void sort01(int[] arr){
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]==1){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
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
