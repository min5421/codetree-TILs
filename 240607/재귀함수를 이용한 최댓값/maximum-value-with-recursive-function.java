import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[max(arr, 0, 0)]);
    }

    public static int max(int[] arr, int m, int n){
        if(n == arr.length){
            return m;
        }

        if(arr[m] < arr[n]){
            m = n;
        }
        return max(arr, m, n+1);
    }
}