import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr =new int[n];
        int profit = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(profit < j-i){
                    profit = j-i;
                }
            }
        }

        if(profit <= 0){
            profit = 0;
        }
        System.out.println(profit);

    }
}