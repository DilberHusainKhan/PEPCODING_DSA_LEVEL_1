import java.util.ArrayList;
import java.util.Scanner;

public class A_GetSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = getSubSequence(str);
        System.out.println(result); 
    }
    public static ArrayList<String> getSubSequence(String str){
        //base case
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String restString = str.substring(1);
        ArrayList<String> rres= getSubSequence(restString);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            mres.add(""+rstr);
        }
        for(String rstr: rres){
            mres.add(ch+rstr);
        }
        return mres;
    }
}
