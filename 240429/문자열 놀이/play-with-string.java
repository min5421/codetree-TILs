import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt(); 
        char[] arr = s.toCharArray();

        for(int i = 0; i < q; i++){          
            int n = sc.nextInt();
            if(n == 1){
                int a = sc.nextInt()-1;
                int b = sc.nextInt()-1;

                char c = arr[a];
                arr[a] = arr[b];
                arr[b] = c;
            }
            else{
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for(int j = 0; j < s.length(); j++){
                    if(arr[j] == a){
                        arr[j] = b;
                    }
                }
            }
            s = String.valueOf(arr);
            System.out.println(s);
        }
    }
}