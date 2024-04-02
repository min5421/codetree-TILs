import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arra = new int[n1];
        int[] arrb = new int[n2];
        int cnt = 0;

        for(int i = 0; i < n1; i++){
            arra[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arra[i] = sc.nextInt();
        }

        for(int i = 0; i < n1; i++){
            if(arra[i] == arrb[cnt]){
                cnt++;
            }
        }

        if(cnt == arrb.length){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}