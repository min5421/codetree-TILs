import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)sc.next().charAt(0);

        if(a != 'a'){
            System.out.print((char)(a-1));
        }
        else{
            System.out.print('z');
        }
    }
}