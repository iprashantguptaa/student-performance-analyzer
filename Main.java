import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Student Performance Analyzer");

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("How many subjects? ");
            int subjectCount = sc.nextInt();
            sc.nextLine();

            Subject[] subjects = new Subject[subjectCount];

            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter subject name: ");
                String subjectName = sc.nextLine();

                int marks;
                while (true) {
                    System.out.print("Enter marks for " + subjectName + " (0-100): ");
                    marks = sc.nextInt();
                    sc.nextLine();
                    if (marks >= 0 && marks <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid marks! Please enter between 0 and 100.");
                    }
                }

                subjects[j] = new Subject(subjectName, marks);
            }

            students[i] = new Student(name, rollNo, subjects);
        }

        System.out.println("\n***** Student Performance Report *****");
        for (int i = 0; i < students.length; i++) {
            students[i].displayReport();
        }

        sc.close();
    }
}

