import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if(!check(o)){
            System.out.println("False");
        }
        else{
            System.out.println(a+" "+o+" "+c+" = "+calculate(a, o, c));
        }
    }

    public static int calculate(int a, char o, int c){
        if(o == '+'){
            return a + c;
        }
        else if(o == '-'){
            return a - c;
        }
        else if(o == '*'){
            return a * c;
        }
        else{
            return a / c;
        }
    }

    public static boolean check(char o){
        if(o == '+' || o == '-' || o == '*' || o == '/'){
            return true;
        }
        else{
            return false;
        }
    }
}