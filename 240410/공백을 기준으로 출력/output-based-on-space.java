import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()+sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                System.out.print(s.charAt(i));
            }
        }
    }
}