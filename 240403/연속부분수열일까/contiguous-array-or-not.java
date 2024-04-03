import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arra = new int[n1];
        int[] arrb = new int[n2];
        boolean check = false;

        for(int i = 0; i < n1; i++){
            arra[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arrb[i] = sc.nextInt();
        }
        
        for(int i = 0; i <= n1-n2; i++){
            if(arra[i] == arrb[0]){
                for(int j = 1; j < n2; j++){
                    if(arra[i+j] == arrb[j]){
                        check = true;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if(check){
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