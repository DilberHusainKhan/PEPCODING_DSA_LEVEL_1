import java.util.Scanner;

public class E_MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        int[] res = mergeSort(arr,0,arr.length-1);
        print(res);
         
    }
    public static int[] mergeSort(int[] a, int lo, int hi){
        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = a[lo];
            return ba;
        }
        int mid = (lo+hi)/2;
        int[] fsh = mergeSort(a, lo, mid);
        int[] ssh = mergeSort(a, mid+1, hi);
        int[] fsa = mergeTwoArray(fsh,ssh);        
        return fsa;
    }
    public static int[] mergeTwoArray(int[] a, int[] b){
        System.out.println("Merging These Two Array");
        System.out.println("Left Array -->");
        print(a);
        System.out.println("Right Array-->");
        print(b);
        
        int i=0;
        int j=0;
        int k=0;
        int[] res = new int[a.length+b.length];

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }else{
                res[k] = b[j];
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
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
    public static void print(int[] res){
        System.out.println("Final Result");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+"\t");
        }
        System.out.println();
    }
}
