import java.util.Scanner;

public class Main {

    static int win = 0;
    static int x = 0;
    static int y = 0;
    static int[][] arr = new int[19][19];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        //black1, white2,
        if(isWin(1)){
            win = 1;
        }
        else if(isWin(2)){
            win = 2;
        }

        System.out.println(win);
        if(win != 0){
            System.out.print(x + " " + y);
        }
    }

    static boolean isWin(int a){
        //check row
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 15; j++){
                if(arr[i][j] == a && arr[i][j+1] == a && arr[i][j+2] == a && arr[i][j+3] == a && arr[i][j+4] == a){
                    x = i + 1;
                    y = j + 3;
                    return true;
                }
            }
        }

        //check column
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 19; j++){
                if(arr[i][j] == a && arr[i+1][j] == a && arr[i+2][j] == a && arr[i+3][j] == a && arr[i+4][j] == a){
                    x = i + 3;
                    y = j + 1;
                    return true;
                }
            }
        }

        //check cross '/''
        for(int i = 0; i < 15; i++){
            for(int j = 4; j < 19; j++){
                if(arr[i][j] == a && arr[i+1][j-1] == a && arr[i+2][j-2] == a && arr[i+3][j-3] == a && arr[i+4][j-4] == a){
                    x = i + 3;
                    y = j - 1;
                    return true;
                }
            }
        }

        //check corss '\'
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                if(arr[i][j] == a && arr[i+1][j+1] == a && arr[i+2][i+2] == a && arr[i+3][i+3] == a && arr[i+4][i+4] == a){
                    x = i + 3;
                    y = j + 3;
                    return true;
                }
            }
        }

        return false;
    }
}