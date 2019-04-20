
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String password1 = reader.nextLine();
            if (password1.equals(password)) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is: shhh!");
                break;
            }
            System.out.println("Wrong.");
            
        }
    }
}
