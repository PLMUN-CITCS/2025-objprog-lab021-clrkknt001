package OOB;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		
		String sentence = getSentenceInput();
        String arr[] = countWords(sentence);
        System.out.println("The sentence has " + arr.length + " words.");

	}
	static String getSentenceInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String sentence = s.nextLine();
		return sentence;
	}
	
	static String[] countWords(String sentence) {
		String arr[] = sentence.split(" ");
		return arr;
	}
	
}
