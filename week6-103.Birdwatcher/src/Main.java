import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner s = new Scanner(System.in);    
    String command = "";
    BirdWatcher a = new BirdWatcher();
    
   do { 
      
      System.out.println("?");
      command = s.nextLine();
    
    if (command.equals("Add")) {
        a.Add(s);
//    } else if (command.equals("Observation")) {
//        a.Observation(s);
    } else if (command.equals("Stastics")) {
        a.Statistics();
//    } else if (command.equals("Show")) {
//        a.Show(s);
    } else if (command.equals("Quit")) {
       break;
      }
     } while (true);
    }
}
