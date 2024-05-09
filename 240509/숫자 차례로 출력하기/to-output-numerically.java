import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n, 1);
    }

    public static void print(int n, int a){
        if(n == 0){
            System.out.println();
            return;
        }

        System.out.print(a+" ");
        print(n-1, a+1);
        System.out.print(a+" ");
    }
}