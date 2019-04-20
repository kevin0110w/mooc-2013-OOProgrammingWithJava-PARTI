
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        while (!(word.isEmpty())) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }
        if (word.isEmpty()) {
            Collections.sort(words);
            for (String a:words) {
                System.out.println(a);
            }
        }
    }
}
