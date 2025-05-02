import java.util.Scanner;

public class Main {

    static boolean inRange(int x, int y, int n){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int dir = 0;

        int x = n / 2;
        int y = n / 2;
        int sum = board[x][y];
        for(int i = 0; i < t; i++){
            char c = commands.charAt(i);
            if(c == 'L'){
                dir = (dir + 3) % 4;
            }
            else if(c == 'R'){
                dir = (dir + 1) % 4;
            }
            else{
                int xx = x + dx[dir];
                int yy = y + dy[dir];
                if(!inRange(xx, yy, n)) continue;
                x = xx;
                y = yy;
                sum += board[x][y];
            }
        }

        System.out.println(sum);
    }
}