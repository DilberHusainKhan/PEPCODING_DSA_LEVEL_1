import java.util.Scanner;

public class D_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = compression1(str);
        System.out.println(str1);
        String str2 = compression2(str);
        System.out.println(str2);
    }
    // compression 1
    public static String compression1(String str){
        String s = str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if(current != prev){
                s +=current;
            }
        } 
        return s;
    }
    // compression 2
    public static String compression2(String str){
        String s= str.charAt(0)+"";
        int count =1;
        for(int i=1; i<str.length();i++){
            char curr=str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    count =1;
                }
                s+=curr;
            }
        }
        if(count>1){
            s +=count;
            count =1;
        }
        return s;
    } 

}
