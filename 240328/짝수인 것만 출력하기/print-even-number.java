import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2== 0){
                arr2[cnt] = arr[i];
                cnt++;
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}