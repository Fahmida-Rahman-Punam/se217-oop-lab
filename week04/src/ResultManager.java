import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    void display() {
        System.out.println("id:" + id + ",name:" + ", marks: " + marks);

    }

}

public class ResultManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("enter information for student " + (i + 1));
            System.out.print("id:");
            students[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("name:");
            students[i].name = sc.nextLine();
            System.out.print("marks:");
            students[i].marks = sc.nextDouble();
            System.out.println();
        }
        System.out.println("student information");
        for (int i = 1; i < 5; i++) {
            students[i].display();
        }
        Student topper = students[0];
        for (int i = 1; i < 5; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }
        System.out.println();
        System.out.println("top student");
        topper.display();

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += students[i].marks;
        }
        System.out.println();
        System.out.println("average marks : " + sum / 5);
        sc.close();

    }
}
