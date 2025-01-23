public class pens_division {
    public static void main(String[] args) {
        // Initialising variables.
        int totalPens = 14;
        int students = 3;

        // Number of pens each student will get.
        int pen = totalPens / students;

        // Remaining non-distributed pens.
        int remPens = totalPens % students;

        System.out.println("The Pen Per Student is: " + pen + " and the remaining pen not distributed is: " + remPens);
    }
}
