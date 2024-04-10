import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.next().length();
        int t = sc.next().length();
        int u = sc.next().length();

        if(s>=t&&t>=u){
            System.out.println(s-u);
        }
        else if(t>=s&&s>=u){
            System.out.println(t-u);
        }
        else if(s>=u&&u>=t){
            System.out.println(s-t);

        }
        else if(u>=s&&s>=t){
            System.out.println(u-t);
        }
        else if(t>=u&&u>=s){
            System.out.println(t-s);
        }
        else{
            System.out.println(u-s);
        }
    }
}