import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[10];

        for(i = 0; i < 10; i++){
            if(cnt == 2){
                break;
            }
            
            arr[i] = n*(i+1);
            if(arr[i]*2 % 5== 0){
                cnt++;
            }
        }

        for(int j = 0; j < i; j++){
            System.out.print(arr[j] + " ");
        }
    }
}