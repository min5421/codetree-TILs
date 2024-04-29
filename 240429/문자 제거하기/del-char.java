import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = s.length()-1;
        
        while(cnt != 0){
            char[] arr = s.toCharArray();
            int a = sc.nextInt();
        
            for(int i = a; i < arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[cnt]= ' ';
            cnt--;

            s = String.valueOf(arr);
            System.out.println(s);
        }
    }
}