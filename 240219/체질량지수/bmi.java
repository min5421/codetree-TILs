import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int bmi = b*10000/(a*a);
        System.out.println(bmi);

        if(bmi >= 25){
            System.out.println("Obesity");
        }

    }
}