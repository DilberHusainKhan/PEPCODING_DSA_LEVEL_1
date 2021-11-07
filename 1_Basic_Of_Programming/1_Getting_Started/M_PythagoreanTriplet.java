import java.util.Scanner;

public class M_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ispytho = false;
        if (a > b && a > c) {
            if (a * a == (b * b) + (c * c)) {
                ispytho = true;
                System.out.println(ispytho);
            } else {
                System.out.println(ispytho);
            }
        } else if (b > a && b > c) {
            if (b * b == (a * a) + (c * c)) {
                ispytho = true;
                System.out.println(ispytho);
            } else {
                System.out.println(ispytho);
            }
        } else {
            if (c * c == (a * a) + (b * b)) {
                ispytho = true;
                System.out.println(ispytho);
            } else {
                System.out.println(ispytho);
            }
        }
    }
}
