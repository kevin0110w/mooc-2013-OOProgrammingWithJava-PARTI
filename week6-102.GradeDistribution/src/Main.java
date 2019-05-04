import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Results r = new Results(s);
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            Integer score = Integer.parseInt(s.nextLine());
            if (score == -1) {
                break;
            } else {
            r.addGrade(score);
            }
        }
        r.printResults();
    }
}
