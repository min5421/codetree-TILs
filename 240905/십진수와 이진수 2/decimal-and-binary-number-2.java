import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        n = toTen(n);
        n *= 17;
        n = toTwo(n);

        System.out.println(n);
        
    }

    static int toTen(int n){
        int num = 0;
        int[] arr = new int[20];

        int cnt = 0;
        while(n > 0){
            arr[cnt] = n % 10;
            n = n / 10;
            cnt++;
        }

        for(int i = cnt-1; i >= 0; i--){
            num *= 2;
            num += arr[i];
        }

        return num;
    }

    static int toTwo(int n){
        int num = 0;
        int[] arr = new int[20];

        int cnt = 0;
        while(true){
            if(n < 2){
                arr[cnt] = n;
                break;
            }

            arr[cnt] = n % 2;
            n = n / 2;
            cnt++;
        }

        for(int i = cnt; i >= 0; i--){
            num *= 10;
            num += arr[i];
        }

        return num;
    }
}