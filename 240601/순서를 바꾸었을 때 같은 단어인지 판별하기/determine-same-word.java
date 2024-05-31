import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] aarr = a.toCharArray();
        char[] barr = b.toCharArray();

        Arrays.sort(aarr);
        Arrays.sort(barr);

        a = new String(aarr);
        b = new String(barr);

        if(a.equals(b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}