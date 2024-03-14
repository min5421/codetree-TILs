import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bool = true;

        for(int i = 2;i < n; i++){
            if(n % i == 0){
                bool = false;
                break;
            }
        }

        if(bool || n == 1){
            System.out.println("N");
        }
        else{
        System.out.println("C");
        }
    }
}