import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isPrimeNumber(i) && isEven(i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isPrimeNumber(int i){
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(int i){
        int sum = 0;
        while(i > 0){
            sum += i % 10;
            i /= 10;
        }

        if(sum % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}