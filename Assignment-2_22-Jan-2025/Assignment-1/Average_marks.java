public class Average_marks {
    public static void main(String[] args) {
        //Marks scored in PCM.

        int maths  = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculating sum of marks of all subjects.
        int sum = maths + physics + chemistry;

        // Calculate average percentage.
        float percent = (sum * 100) / 300;

        System.out.println("Average percentage of Sam is: " + percent);
    }
}
