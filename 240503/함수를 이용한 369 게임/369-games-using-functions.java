import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(number(i) || triple(i)){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }

    public static boolean number(int i){
        String s = Integer.toString(i);
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if(c == '3' || c == '6' || c == '9'){
                return true;
            }
        }
        return false;
    }

    public static boolean triple(int i){
        return i % 3 == 0;
    }
}