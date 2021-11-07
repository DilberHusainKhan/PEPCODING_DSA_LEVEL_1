import java.util.*;
  
  public class L_BenjaminBulbs{
  
  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i*i<=n;i++){
      System.out.println(i*i);
    }  
   }
  }