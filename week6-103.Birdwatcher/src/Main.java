import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);    
    String command = "";
    BirdWatcher a = new BirdWatcher();
    
   do { 
      
      System.out.print("? ");
      command = s.nextLine();
    
    if (command.equals("Add")) {
        a.Add(s);
    } else if (command.equals("Observation")) {
        a.Observation(s);
    } else if (command.equals("Statistics")) {
        a.Statistics();
    } else if (command.equals("Show")) {
        a.Show(s);
    } else if (command.equals("Quit")) {
       break;
      }
     } while (true);
    }
}
