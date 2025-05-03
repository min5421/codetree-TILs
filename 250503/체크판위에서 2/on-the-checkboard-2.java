import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }


        char first = grid[0][0];  //first = third
        char last = grid[R-1][C-1];  //last = second

        int cnt = 0;
        if(first != last){
            for(int i = 1; i < R-2; i++){
                for(int j = 1; j < C-2; j++){
                    for(int k = i+1; k < R-1; k++){
                        for(int l = j+1; l < C-1; l++){
                            if(grid[i][j] == last && grid[k][l] == first){
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