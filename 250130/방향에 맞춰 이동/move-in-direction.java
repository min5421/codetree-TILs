import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        int n = sc.nextInt();
        int dirNum = 0;

        for(int i = 0; i < n; i++){
            String dir = sc.next();
            int s = sc.nextInt();

            if(dir.equals("E")){
                dirNum = 0;
            }
            else if(dir.equals("W")){
                dirNum = 2;
            }
            else if(dir.equals("S")){
                dirNum = 1;
            }
            else if(dir.equals("N")){
                dirNum = 3;
            }

            x += dx[dirNum] * s;
            y += dy[dirNum] * s;
        }

        System.out.print(x+" "+y);
    }
}