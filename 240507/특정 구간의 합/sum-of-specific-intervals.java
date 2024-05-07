import java.util.Scanner;

public class Main {
    public static int a1;
    public static int a2;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            a1 = sc.nextInt();
            a2 = sc.nextInt();

            sum();
        }
    }


    public static void sum(){
        int sum = 0;

        for(int i = a1-1; i < a2; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}