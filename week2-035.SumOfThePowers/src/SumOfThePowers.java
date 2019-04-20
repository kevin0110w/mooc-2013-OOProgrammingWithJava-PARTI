
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int sum = 0;
        
        while (counter <= power) {
        sum = (int)Math.pow(2, counter) + sum;
        counter++;
        }
        System.out.println("The result is " + sum);
    }
}
