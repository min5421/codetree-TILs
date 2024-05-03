import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toString(a);
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            result += (int)(s.charAt(i)-'0');
        }

        System.out.println(result);
    }
}