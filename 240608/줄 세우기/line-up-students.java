import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int num;
    int height; 
    int weight;

    public Student(int num, int height, int weight){
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(student.height == this.height && student.weight == this.weight){
            return this.num-student.num;
        }
        else if(student.height == this.height){
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            int num = i+1;
            int height = sc.nextInt(); 
            int weight = sc.nextInt();

            students[i] = new Student(num, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].num);
        }
    }
}