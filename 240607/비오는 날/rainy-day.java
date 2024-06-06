import java.util.Scanner;
import java.util.Arrays;

class Data{
    int year;
    int month;
    int day;
    String day_of_week;
    String weather;

    public Data(String date, String day_of_week, String weather){
        String[] dateArr = date.split("-");
        year = Integer.valueOf(dateArr[0]);
        month = Integer.valueOf(dateArr[1]);
        day = Integer.valueOf(dateArr[2]);
        this.day_of_week = day_of_week;
        this.weather = weather;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] data = new Data[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String date = sc.next();
            String day_of_week = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain")){
                data[cnt] = new Data(date, day_of_week, weather);
                cnt++;
            }
        }
 
        Data rain = data[findNearDay(data, cnt)];
        
        String month0 = "";
        String day0 = "";
        if(rain.month < 10){
            month0 = "0";
        }
        if(rain.day < 10){
            day0 = "0";
        }

        System.out.println(rain.year+"-"+month0+rain.month+"-"+rain.day+" "+rain.day_of_week+" "+rain.weather);
    }

    public static int findNearDay(Data[] data, int cnt){
        int year = data[0].year;
        int month = data[0].month;
        int day = data[0].day;
        int num = 0;

        for(int i = 1; i < cnt; i++){
            if(year < data[i].year){
                break;
            }
            else if(year == data[i].year && month < data[i].month){
                break;
            }
            else if(year == data[i].year && month == data[i].month && day < data[i].day){
                break;
            }

            year = data[i].year;
            month = data[i].month;
            day = data[i].day;

            num = i;
        }

        return num;
    }
}