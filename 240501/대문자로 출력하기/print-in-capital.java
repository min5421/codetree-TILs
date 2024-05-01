import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A'&& c <= 'Z'){
                System.out.print(c);
            }
            else if(c >= 'a'&& c <= 'z'){
                System.out.print((char)(c-'a'+'A'));
            }
        }
    }
}