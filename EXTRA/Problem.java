import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problem
{
	void solve(){
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];  
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        Arrays.sort(arr);
        int itr = 0;
        for(int i=0;i<n;i++){
            if(k-arr[i]<0){
                if(k>=(arr[i]/2+(arr[i]%2>0)))
                    itr++;
                break;
            }
            itr++;
            k -= arr[i];
        }
        System.out.println(itr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int t =sc.nextInt(); 
        for(int i=1;i<=t;i++){
            solve();
        }   
    }
}