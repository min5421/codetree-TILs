import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int len = 0;

        for(int i = 0; i < 200; i++){
            String s = sc.next();

            if(s.equals("0")){
                break;
            }

            arr[i] = s;
            len++;
        }

        System.out.println(len);
        for(int i = 0; i < len; i += 2){
            System.out.println(arr[i]);
        }
    }
}