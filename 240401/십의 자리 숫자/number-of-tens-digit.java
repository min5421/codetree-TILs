import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[10];

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if(a == 0){
                break;
            }
            countArr[a/10]++;
        }
        for(int i = 1; i < 10; i++){
            System.out.println(i+" - "+countArr[i]);                   
        }
    }
}