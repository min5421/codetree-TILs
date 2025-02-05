import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = {1, 0, -1, 0}; // ESWN
        int[] dy = {0, -1, 0, 1};

        int x = 0;
        int y = 0;

        int cnt = 0; 
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int t = sc.nextInt();

            int dirNum = 0;
            if(dir == 'E'){
                dirNum = 0;
            }
            else if(dir == 'S'){
                dirNum = 1;
            }
            else if(dir == 'W'){
                dirNum = 2;
            }
            else{
                dirNum = 3;
            }

            for(int j = 0; j < t; j++){
                if(!(x == 0 && y == 0) || (i == 0 && j == 0)){
                    x += dx[dirNum];
                    y += dy[dirNum];
                    cnt++;
                }
            }
        }

        if(!(x == 0 && y == 0)){
            cnt = -1;
        }
        System.out.println(cnt);
    }
}