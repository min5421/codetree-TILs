import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        boolean check = true;
        while(check){
            boolean isThere = false;
            if(a.length()-b.length() < 0){
                break;
            }
            for(int i = 0; i <= a.length()-b.length(); i++){
                for(int j = 0; j < b.length(); j++){
                    if(a.charAt(i+j) != b.charAt(j)){
                        isThere = false;
                        break;
                    }
                    else{
                        isThere = true;
                    }
                }

                if(isThere){
                    a = a.substring(0,i)+a.substring(i+b.length());
                    break;
                }
                else if(i == a.length()-b.length()){
                    check = false;
                }
            }
        }
        System.out.println(a);
    }
}