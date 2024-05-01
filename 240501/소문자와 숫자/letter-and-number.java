import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a'&& c <= 'z' || c >= '0' && c <= '9'){
                System.out.print(c);
            }
            else if(c >= 'A'&& c <= 'Z'){
                System.out.print((char)(c-'A'+'a'));
            }
        }
    }
}