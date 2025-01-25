import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.println("Physics: ");
            marks[i][0] = getValidMarks(scanner);

            System.out.println("Chemistry: ");
            marks[i][1] = getValidMarks(scanner);

            System.out.println("Maths: ");
            marks[i][2] = getValidMarks(scanner);

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + percentages[i] + "\t\t" + grades[i]);
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

