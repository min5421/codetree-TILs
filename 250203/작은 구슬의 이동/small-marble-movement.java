import java.util.Scanner;

public class Main {
    static int n;

    static boolean inRange(int x, int y){
        return (x > 0 && x <= n && y > 0 && y <= n);
    }

    static int getDir(char c){
        if(c == 'R'){
            return 0;
        }
        else if(c == 'D'){
            return 1;
        }
        else if(c == 'U'){
            return 2;
        }
        else{
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        int x = sc.nextInt();
        int y = sc.nextInt();
        char dir = sc.next().charAt(0);
        int dirNum = getDir(dir);

        for(int i = 0; i < t; i++){
            x += dx[dirNum];
            y += dy[dirNum];

            if(!inRange(x, y)){
                x -= dx[dirNum];
                y -= dy[dirNum];
                dirNum = 3 - dirNum;
            }
        }

        System.out.println(x+" "+y);
    }
}