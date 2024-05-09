import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n){
        if(n == 0){
            return;
        }

        print(n-1);
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}