import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        boolean check = false;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);

        for(int i = 0; i < 10; i++){
            if(arr[i].charAt(arr[i].length()-1) == c){
                check = true;
                System.out.println(arr[i]);
            }
        }

        if(!check){
            System.out.println("None");
        }
    }
}