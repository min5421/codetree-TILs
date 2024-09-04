import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        //n을 a진수에서 10진수로
        int[] arr = new int[32];
        int cnt = 0;
        while(n > 0){
            arr[cnt] = n % 10;
            n /= 10;
            cnt++;
        }

        for(int i = cnt - 1; i >= 0; i--){
            n = n * a + arr[i];
        }

        //n을 10진수에서 b진수로
        cnt = 0;
        while(true){
            if(n < b){
                arr[cnt] = n;
                break;
            }

            arr[cnt] = n % b;
            n /= b;
            cnt++;
        }

        for(int i = cnt; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}