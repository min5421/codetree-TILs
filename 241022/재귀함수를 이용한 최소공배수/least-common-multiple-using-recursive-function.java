import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num1 = sc.nextInt();
        for(int i = 1; i < n; i++){
            int num2 = sc.nextInt();
            num1 = leastCommonMul(num1, num2, num1, num2);
        }

        System.out.print(num1);
    }

    static int leastCommonMul(int num1,int num2, int a , int b){
        if (a == b){
            return a;
        }
        else if (a > b){
            return leastCommonMul(num1, num2, a, b+num2);
        }
        else{
            return leastCommonMul(num1, num2, a+num1, b);
        }
    }
}