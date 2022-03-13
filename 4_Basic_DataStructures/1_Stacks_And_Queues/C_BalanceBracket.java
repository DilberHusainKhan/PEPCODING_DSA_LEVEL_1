import java.util.Scanner;
import java.util.Stack;

public class C_BalanceBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else if (ch == ')'){
                boolean val = handleclosing(st, '(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }else if (ch == '}'){
                boolean val = handleclosing(st, '{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }else if (ch == ']'){
                boolean val = handleclosing(st, '[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
        }

        // stack khali hua ya nahi
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    //check karo ki bracket sahi hai ya nahi 
    public static boolean handleclosing(Stack<Character> st, char ch){
        if(st.size()==0){
            return false;
        }else if(st.peek()!=ch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
