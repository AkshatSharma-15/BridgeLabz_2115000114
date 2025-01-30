import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll(oldWord , newWord);
    }
}
