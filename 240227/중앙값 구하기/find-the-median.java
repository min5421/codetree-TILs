import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid;

        if(a > b){
            if(b > c){
                mid = b;
            }
            else{
                if(a > c){
                    mid = c;
                }
                else{
                    mid = a;
                }
            }
        }

        //a<b
        else{ 
            if(a > c){
                mid = a;
            }
            else {
                if(b > c){
                    mid = c;
                }
                else{
                    mid = b;
                }
            }
        }

        System.out.println(mid);
    }
}