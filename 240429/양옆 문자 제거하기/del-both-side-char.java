import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(0,2)+s.substring(3,(s.length()-2))+s.substring(s.length()-1));
    }
}