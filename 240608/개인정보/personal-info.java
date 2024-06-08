import java.util.Scanner;
import java.util.Arrays;

class Student{
    String name;
    int height; 
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt(); 
            double weight = sc.nextDouble();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.print(students[i].name + " " + students[i].height);
            System.out.printf(" %.1f\n", students[i].weight);
        }

        System.out.println();

        Arrays.sort(students, (a, b) -> b.height-a.height);
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.print(students[i].name + " " + students[i].height);
            System.out.printf(" %.1f\n", students[i].weight);
        }
    }
}