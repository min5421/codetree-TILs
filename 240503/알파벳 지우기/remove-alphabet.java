import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int num1 = 0;
        int num2 = 0;


        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(c >= '0' && c <= '9'){
                num1 *= 10;
                num1 += (int)(c-'0');
            }
        }
        for(int i = 0; i < b.length(); i++){
            char c = b.charAt(i);
            if(c >= '0' && c <= '9'){
                num2 *= 10;
                num2 += (int)(c-'0');
            }
        }


        System.out.println(num1+num2);
    }
}