import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate if the age is negative
        if (age < 0) {
            return false; // Negative age is invalid for voting
        }
        // Check if the age is 18 or greater
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Array to store the ages of 10 students
        int[] studentAges = new int[10];
        
        // Loop to take input for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            
            // Check if the student can vote and display the result
            if (voteChecker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
