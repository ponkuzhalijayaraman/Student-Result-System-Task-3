import java.util.Scanner;

public class StudentResultSystem {

    // Method to calculate grade
    public static char calculateGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 75)
            return 'B';
        else if (percentage >= 60)
            return 'C';
        else if (percentage >= 50)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter Student Name: ");
            String name = sc.next();

            System.out.print("Enter marks out of 100: ");
            int marks = sc.nextInt();

            // Validation
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                continue;
            }

            double percentage = marks;
            char grade = calculateGrade(percentage);

            System.out.println("\n--- Result Summary ---");
            System.out.println("Name       : " + name);
            System.out.println("Marks      : " + marks);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade      : " + grade);

            // Pass / Fail using switch
            switch (grade) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    System.out.println("Status     : PASS");
                    break;
                case 'F':
                    System.out.println("Status     : FAIL");
                    break;
            }

            System.out.print("\nDo you want to enter another student? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        sc.close();
        System.out.println("\nProgram Ended.");
    }
}
