import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arra = new int[n1];
        int[] arrb = new int[n2];
        int cnt = 0;
        boolean check = false;

        for(int i = 0; i < n1; i++){
            arra[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arra[i] = sc.nextInt();
        }

        for(int i = 0; i < n1; i++){
            if(arra[i] == arrb[0]){
                cnt = i;
            }
        }
        for(int i = 0; i < n2; i++){
            if(arra[cnt+i] == arrb[i]){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}