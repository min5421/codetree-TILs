import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student{
    String name;
    int height; 
    int weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[5];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt(); 
            int weight = sc.nextInt();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                if(a.height == b.height){
                    return b.weight - a.weight;
                }
                return a.height - b.height;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
        }
    }
}