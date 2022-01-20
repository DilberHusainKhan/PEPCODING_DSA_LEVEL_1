import java.util.Scanner;

public class S_BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        int left =0;
        int right = arr.length;
        int floor =-1;
        int ceil =-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(data> arr[mid]){
                left = mid+1;
                floor = arr[mid];
            }else if(data< arr[mid]){
                right = mid -1;
                ceil = arr[mid];
            }else{
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
