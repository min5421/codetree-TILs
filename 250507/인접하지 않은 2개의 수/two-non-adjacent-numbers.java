import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        
        int max = Integer.MIN_VALUE;    
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(j == i+1) continue;
                max = Math.max(max, arr[i]+arr[j]);
            }
        }

        System.out.println(max);
    }
}