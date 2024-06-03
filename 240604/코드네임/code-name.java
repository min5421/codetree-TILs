import java.util.Scanner;

class Agent{
    char codename;
    int score;

    public Agent(char codename, int score){
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++){
            char codename = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new Agent(codename, score);
        }

        System.out.println(agents[min(agents)].codename+" "+agents[min(agents)].score);
    }

    public static int min(Agent[] agents){
        int min = agents[0].score;
        int num = 0;
        for(int i = 1; i < 5; i++){
            if(min > agents[i].score){
                min = agents[i].score;
                num = i;
            }
        }

        return num;
    }
}