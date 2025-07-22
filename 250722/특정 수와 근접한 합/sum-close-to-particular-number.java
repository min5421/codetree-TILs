import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int allSum = 0;
        for(int i = 0; i < n; i++){
            allSum += arr[i];
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int sum = allSum - arr[i] - arr[j];
                int dif = Math.abs(s - sum);
                min = Math.min(min, dif);
            }
        }

        System.out.println(min);
    }
}