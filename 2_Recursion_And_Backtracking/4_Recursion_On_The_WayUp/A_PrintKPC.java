import java.util.Scanner;

public class A_PrintKPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str,"");
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        String codeForCh = codes[ch-'0'];
        
        for(int i=0;i<codeForCh.length();i++){
            char chcode = codeForCh.charAt(i);
            printKPC(ros, ans+chcode);  
        }
    }
}
