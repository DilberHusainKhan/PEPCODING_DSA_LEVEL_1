import java.util.ArrayList;
import java.util.Scanner;

public class E_GetMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        ArrayList<String> result= getMazePathsWithJump(1,1,n,m);
        System.out.println(result);
    }
    public static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // final paths
        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        for(int ms = 1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc+ms, dr, dc);
            for(String hpath: hpaths){
                paths.add("h"+ms+hpath);
            }
        }

        // vertical move
        for(int ms = 1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = getMazePathsWithJump(sr+ms, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        // diagonal move
        for(int ms = 1; ms<=dc-sc && ms<=dr-sr; ms++){
            ArrayList<String> dpaths = getMazePathsWithJump(sr+ms, sc+ms, dr, dc);
            for(String dpath: dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        return paths;
    }
}
