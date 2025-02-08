import java.util.*;

public class Main {

    static int n, x, y, dir;
    static char[][] map;
    static int[] dx = {-1, 0, 0, 1}; // NEWS
    static int[] dy = {0, 1, -1, 0};

    static boolean inRange(int x, int y){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    static void setStart(int k){
        dir = k / n; //0123 = NEWS 북동서남

        if(dir == 0){
            x = 0;
            y = (k-1) % n;
        }
        else if(dir == 1){
            x = (k-1) % n;
            y = 0;
        }
        else if(dir == 2){
            x = n - 1 - ((k-1) % n);
            y = n - 1;
        }
        else{
            x = n - 1;
            y = n - 1 - ((k-1) % n);
        }
    }

    static int countNumber(){
        int cnt = 0;
        while(inRange(x, y)){
            if(map[x][y] == '/'){
                /*0123 = NEWS 북동서남
                nw북서
                es동남                    
                */
                dir = (dir + 2) % 4; 
            }
            else{
                /*
                ne북동
                ws남서
                */
                if(dir % 2 == 0){
                    dir += 1;
                }
                else{
                    dir -= 1;
                }
            }

            x += dx[dir];
            y += dy[dir];
            if(dir % 2 == 0){
                dir = (dir + 3) % 4;
            }
            else{
                dir = (dir + 1) % 4;
            }
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new char[n][n];
        
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(int j = 0; j < n; j++){
                map[i][j] = s.charAt(j);
            }
        }


        int k = sc.nextInt();
        setStart(k);

        System.out.println(countNumber());
    }
}