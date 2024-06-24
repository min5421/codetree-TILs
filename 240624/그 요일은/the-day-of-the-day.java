import java.util.Scanner;

public class Main {
    public static int numOfDays(int m1, int d1, int m2, int d2){
        int cnt = 1;
        int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(!(m1 == m2 && d1 == d2)){
            cnt++;
            d1++;

            if(d1 > num_of_days[m1]){
                d1 = 1;
                m1++;
            }
        }

        return cnt;
    }

    public static int findDay(int num, String day){
        int cnt = 0;
        String[] yoil = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for(int i = 0; i < 7; i++){
            if(day.equals(yoil[i])){
                break;
            }
            cnt++;
        }

        if(num % 7 > 0 && num % 7 >= cnt){
            return num / 7 + 1;
        }
        
        return num / 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        int num = numOfDays(m1, d1, m2, d2);
        System.out.println(findDay(num, day));
    }

}