import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        String a_sex = sc.next();
        int b_age = sc.nextInt();
        String b_sex = sc.next();

        if (a_age >= 19 && a_sex.equals("M") || b_age >= 19 && b_sex.equals("M")) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}