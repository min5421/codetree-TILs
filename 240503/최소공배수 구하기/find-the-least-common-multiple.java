import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        minimumCommonMultiple(n, m);
    }

    public static void minimumCommonMultiple(int n, int m){
        int nn = n;
        int mm = m;
        while(nn != mm){
            if(nn < mm){
                nn += n;
            }
            else{
                mm += m;
            }
        }
        System.out.print(mm);
    }
}