import java.util.Scanner;
import java.util.Arrays;

class Position implements Comparable<Position>{
    int x;
    int y;
    int num;

    public Position(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Position position){
        if(this.x < 0){
            this.x *= -1;
        }
        if(this.y < 0){
            this.y *= -1;
        }
        if(position.x < 0){
            position.x *= -1;
        }
        if(position.y < 0){
            position.y *= -1;
        }

        if((this.x+this.y) == (position.x+position.y)){
            return this.num - position.num;
        }
        return (this.x+this.y)-(position.x+position.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Position[] positions = new Position[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt(); 
            int y = sc.nextInt();

            positions[i] = new Position(x, y, i+1);
        }

        Arrays.sort(positions);

        for(int i = 0; i < n; i++){
            System.out.println(positions[i].num);
        }
    }
}