import java.util.Scanner;

public class L_DiffereceOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] one = new int[n1];
        for(int i=0;i<one.length;i++){
            one[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] second = new int[n2];
        for(int i=0;i<second.length;i++){
            second[i] = sc.nextInt();
        }
        
        int[] diff = new int[n2];
        int i=one.length - 1;
        int j=second.length - 1;
        int k = diff.length-1;

        int c = 0;
        while(k>=0){
            int d = second[j]-c;
            if(i>=0){
                d -=one[i];
            }
            if(d<0){
                d +=10;
                c=1;
            }else{
                // nothing to do with d
                c=0;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        // remove leading 0's from the result
        int idx =0;
        while(idx<diff.length){
            if(diff[idx]!= 0){
                break;
            }else{
                idx++;
            }
        }
        // print code
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
