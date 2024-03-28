import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sumOdd = 0;
        int sumEven = 0;
        int sub = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sumOdd += arr[i];
            }
            else{
                sumEven += arr[i];
            }
        }

        if(sumEven > sumOdd){
            sub = sumEven - sumOdd;
        }
        else{
            sub = sumOdd - sumEven;
        }

        System.out.println(sub);
    }
}