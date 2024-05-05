import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(isit(y, m, n)){
            season(m);
        }    
        else{
            System.out.println(-1);
        }
    }


    public static boolean isit(int y, int m, int n){
        if(m == 2){
            if(isLeapYear(y) && n <= 29){
                return true;
            }
            else if(n <= 28){
                return true;
            }
        }
        else if(m == 4 || m == 6 || m == 9 || m == 10){
            if(n <= 30){
                return true;
            }
        }
        else{
            if(n <= 31){
                return true;
            }
        }

        return false;
    }


    public static void season(int m){
        if(m >= 3 && m <= 5){
            System.out.println("Spring");
        }
        else if(m >= 6 && m <= 8){
            System.out.println("Summer");
        }
        else if(m >= 9 && m <= 11){
            System.out.println("Fall");
        }
        else{
            System.out.println("Winter");
        }
    }


    public static boolean isLeapYear(int n){
        if(n % 100 == 0 && n % 400 != 0){
            return false;
        }
        if(n % 4 == 0){
            return true;
        }
        return false;
    }
}