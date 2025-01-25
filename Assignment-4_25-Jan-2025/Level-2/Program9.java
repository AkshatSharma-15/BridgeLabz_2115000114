import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3]; // 3 columns for Physics, Chemistry, Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.println(subject + ": ");
                marks[i][j] = getValidMarks(sc);
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" 
                               + String.format("%.2f", percentages[i]) + "\t\t" + grades[i]);
        }
    }

    private static int getValidMarks(Scanner scanner) {
        int mark = scanner.nextInt();
        while (mark < 0 || mark > 100) {
            System.out.println("Invalid mark! Please enter a positive value (0-100): ");
            mark = scanner.nextInt();
        }
        return mark;
    }

    private static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "E (Level 1-, too below agency-normalized standards)";
        } else {
            return "R (Remedial standards)";
        }
    }
}

