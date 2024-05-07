import java.util.Scanner;

public class Main {
    public static int a = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        check(s, t);
        System.out.println(a);
    }

    public static int check(String s, String t) {
        for(int i = 0; i <= s.length()-t.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i+j) != t.charAt(j)){
                    break;
                }
                if(j == t.length()-1){
                    a = i;
                    return 0;
                }
            }
        }
        return 0;
    }
}