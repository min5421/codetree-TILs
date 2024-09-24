import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2000];
        int point = 999;

        for(int i = 0; i < n; i++){
            int dis = sc.nextInt();
            String dir = sc.next();
            
            if(dir.equals("L")){
                for(int j = dis; j > 0; j--){
                    point--;
                    arr[point]++;
                }
            }
            else{
                for(int j = 0; j < dis; j++){
                    point++;
                    arr[point]++;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < 2000; i++){
            if(arr[i] > 1){
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}