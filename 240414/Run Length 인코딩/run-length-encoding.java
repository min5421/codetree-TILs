import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = a.charAt(0);
        int cnt = 1;
        String s = "";

        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) == c){
                cnt++;
            }
            else{
                s += c;
                s += cnt;
                c = a.charAt(i);
                cnt = 1;
            }
        }

        s += c;
        s += cnt;

        System.out.println(s.length());
        System.out.println(s);
    }
}