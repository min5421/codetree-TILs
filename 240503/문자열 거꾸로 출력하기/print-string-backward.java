import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            String t = sc.next();
            if(t.equals("END")){
                break;
            }
            for(int j = t.length()-1; j >= 0; j--){
                System.out.print(t.charAt(j));
            }
            System.out.println();
        }
    }
}