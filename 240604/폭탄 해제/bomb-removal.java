import java.util.Scanner;

class Bomb{
    String code;
    char color;
    int sec;

    public Bomb(String code, char color, int sec){
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int sec = sc.nextInt();

        Bomb b = new Bomb(code, color, sec);
        System.out.println("code : "+b.code);
        System.out.println("color : "+b.color);
        System.out.println("second : "+b.sec);
    }
}