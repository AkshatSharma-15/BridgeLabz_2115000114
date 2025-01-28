import java.util.Arrays;

public class RandomValues {

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Find the average, minimum, and maximum values of the array
        double[] results = findAverageMinMax(randomNumbers);
        
        // Output the random numbers, average, minimum, and maximum values
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + (int) results[1]);
        System.out.println("Maximum value: " + (int) results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999 (inclusive)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] results = new double[3]; // [average, min, max]
        
        double sum = 0;
        int minValue = numbers[0];
        int maxValue = numbers[0];
        
        // Calculate sum, min, and max values
        for (int number : numbers) {
            sum += number;
            minValue = Math.min(minValue, number);
            maxValue = Math.max(maxValue, number);
        }
        
        // Store the average, min, and max in the results array
        results[0] = sum / numbers.length;  
        results[1] = minValue;              
        results[2] = maxValue;              
        
        return results;
    }
}
