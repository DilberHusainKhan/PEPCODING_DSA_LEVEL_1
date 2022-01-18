import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_BinarySearch {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        
        int data = Integer.parseInt(br.readLine());
        int low = 0;
        int hi = a.length -1;
        int foundAt =-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(data>a[mid]){
                low = mid+1;
            }else if(data<a[mid]){
                hi = mid-1;
            }else{
                foundAt = mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
