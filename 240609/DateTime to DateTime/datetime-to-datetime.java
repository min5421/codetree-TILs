import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = 11;
        int h = 11;
        int m = 11;
        int time = 0;

        if(check(a, b, c)){
            while(!(d == a && h == b && m == c)){
                time++;
                m++;

                if(m == 60){
                    h++;
                    m = 0;
                }
                if(h == 24){
                    d++;
                    h = 0;
                }
            }
            System.out.println(time);
        }
        else{
            System.out.println(-1);
        }
    }

    public static boolean check(int a, int b, int c){
        if(a > 11){
            return true;
        }
        else if(a == 11 && b > 11){
            return true;
        }
        else if(a == 11 && b == 11 && c >= 11){
            return true;
        }
        return false;
    }
}