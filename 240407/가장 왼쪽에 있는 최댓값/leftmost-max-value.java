import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        
        int idx = n+1;
        while(idx != 1){
            int max = arr[0];
            int num = idx;
            for(int i = 1; i < num; i++){
                if(max < arr[i]){
                    max = arr[i];
                    idx = i;
                }
            }
            System.out.print(idx+" ");
        }
    }
}