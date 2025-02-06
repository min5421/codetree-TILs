import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        int dirNum = 3;

        int cnt = 0;
        for(int i = 0;i < n; i++){
            if(s.charAt(i) == 'L'){
                dirNum = (dirNum + 3) % 4;
            }
            else if(s.charAt(i) == 'R'){
                dirNum = (dirNum + 1) % 4;
            }
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
            cnt++;

            if(x == 0 && y == 0){
                break;
            }
        }

        if(!(x == 0 && y == 0)){
            cnt = -1;
        }
        System.out.println(cnt);
    }
}