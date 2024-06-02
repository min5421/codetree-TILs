import java.util.Scanner;

class Secret{
    String c;
    char p;
    int t;

    public Secret(String code, char point, int time){
        c = code;
        p = point;
        t = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char point = sc.next().charAt(0);
        int time = sc.nextInt();

        Secret secret = new Secret(code, point, time);
        System.out.println("secret code : " + secret.c);
        System.out.println("meeting point : " + secret.p);
        System.out.println("time : " + secret.t);
    }
}