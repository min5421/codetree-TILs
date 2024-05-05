import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] n1 = new int [a];
        int[] n2 = new int [b];

        for(int i = 0; i < a; i++){
            n1[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            n2[i] = sc.nextInt();
        }
        
        if(isit(n1, n2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isit(int[] n1, int[] n2){
        for(int i = 0; i < n1.length; i++){
            for(int j = 0; j < n2.length; j++){
                if(n1[i+j] != n2[j]){
                    break;
                }
                if(j == n2.length - 1){
                    return true;
                }
            }
        }
        return false;
    }
}