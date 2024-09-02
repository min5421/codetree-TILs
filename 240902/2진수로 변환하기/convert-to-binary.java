import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        int cnt = -1;

        while(n > 0){
            cnt++;
            arr[cnt] = n%2;
            n = n/2;
        }  

        if(cnt < 0){
            cnt = 0;
            arr[0] = 0;
        }

        for(int i = cnt; i >= 0; i--){
            System.out.print(arr[i]);
        }  
    }
}