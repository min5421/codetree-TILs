import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for(int i = start; i <= end; i++){
            int cnt3 = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt3++;
                }
            }
            if(cnt3 == 3){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}