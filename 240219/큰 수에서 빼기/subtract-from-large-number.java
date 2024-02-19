import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = a-b;
        if(sub < 0){
            sub *= -1;
        }
        System.out.println(sub);

    }
}