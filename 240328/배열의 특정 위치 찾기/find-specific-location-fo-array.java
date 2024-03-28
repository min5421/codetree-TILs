import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < 10; i += 2){
            sum += arr[i];
        }
        System.out.print(sum+" ");

        sum = 0;
        for(int i = 2; i < 10; i += 3){
            sum += arr[i];
        }
        System.out.printf("%.1f", sum/3.0);
    }
}