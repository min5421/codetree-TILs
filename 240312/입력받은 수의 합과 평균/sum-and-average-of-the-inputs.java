import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int sum = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            sum += a;
        }

        System.out.printf("%d %.1f", sum, sum/n);
    }
}