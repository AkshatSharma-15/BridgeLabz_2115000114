import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        
    }

    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256]; 
        int maxFrequency = 0;
        char mostFrequentChar = '\0';
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
            
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch;
            }
        }
        
        return mostFrequentChar;
    }
}
