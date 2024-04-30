import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)sc.next().charAt(0);
        int b = (int)sc.next().charAt(0);

        int sum = a+b;
        int sub = a-b;
        if(sub <= 0){
            sub *= -1;
        }
        System.out.println(sum+" "+sub);
    }
}