import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n;
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            result /= i;
            cnt++;
            if(result <= 1){
                System.out.println(cnt);
                break;
            }
        }
    }
}