import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+2];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 2; i <= n; i++){
            for(int j = i; j > 1; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                System.out.println(arr[i]);
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}