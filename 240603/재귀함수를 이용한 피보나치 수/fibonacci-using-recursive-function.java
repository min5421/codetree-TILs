import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fivo(n));
    }

    public static int fivo(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        return fivo(n-1) + fivo(n-2);
    }
}