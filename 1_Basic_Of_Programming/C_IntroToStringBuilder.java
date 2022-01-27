public class C_IntroToStringBuilder {
    public static void main(String[] args) {
        // why we use StringBuilder ?
        // because stringBuilder is much faster then string and it also provide various function such as:-
        // CharAt(), serCharAt(index, char), insert(index, char), deleteCharAt(index), append(), and length();
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Original string value:-- "+sb);
        // get char
        char ch = sb.charAt(0);
        System.out.println("CharAt function:--  "+ch);
        // to set a char
        sb.setCharAt(0, 'd');
        System.out.println("setChatAt function:-- "+sb);
        // to insert char
        sb.insert(2, 'z');
        System.out.println("insert function:--  "+sb);
        // to delete char
        sb.deleteCharAt(2);
        System.out.println("deleteCharAt:--  "+sb);
        // to add char last of the string
        sb.append('x');
        System.out.println("append function:-- "+sb);
        // to find length
        System.out.println("Length function:-- "+sb.length());
        // speed test of String and StringBuilder
        // For String
        int n=10000;
        long start = System.currentTimeMillis();
        String str1 = "";
        for(int i=0;i<n;i++){
            str1 +=i;
        }
        long end = System.currentTimeMillis();
        long duration = end-start;
        System.out.println("Time duration of String:---- "+duration);

        // For StringBuilder
        long Start1 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        for(int i=0;i<n;i++){
            str2.append(i);
        }
        long end2 = System.currentTimeMillis();
        long duration2 = end2 - Start1;
        System.out.println("Time Duration of StringBuilder:---   "+duration2);
        System.out.println("So, Use StringBuilder which is very fast :)");
    }
}
