import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = sc.nextInt();

        for(int i = 2; i < 12; i++){
            arr[i] = arr[i - 1] + arr[i -2];
            if(arr[i] >= 100){
                num = i;
                break;
            }
        }
        for(int i = 0; i <= num; i++){
            System.out.print(arr[i]+" ");
        }
    }
}