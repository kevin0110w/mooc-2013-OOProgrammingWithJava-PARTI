import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();
            
        while (true) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            
            if (word.isEmpty()) {
                break;
            }
        }
        for (String a:words) {
            System.out.println(a);
        }
    }
}
