
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int counter = 1;
        
        while (counter <= name.length()) {
            System.out.println(counter + ". character: " + name.charAt(counter-1));
            counter++;
        }
    }
}
