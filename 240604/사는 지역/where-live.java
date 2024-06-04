import java.util.Scanner;
import java.util.Arrays;

class Data{
    String name;
    String number;
    String area;

    public Data(String name, String number, String area){
        this.name = name;
        this.number = number;
        this.area = area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Data data[] = new Data[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String number = sc.next();
            String area = sc.next();

            data[i] = new Data(name, number, area);
        }

        int i = alphabet(data);
        System.out.println("name "+data[i].name);
        System.out.println("addr "+data[i].number);
        System.out.println("city "+data[i].area);
    }

    public static int alphabet(Data[] data){
        int n = data.length;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = data[i].name;
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(data[i].name.equals(arr[n-1])){
                return i;
            }
        }
        return 0;
    }
}