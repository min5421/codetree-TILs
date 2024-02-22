import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c, d;

        if (a < b) {
            c = 1;
        }
        else{
            c = 0;
        }

        if (a == b) {
            d = 1;
        }
        else{
            d = 0;
        }
        System.out.println(c + " " + d);

    }
}