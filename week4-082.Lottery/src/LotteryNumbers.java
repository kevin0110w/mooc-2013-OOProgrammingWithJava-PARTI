import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        
        this.random = new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int count = 1;
        while (this.numbers.size() < 7) {
        
        int number = this.random.nextInt(39) + 1;
        
        boolean alreadyDrawn = this.containsNumber(number);
        if (!alreadyDrawn) {
            this.numbers.add(number);
        }
        count++;
        }
    }
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)){
                return true;
            }
        
        
        return false;
    }
}
