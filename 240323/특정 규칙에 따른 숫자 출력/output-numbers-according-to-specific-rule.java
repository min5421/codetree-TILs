import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 0; i < n;i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = n-i; j >= 1; j--){
                System.out.print(cnt+" ");
                if(cnt == 9){
                    cnt = 0;
                }
                cnt++;
            }
            System.out.println();
        }
    }
}