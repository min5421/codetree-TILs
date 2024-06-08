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

class Rank{
    int rank;
    int ccnt;

    public Rank(int rank, int ccnt){
        this.rank = rank;
        this.ccnt = ccnt;
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

        Rank[] rank = new Rank[n];
        for(int i = 0; i < n; i++){
            rank[i] = new Rank(numbers[i].cnt, i+1);
        }

        Arrays.sort(rank, (a, b) -> a.rank-b.rank);

        for(int i = 0; i < n; i++){
            System.out.print(rank[i].ccnt+" ");
        }
    }
}