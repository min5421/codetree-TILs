import java.util.Scanner;

public class Main {

    static int n;

    static boolean inRange(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int i = 0; i < m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            arr[x][y] = 1;

            int cnt = 0;
            for(int j = 0; j < 4; j++){
                int checkx = x + dx[j];
                int checky = y + dy[j];

                if(inRange(checkx,checky) && arr[checkx][checky] == 1){
                    cnt++;
                }
            }
            if(cnt == 3){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}