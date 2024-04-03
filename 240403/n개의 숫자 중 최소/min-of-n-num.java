import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (minVal > arr[i]) {
                cnt = 1;
                minVal = arr[i];
            }
            else if(minVal == arr[i]){
                cnt++;
            }
        }

        System.out.println(minVal+" "+ cnt);
    }
}