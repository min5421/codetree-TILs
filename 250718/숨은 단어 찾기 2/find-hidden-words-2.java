import java.util.Scanner;
public class Main {

    static int n;
    static int m;

    static boolean isRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < m; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        //12시 부터 시계방향
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; 
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 'L'){
                    for(int k = 0; k < 8; k++){
                        int x = i + dx[k];
                        int y = j + dy[k];

                        if(isRange(x , y) && arr[x][y] == 'E'){
                            x += dx[k];
                            y += dy[k];

                            if(isRange(x, y) && arr[x][y] == 'E'){
                                cnt++;
                            }
                        }    
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}