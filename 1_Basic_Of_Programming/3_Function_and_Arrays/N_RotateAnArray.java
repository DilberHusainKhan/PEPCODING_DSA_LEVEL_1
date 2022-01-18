import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_RotateAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
      
      public static void reverse(int[] a, int low, int hi){
          while(low<=hi){
              int temp = a[low];
              a[low] = a[hi];
              a[hi] = temp;
              low++;
              hi--;
          }
        }
      public static void rotate(int[] a, int k){
        // write your code here
        k %=a.length;
        if(k<0){
            k +=a.length;
        }
        reverse(a, 0, a.length-1-k); //reverse number from start to k
        reverse(a, a.length-k, a.length-1); //reverse number from k to end
        reverse(a, 0, a.length-1); // reverse number from 0 to end.
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        rotate(a, k);
        display(a);
     }
}
