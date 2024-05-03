import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = 0;
        boolean equal = false;

        for(int i = 0; i < t.length(); i++){
            t = t.substring(t.length()-1) + t.substring(0,t.length()-1);
            n++;
            if(s.equals(t)){
                equal = true;
                break;
            }
        }

        if(!equal){
            n = -1;
        }
        System.out.println(n);
    }
}