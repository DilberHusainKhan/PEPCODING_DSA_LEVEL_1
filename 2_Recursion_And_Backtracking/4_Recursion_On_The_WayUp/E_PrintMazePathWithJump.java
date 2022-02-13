import java.util.Scanner;

public class E_PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        printMazePathWithJump(1,1,n,m,"");
    }
    public static void printMazePathWithJump(int sr, int sc, int dr, int dc, String ans){
        if(sc>dc||sr>dr){
            return;
        }
        if(sc==dc&&sr==dr){
            System.out.println(ans);
            return;
        }

        // loop for multiple steps like h1 h2 h3
        for(int ms = 1; ms<=dc-sc;ms++){
            printMazePathWithJump(sr, sc+ms, dr, dc, ans+"h"+ms);
        }
        // vertical move
        for(int ms = 1; ms<=dr-sr;ms++){
            printMazePathWithJump(sr+ms, sc, dr, dc, ans+"v"+ms);
        }
        // diagonal move
        for(int ms = 1; ms<=dc-sc&&ms<=dr-sr;ms++){
            printMazePathWithJump(sr+ms, sc+ms, dr, dc, ans+"d"+ms);
        }
    }
}
