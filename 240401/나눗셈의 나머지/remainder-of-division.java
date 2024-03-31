import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int[] countArr = new int[10];

        for (int i = 0; i < 10; i++) {
            if(a <= 1){
                break;
            }
            countArr[a%b]++;
            a /= b;
        }

        for(int i = 0; i < 10; i++){
            sum += countArr[i]*countArr[i];
        }
        System.out.println(sum); 
    }
}