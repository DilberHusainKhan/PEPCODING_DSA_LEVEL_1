import java.util.Scanner;

public class I_FindAnElementInArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 
        int searchKey = sc.nextInt();
        
        int result = findNumber(arr,searchKey);
        System.out.println(result);
     }
        public static int findNumber(int[] arr, int n){
            int rv = -1;
            for(int i=0;i< arr.length;i++){
                if(n == arr[i]){
                    rv = i;
                    break;
                }
            }
            return rv;
        }
}
