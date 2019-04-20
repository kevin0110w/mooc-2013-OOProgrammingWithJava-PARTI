import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    protected int birdCount;
    protected String birdName;
    protected String latinName;
    protected Scanner s;
    
    public Bird(String name, String latinName) {
        this.birdName = name;
        this.latinName = latinName;
        this.birdCount = 0;
    }
    
//    public void Add(Scanner s, ArrayList<Bird> birdWatcher) {
//        System.out.println("Name: ");
//        String name = s.nextLine();
//        System.out.println("LatinName: ");
//        String latinName = s.nextLine();
//        Bird bird = new Bird(name, latinName);
//        birdWatcher.add(bird);
//    }
    
    public void Observation(Scanner s, ArrayList<Bird> birdWatcher) {
        System.out.println("What was observed: ?");
        String name = s.nextLine();
      for (Bird a : birdWatcher) {
          if (a.birdName.equals(name)) {
              a.birdCount++;
          } else {
            System.out.println("Is not a bird!");
        }
      }
    }
//    public void Show(Scanner s) {
//        System.out.println("What? ");
//        String name = s.nextLine();
//        for (Bird a : this.birdList) {
//            if (a.birdName.equals(name)) {
//            System.out.println(this.birdName + " (" + this.latinName + ") :" + this.birdCount + " observations");
//         }
//       }
//    }
}
