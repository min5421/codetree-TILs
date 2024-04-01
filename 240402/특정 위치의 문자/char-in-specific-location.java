import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        String idx = "None";
        char n = sc.next().charAt(0);

        for (int i = 0; i <= 5; i++) {
            if (word[i] == n) {
                idx = Integer.toString(i);
            }
        }

        System.out.println(idx);
    }
}