import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int g = sc.nextInt();

        if (a == 0) {
            if (g >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else {
            if (g >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
    }
}