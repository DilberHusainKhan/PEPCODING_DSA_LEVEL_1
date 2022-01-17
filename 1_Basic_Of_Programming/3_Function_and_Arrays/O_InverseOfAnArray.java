import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_InverseOfAnArray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0;i< a.length;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] inv = inverse(a); 
        display(inv);
    }
    public static int[] inverse(int[] a){
        int[] inv = new int[a.length];
        for(int i=0;i< a.length;i++){
        inv[a[i]] = i;
        }
        return inv;
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val : a){
            sb.append(val+"\n");
        }
        System.out.println(sb);
    }
}
