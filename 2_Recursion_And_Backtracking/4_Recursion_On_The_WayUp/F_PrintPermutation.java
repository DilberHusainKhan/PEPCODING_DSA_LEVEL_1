import java.util.Scanner;

public class F_PrintPermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        printPermutation(str,"");
    }
    public static void printPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String strLeftPart = str.substring(0,i);
            String strRightPart = str.substring(i+1);
            String ros = strLeftPart+strRightPart;
            printPermutation(ros, ans+ch);
        }
    }
}
