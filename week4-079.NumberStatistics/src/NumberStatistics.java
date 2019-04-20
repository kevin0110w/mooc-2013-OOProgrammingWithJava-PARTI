
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {

        this.amountOfNumbers  = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.amountOfNumbers++;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        double average = 0;
        if (amountOfNumbers > 0) {
            average = ((double)sum)/amountOfNumbers;
        } else {
            average = 0;
        }
        return average;
    }
}
