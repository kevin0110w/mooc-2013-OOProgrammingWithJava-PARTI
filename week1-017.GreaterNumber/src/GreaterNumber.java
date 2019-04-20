import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        if (numberOne > numberTwo) {
            System.out.println("Greater number: " + numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println("Great number: " + numberTwo);
        } else {
            System.out.println("Both numbers equal!");
        }
        
    }
}
