import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    } 

    public static int func(int n){
        if(n < 10){
            return n*n;
        }

        return func(n / 10) + (n%10)*(n%10);
    }
}