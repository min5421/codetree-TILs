import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j < n; j++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int prod = 1;
            for (int i = a; i <= b; i++) {
                    prod *= i;
            }

            System.out.println(prod);
        }
    }
}