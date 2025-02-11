import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        int dir = 0;
        int x = n / 2;
        int y = n / 2;

        arr[x][y] = 1;
        for(int i = 2; i <= n*n; i++){
            x += dx[dir];
            y += dy[dir];
            arr[x][y] = i;

            dir = (dir + 1) % 4;
            int nextx = x + dx[dir];
            int nexty = y + dy[dir];
            if(arr[nextx][nexty] != 0){
                dir = (dir + 3) % 4;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}