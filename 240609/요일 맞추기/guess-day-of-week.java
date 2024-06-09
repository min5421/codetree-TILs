import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int day = 1;
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] yoil = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        if(check(m1, m2, d1, d2)){
            while(!(m1 == m2 && d1 == d2)){
                day++;
                d1++;

                if(d1 > num_of_days[m1]){
                    m1++;
                    d1 = 1;
                }
            }
        }
        else{
            while(!(m1 == m2 && d1 == d2)){
                day--;
                d1--;

                if(d1 == 0){
                    m1--;
                    d1 = num_of_days[m1];
                }
            }
            day *= -1;
        }

        System.out.println(yoil[day%7]);
    }

    public static boolean check(int m1, int m2, int d1, int d2){
        int day1 = m1*100 + d1;
        int day2 = m2*100 + d2;

        return day1 < day2;
    }
}