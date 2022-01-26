import java.util.Scanner;

public class A_IntorductionToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Length of String is :- "+str.length());
        

        // code to print all sub string of a string
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
        // how to add 2 string
        System.out.println("How to add 2 String");
        String s1 = "Hello";
        String s2 = "world";
        System.out.println(s1+" "+s2);
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);
        s1 +='W';
        System.out.println(s1); 
        // Split function java
        System.out.println("Split function");
        System.out.println("Enter string seprated by space");
        String str1 = sc.nextLine();
        String[] array = str1.split(" ");
        for(int i=0;i<array.length;i++){
            System.out.println("\""+array[i]+"\"");
        }
    }
}
