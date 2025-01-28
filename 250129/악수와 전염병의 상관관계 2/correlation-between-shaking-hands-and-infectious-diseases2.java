import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N명의 개발자
        int K = sc.nextInt(); //K번의 악수동안 점염
        int P = sc.nextInt(); //처음 전염병에 걸려 있는 개발자
        int T = sc.nextInt(); //T번에 걸쳐 악수

        int[][] txy = new int[250][3];
        for(int i = 0; i < T; i++){
            txy[i][0] = sc.nextInt();
            txy[i][1] = sc.nextInt();
            txy[i][2] = sc.nextInt();
        }
        Arrays.sort(txy, Comparator.comparingInt((int[] o) -> o[0])); 


        int[][] developers = new int[101][2]; //0:전염여부, 1:전염시킨횟수
        developers[P][0] = 1;

        for(int i = 250-T; i < 250; i++){
            int x = txy[i][1];
            int y = txy[i][2];

            if(developers[x][0] == 1 && developers[x][1] < K){
                    developers[y][0] = 1;
                    developers[x][1] += 1;
            }
            if(developers[y][0] == 1 && developers[y][1] < K){
                    developers[x][0] = 1;
                    developers[y][1] += 1;
            }            
        }

        for(int i = 1; i <= N; i++){
            System.out.print(developers[i][0]);
        }
    }
}