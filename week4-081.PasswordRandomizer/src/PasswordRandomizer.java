import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
        private int stringLength;
        private Random random = new Random();
   

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.stringLength = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String str = "abcdefghijklmnopqrstuvwxyz";
        String newWord = "";
        int counter = 1;
        while (counter <= this.stringLength) {
            newWord = newWord + str.charAt(random.nextInt(26));
            counter++;
    }
        return newWord;
}
}
