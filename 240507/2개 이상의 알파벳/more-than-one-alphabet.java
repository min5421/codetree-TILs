import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(twoMore(a)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean twoMore(String a){
        for(int i = 0; i < a.length()-1; i++){
            for(int j = i+1; j < a.length(); j++){
                if(a.charAt(i) != a.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}