import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n]; 
        int[] arr2 = new int[n]; 
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            if(arr1[i] % 2 == 0){
                arr2[cnt] = arr1[i];
                cnt++;
            }
        }

        for(int i = cnt - 1; i >= 0 ; i--){
            System.out.print(arr2[i] + " ");
        }
    }
}