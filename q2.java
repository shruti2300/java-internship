import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[3];
    double average;
    char grade;
}

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter Marks:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            student.marks[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += student.marks[i];
        }

        student.average = total / 3.0;

        if (student.average >= 90)
            student.grade = 'A';
        else if (student.average >= 75)
            student.grade = 'B';
        else if (student.average >= 50)
            student.grade = 'C';
        else
            student.grade = 'F';

        System.out.println("\n------ Student Report ------");
        System.out.println("Name : " + student.name);

        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + " : " + student.marks[i]);
        }

        System.out.println("Average : " + student.average);
        System.out.println("Grade : " + student.grade);

        
    }
}
