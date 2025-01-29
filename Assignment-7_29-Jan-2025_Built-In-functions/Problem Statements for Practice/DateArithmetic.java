import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        LocalDate inputDate = getInputDate("Enter a date in format (yyyy-MM-dd): ");
        LocalDate resultDate = addDateArithmetic(inputDate);
        System.out.println("Final result date after arithmetic: " + resultDate);
    }

    public static LocalDate getInputDate(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(input, formatter);
    }

    public static LocalDate addDateArithmetic(LocalDate date) {
        LocalDate newDate = date
                .plusDays(7)           // Adds 7 days
                .plusMonths(1)         // Adds 1 month
                .plusYears(2)          // Adds 2 years
                .minusWeeks(3);        // Subtracts 3 weeks
        
        return newDate;
    }
}
