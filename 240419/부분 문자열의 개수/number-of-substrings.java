import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int check = 0;

        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)==t.charAt(0) && s.charAt(i+1)==t.charAt(1)){
                check++;
            }
        }

        System.out.print(check);
    }
}