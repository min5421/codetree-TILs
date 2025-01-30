import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        int dir = 3;
        String data = sc.next();

        for(String s : data.split("")){
            if(s.equals("L")){
                dir = (dir + 3) % 4;
            }
            else if(s.equals("R")){
                dir = (dir + 1) % 4;
            }
            else if(s.equals("F")){
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.print(x+" "+y);
    }
}