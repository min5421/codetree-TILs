import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(arr[i].charAt(2) == c || arr[i].charAt(3) == c){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}