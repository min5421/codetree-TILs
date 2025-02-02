import java.util.Scanner;

public class Main {
    static boolean inRange(int x, int y, int n){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                int one = 0;
                for(int k = 0; k < 4; k++){
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if(inRange(x, y, n) && arr[x][y] == 1){
                        one++;
                    }
                }

                if(one >= 3){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}