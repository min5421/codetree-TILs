import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE;    
        for(int i = 0; i < n; i++){
            int dis = 0;
            for(int j = 0; j < n; j++){
                dis += a[(i+j)%n] * j;
            }
            
            min = Math.min(min, dis);
        }

        System.out.println(min);
    }
}