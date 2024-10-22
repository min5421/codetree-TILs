import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000];
        int point = 100000;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String s = sc.next();

            if(s.equals("L")){
                arr[point] = 1;
                for(int j = 1; j < a; j++){
                    point--;
                    arr[point] = 1;
                }
            }
            else{
                arr[point] = 2;
                for(int j = 1; j < a; j++){
                    point++;
                    arr[point] = 2;
                }
            }
        }

        int white = 0;
        int black = 0;
        for(int i = 0; i < 200000; i++){
            if(arr[i] == 1){
                white++;
            }
            else if(arr[i] == 2){
                black++;
            }
        }

        System.out.print(white + " " + black);
    }
}