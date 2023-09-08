import java.util.Arrays;
import java.util.Scanner;

public class Student22 {
    private String name;
    private int age;
    private int[] scores;

    public Student22(String name, int age, int[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public void changeInfo(String name, int age, int[] scores) {
        if (name != null) {
            this.name = name;
        }
        if (age != 0) {
            this.age = age;
        }
        if (scores != null) {
            this.scores = scores;
        }
    }

    public Student22 addStudent(String name, int age, int[] scores) {
        return new Student22(name, age, scores);
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Điểm trung bình: " + averageScore());
        for (int score : this.scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public double averageScore() {
        double sum = 0;
        for (int score : this.scores) {
            sum += score;
        }
        return sum / this.scores.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter age of student 1: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter number of scores for student 1: ");
        int n1 = scanner.nextInt();
        int[] scores1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter score " + (i + 1) + " for student 1: ");
            scores1[i] = scanner.nextInt();
        }

        scanner.nextLine(); // consume newline character
        System.out.print("Enter name of student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter age of student 2: ");
        int age2 = scanner.nextInt();
        System.out.print("Enter number of scores for student 2: ");
        int n2 = scanner.nextInt();
        int[] scores2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter score " + (i + 1) + " for student 2: ");
            scores2[i] = scanner.nextInt();
        }

        Student22 student1 = new Student22(name1, age1, scores1);
        Student22 student2 = new Student22(name2, age2, scores2);
        System.out.println("Sinh viên có điểm cao là: ");
        if (student1.averageScore() > student2.averageScore()) {
            student1.displayInfo();
        }else {
            student2.displayInfo();
        }
    }
}

