import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String check1 = "No";
        String check2 = "No";

        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)=='e'&& s.charAt(i+1)=='e'){
                check1 = "Yes";
            }
        }

        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)=='a'&& s.charAt(i+1)=='b'){
                check2 = "Yes";
            }
        }

        System.out.print(check1+" "+check2);
    }
}