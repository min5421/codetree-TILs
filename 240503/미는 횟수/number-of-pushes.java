import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = 0;
        boolean equal = false;

        for(int i = 0; i <= t.length(); i++){
            if(s.equals(t)){
                equal = true;
                break;
            }
            t = t.substring(t.length()-1) + t.substring(0,t.length()-1);
            n++;
        }

        if(!equal || s.length() > 100 || s.length() < 2){
            n = -1;
        }
        System.out.println(n);
    }
}