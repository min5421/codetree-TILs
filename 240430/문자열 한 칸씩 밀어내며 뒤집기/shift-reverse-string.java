import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        int len = s.length();
        
        for(int i = 0; i < q; i++){
            int n = sc.nextInt();
            
            if(n == 1){
                System.out.println(s = s.substring(1)+s.substring(0,1));
            }
            else if(n == 2){
                System.out.println(s = s.substring(len-1,len)+s.substring(0,len-1));
            }
            else{
                for(int j = len-1; j >= 0; j--){
                    System.out.print(s.charAt(j));
                }
            }
        }
    }
}