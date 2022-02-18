import java.util.Scanner;

public class D_MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2= new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] result = mergeTwoSortArray(arr1,arr2); 
        display(result);
    }
    public static int[] mergeTwoSortArray(int[] a,int[] b){
        int i=0;
        int j=0;
        int k=0;
        int[] res = new int[a.length+b.length];
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                res[k]= a[i];
                i++;
                k++;
            }else{
                res[k]= b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k]=b[j];
            j++;
            k++; 
        }
        return res;
    }
    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
