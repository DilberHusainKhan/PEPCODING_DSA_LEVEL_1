import java.util.*;
public class A_IntroToStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // we use pop -> delete , push -> to add, peek -> get , size
        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size is "+st.size());
        st.push(30);
        st.push(40);
        System.out.println("Stack is "+ st+" size is "+st.size());
        st.pop();
        System.out.println("Stack is  "+ st+" size is "+st.size());
        st.pop();
        System.out.println("Stack is  "+ st+" size is "+st.size());
        st.pop();
        System.out.println("Stack is  "+ st+" size is "+st.size());
        st.pop();
        System.out.println("size is "+st.size());
    }
}
