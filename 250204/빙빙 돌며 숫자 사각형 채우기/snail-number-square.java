import java.util.Scanner;

public class Main {

    static int n;
    static int m;

    static boolean inRange(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] rec = new int[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;
        int x = 0;
        int y = 0;

        rec[x][y] = 1;
        for(int i = 2; i <= n * m; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny) || rec[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4;
            }

            x += dx[dirNum];
            y += dy[dirNum];
            rec[x][y] = i;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(rec[i][j]+" ");
            }
            System.out.println("");
        }
    }
}