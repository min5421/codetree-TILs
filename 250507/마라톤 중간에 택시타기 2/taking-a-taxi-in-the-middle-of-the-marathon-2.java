import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n-1; i++){
            int dis = 0;
            for(int j = 0; j < n-1; j++){
                if(j == i-1){
                    dis += Math.abs(x[j]-x[j+2]) + Math.abs(y[j]-y[j+2]);
                }
                else if(j == i){
                    continue;
                }
                else{
                    dis += Math.abs(x[j]-x[j+1]) + Math.abs(y[j]-y[j+1]);
                }
            }

            min = Math.min(min, dis);
        }

        System.out.println(min);
    }
}