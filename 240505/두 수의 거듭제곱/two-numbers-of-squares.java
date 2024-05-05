import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(square(a, b));
    }

    public static int square(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
}