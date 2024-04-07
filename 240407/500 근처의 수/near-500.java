import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] up = new int[10];
        int[] down = new int [10];
        int upCnt = 0;
        int downCnt = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            if(a < 500){
                down[downCnt] = a;
                downCnt++;
            }
            else{
                up[upCnt] = a;
                upCnt++;
            }
        }

        for(int i = 1; i < upCnt; i++){
            for(int j = i; j > 0; j--){
                if(up[j] < up[j-1]){
                    int temp = up[j];
                    up[j] = up[j-1];
                    up[j-1] = temp;
                }
            }
        }

        for(int i = 1; i < downCnt; i++){
            for(int j = i; j > 0; j--){
                if(down[j] > down[j-1]){
                    int temp = down[j];
                    down[j] = down[j-1];
                    down[j-1] = temp;
                }
            }
        }

        System.out.print(down[0]+" "+up[0]);
    }
}