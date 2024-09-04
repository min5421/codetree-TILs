import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     
        int[] arr = new int[32];
        int cnt = 0;

        while(true){
            if(n == 0){
                cnt--;
                break;
            }

            arr[cnt] = n % 10;
            n /= 10;
            cnt++;
        }

        int num = 0;
        for(int i = cnt; i >= 0; i--){
            num = num * 2 + arr[i];
        }

        System.out.println(num);
    }
}