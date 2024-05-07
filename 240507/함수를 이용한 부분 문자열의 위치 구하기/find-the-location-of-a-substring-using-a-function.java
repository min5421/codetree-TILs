import java.util.Scanner;

public class Main {
    public static String s;
    public static String t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();

        System.out.println(where());
    }

    public static int where() {
        for(int i = 0; i <= s.length()-t.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i+j) != t.charAt(j)){
                    break;
                }
                if(j == t.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}