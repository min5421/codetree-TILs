import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int aa = sc.nextInt();
        String b = sc.next();
        int bb = sc.nextInt();
        String c = sc.next();
        int cc = sc.nextInt();

        int covid = 0;

        if(a.equals("Y") || aa >= 37){
            covid++;
        }
        if(b.equals("Y") || bb >= 37){
            covid++;
        }
        if(c.equals("Y") || cc >= 37){
            covid++;
        }

        if(covid >= 2){
            System.out.println("E");
        }
        else{
            System.out.println("N");
        }
    }
}