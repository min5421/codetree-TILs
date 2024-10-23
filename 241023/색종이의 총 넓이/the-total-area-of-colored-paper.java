import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[200][200];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt() + 100;
            int y = sc.nextInt() + 100;

            for(int j = 0; j < 8; j++){
                for(int k = 0; k < 8; k++){
                    arr[x+j][y+k] = 1;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}