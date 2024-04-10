import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        
        if(s.length()>t.length()){
            System.out.println(s+" "+s.length());
        }
        else if(s.length()<t.length()){
            System.out.println(t+" "+t.length());
        }
        else{
            System.out.println("same");
        }
    }
}