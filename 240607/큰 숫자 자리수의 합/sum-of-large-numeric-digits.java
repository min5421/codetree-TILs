import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(sum(a*b*c));
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        }

        return sum(n/10) + n%10;
    }
}