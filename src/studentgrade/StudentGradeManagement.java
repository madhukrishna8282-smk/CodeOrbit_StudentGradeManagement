package studentgrade;

import java.util.Scanner;

public class StudentGradeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100
                || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks! Enter marks from 0 to 100.");
        } else {
            double total = m1 + m2 + m3;
            double average = total / 3;

            System.out.println("\n--- Student Report ---");
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.printf("Average: %.2f%n", average);

            if (average >= 90)
                System.out.println("Grade: A");
            else if (average >= 75)
                System.out.println("Grade: B");
            else if (average >= 60)
                System.out.println("Grade: C");
            else if (average >= 40)
                System.out.println("Grade: D");
            else
                System.out.println("Grade: F");
        }

        sc.close();
    }
}
