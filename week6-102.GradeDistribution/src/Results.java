import java.util.Scanner;
/**
 *
 * @author kevin0110w
 */
public class Results {
    private Scanner s;
    private int[] grades;
    private int acceptedgrades;
    private int totalgrades;
    
    public Results(Scanner s) {
        this.s = s;
        this.grades = new int[6];
        this.acceptedgrades = 0;
        this.totalgrades = 0;
    }
    
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 29) {
            this.grades[0]++;
            this.totalgrades++;
        } else if (grade >= 30 && grade <= 34) {
            this.grades[1]++;
            this.acceptedgrades++;
            this.totalgrades++;
        } else if (grade >= 35 && grade <= 39) {
            this.grades[2]++;
            this.acceptedgrades++;
            this.totalgrades++;
        } else if (grade >= 40 && grade <= 44) {
            this.grades[3]++;
            this.acceptedgrades++;
            this.totalgrades++;
        } else if (grade >= 45 && grade <= 49) {
            this.grades[4]++;
            this.acceptedgrades++;
            this.totalgrades++;
        } else if (grade >= 50 && grade <= 60) {
            this.grades[5]++;
            this.acceptedgrades++;
            this.totalgrades++;
        }
        
    }
    
    public void printResults() {
        String line = "";
        String stars = "";

        System.out.println("Grade distribution:");
        for (int i = this.grades.length-1; i >= 0; i--) {
            line = line + i + ": ";
            for (int j = 0; j < this.grades[i]; j++) {             
                stars += "*";
                line = line + stars;
                stars = "";
            }
              line = line + "\n";
        }
        System.out.print(line);
        double accepted = 0.0;       
        System.out.println(this.acceptedgrades);
        System.out.println(this.totalgrades);
        if (this.totalgrades > 0) {
        accepted = this.acceptedgrades *100.0 /this.totalgrades ;
        } else {
            accepted = 0;
        }
        System.out.println("Acceptance percentage: " + accepted);
        }
    }

