import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0'&& c <= '9'){
                sum += (int)(c-'0');
            }
        }
        System.out.print(sum);
    }
}