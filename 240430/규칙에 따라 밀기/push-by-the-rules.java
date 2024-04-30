import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String s = sc.next();
        int Alen = A.length();
        int slen = s.length();
        
        for(int i = 0; i < slen; i++){
            if(s.charAt(i) == 'L'){
                A = A.substring(1)+A.substring(0,1);
            }
            else{
                A = A.substring(Alen-1,Alen)+A.substring(0,Alen-1);
            }
        }

        System.out.println(A);
    }
}