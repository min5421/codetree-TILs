import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (cnt < 3) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n/2);
                cnt++;
            }
        }
    }
}