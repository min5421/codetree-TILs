import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[200000][2];
        int[] color = new int[200000];
       
        int point = 100000;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String s = sc.next();
            
            if(s.equals("L")){
                arr[point][0]++;
                for(int j = 1; j < a; j++){
                    point--;
                    arr[point][0]++;
                    color[point] = 2;
                }
            }
            else{
                arr[point][1]++;
                for(int j = 1; j < a; j++){
                    point++;
                    arr[point][1]++;
                    color[point] = 1;
                }
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i = 0; i < 200000; i++){
            if(arr[i][0]>1 && arr[i][1]>1){
                gray++;
            }
            else if(color[i] == 2){
                white++;
            }
            else if(color[i] == 1){
                black++;
            }
        }

        System.out.print(white+" "+black+" "+gray);
    }
}