import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10000];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'G'){
                arr[pos-1] = 1;
            }
            else if(c == 'H'){
                arr[pos-1] = 2;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= 10000-(k+1); i++){
            int sum = 0;
            for(int j = i; j <= i+k; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}