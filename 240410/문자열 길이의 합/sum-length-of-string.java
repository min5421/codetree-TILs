import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[10];
        int sum = 0;
        int a = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            sum += arr[i].length();
            if(arr[i].charAt(0) == 'a'){
                a++;
            }
        }
        System.out.println(sum + " " + a);
    }
}