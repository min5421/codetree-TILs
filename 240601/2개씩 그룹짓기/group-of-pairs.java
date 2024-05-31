import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int[] arr2 = new int[n];

        for(int i = 0; i < n*2 ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            arr2[i] = arr[i] + arr[n*2-1-i];
        }

        int max = arr2[0];
        for(int i = 1; i < n; i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
        }

        System.out.println(max);
    }
}