import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Number{
    int num;
    int cnt;

    public Number(int num, int cnt){
        this.num = num;
        this.cnt = cnt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] numbers = new Number[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            numbers[i] = new Number(num, i+1);
        }

        Arrays.sort(numbers, new Comparator<Number>(){
            @Override
            public int compare(Number a, Number b){
                if(a.num == b.num){
                    return a.cnt - b.cnt;
                }
                return a.num - b.num;
            }
        });

        int[] rank = new int[n];
        for(int i = 0; i < n; i++){
            rank[numbers[i].cnt-1] = i+1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(rank[i]+" ");
        }
    }
}