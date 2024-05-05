import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(isit(m, n)){
            System.out.println("Yes");
        }    
        else{
            System.out.println("No");
        }
    }

    public static boolean isit(int m, int n){
        if(m > 12){
            return false;
        }
        else if(m == 2){
            if(n <= 28){
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
}