import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];

        int cnt = 0;
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(startString(str, t)){
                arr[cnt] = str;
                cnt++;
            }
        }

        Arrays.sort(arr, 0, cnt);
        System.out.println(arr[k-1]);
    }

    public static boolean startString(String s, String t){
        if(s.length() >= t.length()){
            for(int i = 0; i < t.length(); i++){
                if(s.charAt(i) != t.charAt(i)){
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}