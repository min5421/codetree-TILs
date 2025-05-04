import java.util.Scanner;
public class Main {

    static String changeNum(String a, int i){
        if(a.charAt(i) == 1){
            return a.substring(0, i) + "0"  + a.substring(i+1);
        }
        else{
            return a.substring(0, i) + "1"  + a.substring(i+1);
        }
    }

    static int twoToTen(String num){
        int result = 0;
        for(int i = 0; i < num.length(); i++){
            result += (int)(num.charAt(num.length()-i-1)-48) * (int)Math.pow(2, i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length(); i++){
            String num = changeNum(a, i);
            max = Math.max(twoToTen(num), max);
        }

        System.out.println(max);
    }

    
}