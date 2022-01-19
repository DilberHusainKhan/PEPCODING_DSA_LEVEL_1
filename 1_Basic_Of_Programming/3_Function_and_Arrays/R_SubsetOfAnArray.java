import java.util.Scanner;

public class R_SubsetOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    
        int limit = (1<<n);
        for(int i=0;i<limit;i++){
            int dec = i;
            String str = "";
            for(int j=0;j<arr.length;j++){
                int rem = dec%2;
                dec /=2;

                if(rem == 0){
                    str = "_\t"+str;
                }else{
                    str = arr[arr.length-1-j]+"\t"+str;
                }    
            }
            System.out.println(str);
        }
    }
}
