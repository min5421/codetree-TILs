import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[10000000];
        int[] b = new int[10000000];

        int acnt = 0;
        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 1; j <= t; j++){
                acnt++;
                a[acnt] = a[acnt-1] + v;
            }
        }

        int bcnt = 0;
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 1; j <= t; j++){
                bcnt++;
                b[bcnt] = b[bcnt-1] + v;
            }
        }

        int cnt = 0;
        for(int i = 1; i <= acnt; i++){
            if(i == 1 && a[i] == b[i]){
                cnt++;
            }
            else if(a[i] > b[i] && a[i-1] <= b[i-1]){
                cnt++;
            }
            else if(a[i] < b[i] && a[i-1] >= b[i-1]){
                cnt++;
            }
            else if(a[i] == b[i] && a[i-1] != b[i-1]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}