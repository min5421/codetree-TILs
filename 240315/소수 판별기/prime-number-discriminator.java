import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isIt = false;
    
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isIt = true;
                break;
            }
        }

        if(isIt){
            System.out.println("C");
        }
        else{
            System.out.println("P");
        }
    }
}