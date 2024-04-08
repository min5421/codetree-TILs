import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;//sc.nextInt();
        int m = 5;//sc.nextInt();
        int[][] arr = new int[n][m];

        int num = 1;
        if(m >= n){
            for(int j = 0; j < n-1; j++){
                for(int i = 0; i <= j; i++){
                    arr[i][j-i] = num;
                    num++;
                }
            }
            for(int j = n-1; j < m; j++){
                for(int i = 0; i < n; i++){
                    arr[i][j-i] = num;
                    num++;
                }
            }
            for(int i = 1; i < n; i++){
                for(int j = 0; j < n-i; j++){
                    arr[i+j][m-j-1] = num;
                    num++;
                }
            }
        }
        else{
            for(int j = 0; j < m-1; j++){
                for(int i = 0; i <= j; i++){
                    arr[i][j-i] = num;
                    num++;
                }
            }
            for(int i = 0; i <= n-m; i++){
                for(int j = m-1; j >= 0; j--){
                    arr[i+m-j-1][j] = num;
                    num++;
                }
            }
            for(int i = n-m+1; i < n; i++){
                for(int j = 0; j < m-i; j++){
                    arr[i+j][m-j-1] = num;
                    num++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}