import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-2; j++){
                if(i == n-1 && (j == n-3 || j == n-4 || j == n-5)) continue;

                for(int k = 0; k < n ; k++){
                    for(int l = 0; l < n-2; l++){
                        if(k < i || (k == i && l < j+3)) continue;
                        max = Math.max(max, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[k][l] + arr[k][l+1] + arr[k][l+2]);
                    }
                }
            }
        }

        System.out.println(max);
    }
}