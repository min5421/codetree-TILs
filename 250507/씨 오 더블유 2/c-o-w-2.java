import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int cnt = 0;
        if(n > 2){
            for(int i = 0; i < n - 2; i++){
                for(int j = i + 1; j < n - 1; j++){
                    for(int k = j + 1; k < n; k++){
                        if(str.charAt(i) == 'C' && str.charAt(j) == 'O' && str.charAt(k) == 'W'){
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}