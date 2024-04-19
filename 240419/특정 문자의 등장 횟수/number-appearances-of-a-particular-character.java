import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int check1 = 0;
        int check2 = 0;

        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)=='e'&& s.charAt(i+1)=='e'){
                check1++;
            }
        }

        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)=='e'&& s.charAt(i+1)=='b'){
                check2++;
            }
        }

        System.out.print(check1+" "+check2);
    }
}