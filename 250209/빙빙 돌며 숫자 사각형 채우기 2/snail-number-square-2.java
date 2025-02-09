import java.util.Scanner;

public class Main {

    static int n, m;

    static boolean inRange(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        int[] dx = {1, 0, -1, 0}; //DRUL
        int[] dy = {0, 1, 0, -1};
        int dir = 0;
        int x = 0;
        int y = 0;
        arr[x][y] = 1;

        for(int i = 2; i <= n*m; i++){
            int nextx = x + dx[dir];
            int nexty = y + dy[dir];

            if(!inRange(nextx, nexty) || arr[nextx][nexty] != 0){
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}