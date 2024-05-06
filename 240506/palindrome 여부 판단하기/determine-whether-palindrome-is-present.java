import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String s){
        String t = "";

        for(int i = s.length()-1; i >= 0; i--){
            t += s.charAt(i);
        }

        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
    }
}