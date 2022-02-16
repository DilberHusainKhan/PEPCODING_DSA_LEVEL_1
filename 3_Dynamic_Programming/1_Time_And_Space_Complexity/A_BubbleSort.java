import java.util.Scanner;

public class A_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr);
        display(arr);
    }
    public static void bubbleSort(int[] arr){
        for(int itr =1;itr<=arr.length-1;itr++){
            System.out.println("---------------------Iteration "+itr+"---------------------");
            for(int j=0;j<arr.length-itr;j++){
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
        }
    }
    public static boolean isSmaller(int[] arr, int i,int j){
        System.out.println("Comparing "+arr[i]+" and "+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }
    public static void swap(int[] arr,int i, int j){
        System.out.println("Swapping "+arr[i]+" and "+arr[j]);
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
